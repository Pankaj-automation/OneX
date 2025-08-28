/*
package BrokenLinks.Pages;

import io.qameta.allure.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.AllureEnvWriter;
import utilities.BrokenLinks;
import utilities.Logs;
import utilities.StartupCode;

public class BeforeLoginBrokenImage_Test extends StartupCode {
    BrokenLinks brokenLinks = new BrokenLinks();

    @BeforeClass
    @Step("Launch browser and initialize test")
    public void setup() throws InterruptedException {
        AllureEnvWriter.createEnvFile();
        driver = setup1();

        Logs.info(test, "Browser launched and test initialized: BeforeLoginBrokenImage_Test");
    }

    @Test(priority = 1, description = "Validate Login page Images")
    @Severity(SeverityLevel.CRITICAL)
    @Story("1. Validate login page Images")
    @Description("Validates Login page for broken Images")
    public void LoginImages() throws InterruptedException {
        driver.get("https://app2.dazhboards.com/login");
        brokenLinks.BrokenImage();
    }

    @Test(priority = 2, description = "Validate Signup page Images")
    @Severity(SeverityLevel.NORMAL)
    @Story("2. Validate signup page Images")
    @Description("Validates Signup page for broken Images")
    public void SignupImages() throws InterruptedException {
        driver.get("https://app2.dazhboards.com/signup");
        brokenLinks.BrokenImage();

    }

    @Test(priority = 3, description = "Validate Forgot Password page Images")
    @Severity(SeverityLevel.NORMAL)
    @Story("3. Validate forgot password page Images")
    @Description("Validates Forgot Password page for broken Images")
    public void forgotpasswordImages() throws InterruptedException {
        driver.get("https://app2.dazhboards.com/forgotpassword");
        brokenLinks.BrokenImage();

    }

    @Test(priority = 4, description = "Validate Privacy Policy page Images")
    @Severity(SeverityLevel.MINOR)
    @Story("4. Validate Privacy Policy page Images")
    @Description("Validates Privacy Policy page for broken Images")
    public void PrivacyPolicyImages() throws InterruptedException {
        driver.get("https://dazhboards.com/privacy-policy/");
        brokenLinks.Brokenlink();

    }

    @Test(priority = 5, description = "Validate Terms and Conditions page Images")
    @Severity(SeverityLevel.MINOR)
    @Story("5. Validate Terms and Conditions page Images")
    @Description("Validates Terms and Conditions page for broken Images")
    public void TermsandConditionsImages() throws InterruptedException {
        driver.get("https://dazhboards.com/terms-and-conditions/");
        brokenLinks.Brokenlink();

    }

    @AfterClass
    @Step("Close browser and finalize report")
    public void teardown() {
        finalizeReport();
        quitDriver();
    }
}


*/
