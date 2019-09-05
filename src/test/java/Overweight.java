import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Overweight {
        public static final String URL = "https://healthunify.com/bmicalculator/";

        @Test
        public void OverweightCategoryTest() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get(URL);
            driver.findElement(By.name("wg")).sendKeys("120");
            driver.findElement(By.name("ht")).sendKeys("200");
            driver.findElement(By.name("cc")).click();
            String category = driver.findElementByName("desc").getAttribute("value");
            assertEquals("Your category is Overweight", category);
           driver.quit();
        }

}
