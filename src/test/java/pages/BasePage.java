package pages;
import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;

public class BasePage {

    public WebDriver driver;
    public String browserName;
    private String baseUrl;
    public HomePage homePage;
    public SearchPageResult searchPage;
    public Utilities utilities;
//    public BasePage(String browserName) {
//        this.browserName = browserName;
//
//        if (browserName.equalsIgnoreCase("chrome"))
//            this.driver = new ChromeDriver();
//
//        if (browserName.equalsIgnoreCase("firefox"))
//            this.driver = new EdgeDriver();}
//

    @BeforeTest


    public void setUp(){
 //       if(browser.equalsIgnoreCase("chrome")) {
            baseUrl = "https://www.timeanddate.com/weather/";



            System.setProperty("webdriver.chrome.driver", "C:\\Users\\bgris\\IdeaProjects\\driverChrom\\chromedriver.exe");
            driver = new ChromeDriver();
            homePage = new HomePage(driver);
            searchPage = new SearchPageResult(driver);
            utilities = new Utilities(driver);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.get(baseUrl);
            String title = driver.getTitle();
            System.out.println("It will be executed first");
//        }else if(browser.equalsIgnoreCase("Edge")){
////            System.setProperty("webdriver.chrome.driver", "C:\\Users\\bgris\\IdeaProjects\\driverChrom\\chromedriver.exe");
////            driver = new EdgeDriver();
//        }

    }


    @AfterTest
    public void tearDown() throws IOException {
        driver.quit();
        driver.close();
    }
}