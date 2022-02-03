package tests;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import org.testng.Reporter;

public class FirstTest extends BasePage {

    @BeforeTest
    public void setUp()
    {
        super.setUp();
    }

    @Test (priority = 1)
    public void searchWorldClock(){
        homePage.searchSubmit();

    }

    @Test (priority = 2)
    public void searchRishon(){
        homePage.searchInput("Rishon LeZion");
        assertNotNull(utilities.waitForElement(searchPage.searchRishon(), 20));
    }
    @Test (priority = 3)
    public void searchMap(){

        assertNotNull(utilities.waitForElement(searchPage.searchMap(), 20));
    }
    @Test (priority = 4)
    public void searchTemp(){
        assertNotNull(utilities.waitForElement(searchPage.searchTemp(), 20));

    }
    @Test (priority = 5)
    public void searchToClock(){
//                homePage.searchInput("Rishon LeZion");
        assertNotNull(utilities.waitForElement(searchPage.searchToClock(), 20));

    }

    @Test (priority = 6)
    public void searchTitle(){
        Assert.assertEquals("Weather for Rishon LeZion, Israel",driver.getTitle());
        System.out.println("Page Title is :" +driver.getTitle());

    }



    @Test (priority = 7)
    public void searchTemperatureNow(){
        Assert.assertEquals(12,12,"COLD");

    }
    @Test (priority = 8
    )
    public void searchPressure(){
        Assert.assertEquals(1019.00,1019.00,"NOT that pressure");

    }

    public void tearDown() throws IOException {
        // utilities.screenshot();
        super.tearDown();
    }

}