package pages;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SearchPageResult {

    WebDriver driver;
    WebElement element;
    Utilities utilities = new Utilities(driver);

    @FindBy(xpath="//body/div[@id='header__wrapper']/div[@id='header__inner']/nav[@id='nav']/div[1]/div[2]/ul[1]/li[2]/a[1]")
    WebElement WorldClock;

    @FindBy(xpath="//header/div[2]/div[1]/section[1]/img[1]")
    WebElement Rishon;

    @FindBy(xpath="//span[@id='clk_hm']")
    WebElement clock;

    @FindBy(xpath="//body/div[6]/main[1]/article[1]/section[1]/div[3]/a[1]/img[1]")
    WebElement FlagMap;

    @FindBy(xpath="//div[contains(text(),'12 °C')]")
    WebElement Temperatura;

    @FindBy(xpath="//body")
    WebElement TemNow;

    @FindBy(xpath="//td[contains(text(),'1019 mbar')]")
    WebElement Pressure;

    public SearchPageResult(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement searchWorldClock(){

        return WorldClock;
    }
    public WebElement searchRishon(){

        return Rishon;
    }
    public WebElement searchMap(){

        return FlagMap;
    }
    public WebElement searchTemp(){


        return Temperatura;
    }

    public WebElement searchToClock(){

        return clock;
    }


    public WebElement searchNuber(){

        return TemNow;
    }
    public WebElement searchPressure(){

        return Pressure;
    }



}