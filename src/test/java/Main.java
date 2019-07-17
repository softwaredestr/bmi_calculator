import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {
        public static final String Bmi_calculator = "https://healthunify.com/bmicalculator/";

        @Test
        public void test123() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get(Bmi_calculator);
            driver.findElement(By.name("wg")).sendKeys("120");
            driver.findElement(By.name("ht")).sendKeys("200");
            driver.findElement(By.name("cc")).click();
           driver.quit();
        }

}
