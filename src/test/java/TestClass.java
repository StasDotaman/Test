import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {


    @Test
    public void pnTest(){
        WebDriver driver ;
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://stackoverflow.com/questions/12957635/sql-query-to-insert-datetime-in-sql-server");
        driver.quit();
    }
}
