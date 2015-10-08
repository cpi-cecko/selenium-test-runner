import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CredoMainSearch {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public static void main(String args[]) {
    CredoMainSearch css = new CredoMainSearch();
  
    try {
      css.setUp();
      css.testCredoMainSearch();
      css.tearDown();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.credoweb.bg/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCredoMainSearch() throws Exception {
    driver.get(baseUrl + "/");
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='2']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("2"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("2"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("2"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("2"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='3']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("3"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("3"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("3"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("3"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//input[@name='filterText'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@name='filterText'])[3]")).sendKeys("Токуда");
    driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
    driver.findElement(By.cssSelector("a.pagination-element.rightTab")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [deselectPopUp |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [deselectPopUp |  | ]]
    driver.findElement(By.cssSelector("img[alt=\"CredoWeb\"]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

