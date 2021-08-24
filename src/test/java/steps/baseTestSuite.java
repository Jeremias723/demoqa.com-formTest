package steps;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.indexPage;
import java.util.concurrent.TimeUnit;

public class baseTestSuite {

    WebDriver driver;
    indexPage indexPage;

    @Before
    public void openDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/webdriver/chrome/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("marionette",false);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        inicializarPaginas(driver);
    }

    @After
    public void closeDriver(){
        driver.close();
    }

    private void inicializarPaginas(WebDriver driver) {
        indexPage = new indexPage(driver);
    }
}
