// Generated by Selenium IDE
package covid19Test;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DropDownTest {
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
  public void dropDown() throws InterruptedException {
    driver.get("https://www.covid19india.org/");
    driver.manage().window().maximize();

    WebDriverWait wait = new WebDriverWait(driver, 5); // Starts a wait of a maximum 10 seconds.
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select:nth-child(1)")));
    try {
      driver.findElement(By.cssSelector("select:nth-child(1)")).click();
      {
        WebElement dropdown = driver.findElement(By.cssSelector("select:nth-child(1)"));
        Select select = new Select(dropdown);
        select.selectByValue("India");
        Thread.sleep(5000);
      }
    } catch (NoSuchElementException e) {
      System.out.println("Handled NoSuchElementException ");
    }
  }
  @Test
  public void GetListItem() {
    driver.get("https://www.covid19india.org/");
    driver.manage().window().maximize();

    WebDriverWait wait = new WebDriverWait(driver, 5); // Starts a wait of a maximum 10 seconds.
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select:nth-child(1)")));

    WebElement dropdown = driver.findElement(By.cssSelector("select:nth-child(1)"));
    Select select = new Select(dropdown);
    List<WebElement> ListItems = select.getOptions();
    for (WebElement element : ListItems) {
      System.out.println(element.getText());
    }
  }

}
