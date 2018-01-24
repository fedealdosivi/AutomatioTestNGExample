package acamica;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWikipedia {

    WebDriver driver;

    @BeforeMethod
    public void before(){
        driver=new FirefoxDriver();
    }

    @AfterMethod
    public void after(){
        driver.quit();
    }

    @Test(timeOut = 10000)
    public void wikipediaSearch(){
        HomePage homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.go(driver);
        homePage.search("UTN","Español");
    }
}
