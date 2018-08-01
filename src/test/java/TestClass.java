import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void stackOverFlowTest() {
        driver.get("https://stackoverflow.com/questions/12957635/sql-query-to-insert-datetime-in-sql-server");
    }

    @Test
    public void pnTest() {
        driver.get("https://pn.com.ua/");
    }

    @Test
    public void pnTest7() {
        driver.get("https://pn.com.ua/");
    }

    @Test
    public void pnTest6() {
        driver.get("https://pn.com.ua/");
    }

    @Test
    public void pnTest1() {
        driver.get("https://pn.com.ua/");
    }

    @Test
    public void pnTest2() {
        driver.get("https://pn.com.ua/");
    }

    @Test
    public void pnTest3() {
        driver.get("https://pn.com.ua/");
    }

    @Test
    public void pnTest4() {
        driver.get("https://pn.com.ua/");
    }

    @Test
    public void pnTest5() {
        driver.get("https://pn.com.ua/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
