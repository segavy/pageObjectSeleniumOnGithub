import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class StartPageTest {

    private WebDriver driver;
    private StartPage startPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sergey\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://github.com/");
        driver.manage().window().maximize();
        startPage = new StartPage(driver);
    }

    @Test
    //public void Test() {
    //some code here
    //}

    @After
    public void tearDown() {
        driver.quit();
    }



}
