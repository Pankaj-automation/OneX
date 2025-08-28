/*
package Responsive_Testing;

import io.qameta.allure.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.AllureEnvWriter;
import utilities.Config;
import utilities.Logs;
import utilities.StartupCode;

import java.io.IOException;

import static utilities.Screenshot.tearDown1;

public class Website_Test extends StartupCode {
    ResponsiveCode responsive = new ResponsiveCode(driver);

    @BeforeClass
    @Step("Launch browser and initialize test")
    public void setup() throws InterruptedException {
        AllureEnvWriter.createEnvFile();
        driver = setup1(); // WebDriver initialized in parent class

        responsive = new ResponsiveCode(driver); // ✅ Initialize the object here

        Logs.info(test, "✅ Browser launched and test initialized: BeforeLoginBrokenURLs_Test");
    }

    @Test(priority = 1, description = "Validate Login page URLs")
    @Severity(SeverityLevel.CRITICAL)
    @Story("1. Validate login page URLs")
    @Description("Validates Login page for broken URLs")
    public void LoginPage() throws InterruptedException, IOException {
        Thread.sleep(1000);
        driver.get(Config.get("base.url") + "/signup");
        responsive.Dimensions("ResponsiveTest", test, driver, "HomePage", "Responsive Test for Home Page");

    }

    @AfterMethod
    public void takescreenshot(ITestResult result) throws IOException {
        tearDown1(result);

    }

    @AfterClass
    public void teardown() {
        finalizeReport();
        quitDriver();
    }

}



*/
