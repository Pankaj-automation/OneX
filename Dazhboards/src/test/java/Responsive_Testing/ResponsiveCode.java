/*
package Responsive_Testing;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.qameta.allure.Allure;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utilities.Logs;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ResponsiveCode {
    WebDriver driver;

    public ResponsiveCode(WebDriver driver) {
        this.driver = driver;
    }

    */
/**
 * Captures a full-page screenshot using AShot and saves to disk
 *//*

    public static String takeFullPageScreenshot(WebDriver driver, String fileName) throws IOException {
        String screenshotDir = System.getProperty("user.dir") + File.separator + "screenshots";
        new File(screenshotDir).mkdirs();

        String fullPath = screenshotDir + File.separator + fileName + ".png";

        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(driver);

        ImageIO.write(screenshot.getImage(), "PNG", new File(fullPath));

        return fullPath;
    }


    public List<String> Dimensions(String methodName, ExtentTest test, WebDriver driver, String label, String message)
            throws IOException, InterruptedException {

        Dimension[] sizes = {
                new Dimension(1440, 900),  // Desktop
                new Dimension(375, 812)    // iPhone X
        };

        List<String> screenshotPaths = new ArrayList<>();

        for (Dimension size : sizes) {
            driver.manage().window().setSize(size);
            System.out.println("✅ Testing on resolution: " + size);
            Thread.sleep(3000);

            new WebDriverWait(driver, Duration.ofSeconds(15))
                    .until(webDriver -> ((JavascriptExecutor) webDriver)
                            .executeScript("return document.readyState").equals("complete"));

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");

            try {
                // Capture full-page screenshot
                String screenshotPath = takeFullPageScreenshot(driver, label + "_" + size.getWidth() + "x" + size.getHeight());
                screenshotPaths.add(screenshotPath);

                // Attach to Extent Report
                test.pass("📷 Screenshot at resolution: " + size,
                        MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());

                // Attach to Allure
                File screenshotFile = new File(screenshotPath);
                Allure.step(message + " (" + size.getWidth() + "x" + size.getHeight() + ")", () -> {
                    Allure.addAttachment("Screenshot", "image/png", new FileInputStream(screenshotFile), ".png");
                });

                Logs.info(test, "📸 Screenshot saved: " + screenshotPath);

            } catch (IOException e) {
                Logs.warn(driver, test, "⚠️ Failed to capture screenshot at resolution " + size + ": " + e.getMessage());
            }
        }

        return screenshotPaths;
    }
}
*/
