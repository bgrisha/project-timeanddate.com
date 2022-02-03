package pages;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    WebElement element;
    Utilities utilities = new Utilities(driver);

    @FindBy(xpath = "//header/div[2]/div[1]/form[1]/input[1]")


    WebElement searchInput;
    //WebElement searchSubmit;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void searchInput(String Item){
        searchInput.sendKeys(Item);
        searchInput.submit();
    }
    public void searchSubmit(){

        searchInput.submit();
    }
}