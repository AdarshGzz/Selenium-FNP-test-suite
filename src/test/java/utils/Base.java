package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class Base {

    public static WebDriver driver;
    public static FileInputStream file;
    public static Properties prop;

    public void loadProperties() throws IOException {
        String propertiesPath = System.getProperty("user.dir") + "/config/browser.properties";
        try {
            file = new FileInputStream(propertiesPath);
            prop = new Properties();
            prop.load(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }

    public void openBrowser() {

        try {
            loadProperties();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
   
    		ChromeOptions opt = new ChromeOptions();
    		opt.addArguments("--disable-notifications");
    		opt.addArguments("--start-maximized");
    		
    		driver = new ChromeDriver(opt);
    		driver.get(prop.getProperty("url"));
    		
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Dont remove the listener Object

        WebDriverListener listener = new EventHandler();
        driver = new EventFiringDecorator<>(listener).decorate(driver);

    }
     // Function to delete the previous reports, screenshots,and logs
    public static void cleanPreviousTestArtifacts() {
        String userDir = System.getProperty("user.dir");
        String[] folders = {"screenshots", "reports", "logs"};
        for (String folderName : folders) {
            Path dir = Paths.get(userDir, folderName);
            if (Files.exists(dir) && Files.isDirectory(dir)) {
                try {
                    Files.walk(dir)
                        .filter(Files::isRegularFile)
                        .forEach(path -> {
                            try {
                                Files.delete(path);
                            } catch (IOException e) {
                                System.err.println("Failed to delete file: " + path + " - " + e.getMessage());
                            }
                        });
                } catch (IOException e) {
                    System.err.println("Failed to clean directory: " + dir + " - " + e.getMessage());
                }
            }
        }
    }
}
