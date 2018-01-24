package acamica;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(id = "searchLanguage")
    private WebElement searchLanguage;

    @FindBy(xpath = "/html/body/div[2]/form/fieldset/button")
    private WebElement searchBtn;

    public void go(WebDriver driver){
        driver.get("http://wikipedia.org");
    }

    public void search(String query, String language){
        searchInput.sendKeys(query);
        searchLanguage.sendKeys(language);
        searchBtn.click();
    }
}
