/*
package BrokenLinks.Pages;

import Login.Pages.Login_Page;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.*;

public class AfterLoginBrokenURLs_Test extends StartupCode {
    Login_Page login;

    BrokenLinks brokenLinks = new BrokenLinks();

    @BeforeClass
    @Step("Launch browser and initialize test")
    public void setup() throws InterruptedException {
        AllureEnvWriter.createEnvFile();
        driver = setup1();
        login = new Login_Page(driver);

        Logs.info(test, "✅ Browser launched and test initialized: AfterLoginBrokenURLs_Test");
    }

    @Test(priority = 1, description = "Validate Login Page URLs")
    @Severity(SeverityLevel.CRITICAL)
    @Story("1. Validate login Page URLs")
    @Description("Validates Login Page for broken URLs")
    public void Login() throws InterruptedException {
        login.enterEmail(Config.get("email"));
        login.enterPassword(Config.get("password"));
        login.clickSignIn();

    }


    @Test(priority = 2, description = "Validate Profile Page URLs")
    @Severity(SeverityLevel.NORMAL)
    @Story("4. Validate Profile Page URLs")
    @Description("Validates Profile Page for broken URLs")
    public void ProfileURLs() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:r2:']")).click();
        driver.findElement(By.xpath("//a[@href='/profile']")).click();
        brokenLinks.Brokenlink();
    }

    @Test(priority = 3, description = "Validate Profile Page URLs")
    @Severity(SeverityLevel.NORMAL)
    @Story("4. Validate Profile Page URLs")
    @Description("Validates Profile Page for broken URLs")
    public void DashbaordURLs() throws InterruptedException {
        driver.get(Config.get("base.url") + "/dashboard");
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
