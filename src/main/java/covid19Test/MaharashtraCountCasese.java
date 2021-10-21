package covid19Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaharashtraCountCasese {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Documents\\MyTestngProject\\src\\main\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void maharashtraCount() {
        driver.get("https://www.covid19india.org/state/MH");

        WebDriverWait wait = new WebDriverWait(driver, 5); // Starts a wait of a maximum 10 seconds.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".district > div:nth-child(1)")));

        WebElement mhCount = driver.findElement(By.cssSelector(".district > div:nth-child(1)"));
        System.out.println(mhCount.getText());
        int expectedCount  = 29627;
        String actualText  = mhCount.getText().replaceAll(",", "");

        System.out.println(actualText);

        int actualCount = Integer.parseInt(actualText);
        Assert.assertTrue(actualCount >= expectedCount);
    }
   @Test
    public void readMultipleElements() {
        driver.get("https://www.covid19india.org/state/MH");

        WebDriverWait wait = new WebDriverWait(driver, 5); // Starts a wait of a maximum 10 seconds.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("districts")));

        List<WebElement> allDistricts = driver.findElements(By.cssSelector(".district > h5"));
        for (WebElement dist : allDistricts) {
            System.out.println(dist.getText());
        }
    }
        @Test
        public void getPageTitle() {
            driver.get("https://www.covid19india.org/state/MH");

            WebDriverWait wait = new WebDriverWait(driver, 5); // Starts a wait of a maximum 10 seconds.
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".population > h1")));

            String pageTitle = driver.getTitle();
            System.out.println(pageTitle);
            Assert.assertEquals("Coronavirus Maharashtra - covid19india.org", pageTitle);

            WebElement population = driver.findElement(By.cssSelector(".population > h1"));
            System.out.println(population.getText());

            String populationText = population.getText().replaceAll(",", "");
            long actualCount = Long.parseLong(populationText);

            System.out.println(actualCount);
            Assert.assertTrue(actualCount>= 122153000l);
        }


    }



