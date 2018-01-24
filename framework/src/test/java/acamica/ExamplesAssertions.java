package acamica;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExamplesAssertions {

    WebDriver driver;

    @Test//Strings do match
    public void testCaseVerifyHomePage(){
        driver=new FirefoxDriver();
        driver.navigate().to("http://google.com");
        Assert.assertEquals("Google",driver.getTitle());
    }

    @Test//Strings dont match
    public void testCaseVerifyHomePageFail(){
        driver=new FirefoxDriver();
        driver.navigate().to("http://google.com");
        Assert.assertEquals("Goooogle",driver.getTitle());
    }

}
