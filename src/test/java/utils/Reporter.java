package utils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;
public class Reporter extends Base{
    public static ExtentReports extent;
    public static ExtentTest test;
    public static ExtentReports initReport(String filename) {
        ExtentSparkReporter spark = new ExtentSparkReporter("reports/" + filename + ".html");
        spark.config().setTheme(Theme.STANDARD);
        extent = new ExtentReports();
        extent.attachReporter(spark);
        return extent;
    }
    public static ExtentTest startTest(String testname) {
        test = extent.createTest(testname);
        return test;
    }
    public static void logInfo(String message) {
        test.log(Status.INFO, message);
    }
    public static void logPass(String message) {
        test.log(Status.PASS, message);
    }
    public static void logFail(String message) {
        test.log(Status.FAIL, message);
    }
    public static void logWarn(String message) {
        test.log(Status.WARNING, message);
    }
    public static TakesScreenshot ts;
    public static String captureScreenShot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        String destPath =  "./"+name;
        ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        // Create the screenshots directory if it doesn't exist
        File screenshotsDir = new File(System.getProperty("user.dir") + "/reports");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
           LoggerHandler.error(e.getMessage());
        }
        return destPath;
    }
    public static void attachScreenshotToReport(String filename, ExtentTest test, String description) {
        try {
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(filename)).build());
        } catch (Exception e) {
            LoggerHandler.error(e.getMessage());
        }
 
    }
    public static void flushReport() {
        extent.flush();
    }
}