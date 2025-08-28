/*
package BrokenLinks.Pages;

import io.qameta.allure.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.*;

public class BeforeLoginBrokenURLs_Test extends StartupCode {
    BrokenLinks brokenLinks = new BrokenLinks();

    @BeforeClass
    @Step("Launch browser and initialize test")
    public void setup() throws InterruptedException {
        AllureEnvWriter.createEnvFile();
        driver = setup1();
        Logs.info(test, "✅ Browser launched and test initialized: BeforeLoginBrokenURLs_Test");
    }

    @Test(priority = 1, description = "Validate Login page URLs")
    @Severity(SeverityLevel.CRITICAL)
    @Story("1. Validate login page URLs")
    @Description("Validates Login page for broken URLs")
    public void LoginURLs() throws InterruptedException {
        driver.get(Config.get("base.url") + "/login");
        brokenLinks.Brokenlink();
    }

    @Test(priority = 2, description = "Validate Signup page URLs")
    @Severity(SeverityLevel.NORMAL)
    @Story("2. Validate signup page URLs")
    @Description("Validates Signup page for broken URLs")
    public void SignupURLs() throws InterruptedException {
        driver.get(Config.get("base.url") + "/signup");
        brokenLinks.Brokenlink();

    }

    @Test(priority = 3, description = "Validate Forgot Password page URLs")
    @Severity(SeverityLevel.NORMAL)
    @Story("3. Validate forgot password page URLs")
    @Description("Validates Forgot Password page for broken URLs")
    public void forgotpasswordURLs() throws InterruptedException {
        driver.get(Config.get("base.url") + "/forgotpassword");
        brokenLinks.Brokenlink();

    }

    @Test(priority = 4, description = "Validate Privacy Policy page URLs")
    @Severity(SeverityLevel.MINOR)
    @Story("4. Validate Privacy Policy page URLs")
    @Description("Validates Privacy Policy page for broken URLs")
    public void PrivacyPolicyURLs() throws InterruptedException {
        driver.get(Config.get("base.url") + "/privacy-policy/");

        brokenLinks.Brokenlink();

    }

    @Test(priority = 5, description = "Validate Terms and Conditions page URLs")
    @Severity(SeverityLevel.MINOR)
    @Story("5. Validate Terms and Conditions page URLs")
    @Description("Validates Terms and Conditions page for broken URLs")
    public void TermsandConditionsURLs() throws InterruptedException {
        driver.get(Config.get("base.url") + "/terms-and-conditions/");
        brokenLinks.Brokenlink();

    }


    @AfterClass
    @Severity(SeverityLevel.MINOR)
    @Story("EndingStep:Close browser and finalize report")
    @Description("Close browser and finalize report")
    public void teardown() {
        finalizeReport();
        quitDriver();
    }
}

*/
