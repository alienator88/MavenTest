import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {

        WebDriver driver = new ChromeDriver();

        @Test(priority = 1)
        public void test() {
            driver.get("https://google.com");
            Assert.assertEquals(driver.getTitle(), "Google");
            System.out.println("Title Matches");
            driver.quit();
        }

        @Test(priority = 2)
        public void test2() {
            System.out.println("Test2 Done");
        }

        @Test(priority = 3)
        public void teardown() {
            System.out.println("Closing");
        }
    }

