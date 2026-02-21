package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Screenshot extends Base {

	
    public static String snapScreenshot(String fileName) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String filename = fileName + "_" + timestamp + ".png";

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty("user.dir"), "screenshots");

        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }

        File destinationFile = new File(screenshotsDir, filename);
        try {
            Files.copy(screenshotFile, destinationFile);
            return destinationFile.getAbsolutePath();
        } catch (IOException e) {
            LoggerHandler.error("Failed to save screenshot: " + e.getMessage());
            LoggerHandler.error(e.getMessage());
            Reporter.logWarn("Failed to save screenshot: " + e.getMessage());
            Reporter.logWarn(e.getMessage());
            return null;
        }
    }
}






