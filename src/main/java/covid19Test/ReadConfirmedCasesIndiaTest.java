package covid19Test;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ReadConfirmedCasesIndiaTest {

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
  public void readConfirmedCases() {
    driver.get("https://www.covid19india.org/");
    //driver.get("https://www.seleniumeasy.com/selenium-tutorials/relative-or-friendly-locators");

    WebDriverWait wait = new WebDriverWait(driver, 10); // Starts a wait of a maximum 10 seconds.
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-confirmed > h1")));

    WebElement confirmedElement = driver.findElement(By.cssSelector(".is-confirmed > h1"));
    System.out.println(confirmedElement);

    System.out.println(confirmedElement.getText());
    Assert.assertEquals("3,40,66,765", confirmedElement.getText());
  }

}

