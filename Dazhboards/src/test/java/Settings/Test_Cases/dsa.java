/*
package Settings.Test_Cases;

import Login.Pages.Login_Page;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.AllureEnvWriter;
import utilities.Logs;
import utilities.StartupCode;


@Epic("Login")
@Feature("Required Field Alerts")
public class dsa extends StartupCode {
    Login_Page login;

    @BeforeClass
    @Step("Launch browser")
    public void setup() throws InterruptedException {
        AllureEnvWriter.createEnvFile();
        driver = setup1();
        login = new Login_Page(driver);
        Logs.info(test, "Started Login_Required_Field_Alerts_Test");
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login with various credentials")
    @Description("Test login with different email/password combinations")
    public void click() {
        login.enterEmail("pnkj@yopmail.com");
        login.enterPassword("Admine51%%!");
        login.clickSignIn();
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login with various credentials")
    @Description("Test login with different email/password combinations")
    public void Scroll() {
        WebElement sidebar = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[11]/div[1]/button[1]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 300;", sidebar);
        sidebar.click();
        driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();


    }


}
*/
