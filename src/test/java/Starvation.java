import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Starvation {
    public static final String URL = "https://healthunify.com/bmicalculator/";
    @Test
    public void StarvationCategoryTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.findElementByName("wg").sendKeys("30");
        driver.findElementByName("ht").sendKeys("200");
        driver.findElementByName("cc").click();
        String category = driver.findElementByName("desc").getAttribute("value");
        assertEquals("Your category is Starvation", category);
        driver.quit();
    }
}
