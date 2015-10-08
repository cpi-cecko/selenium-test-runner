import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CredoSearchSpecialist {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public static void main(String args[]) {
    CredoSearchSpecialist css = new CredoSearchSpecialist();
  
    try {
      css.setUp();
      css.testCredoSearchSpecialist();
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
  public void testCredoSearchSpecialist() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("j_borisova@abv.bg");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("kosmos11");
    driver.findElement(By.name("loginSubmit")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("j_borisova@abv.bg");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("kosmos");
    driver.findElement(By.name("loginSubmit")).click();
    driver.findElement(By.cssSelector("span.element-content-patient")).click();
    driver.findElement(By.name("doctor")).click();
    driver.findElement(By.cssSelector("div.ExAC-dropdown-result-title")).click();
    driver.findElement(By.name("city")).click();
    driver.findElement(By.cssSelector("div.ExAC-dropdown-result-title")).click();
    driver.findElement(By.name("specialization")).click();
    driver.findElement(By.xpath("//div[@id='mainContent']/div/div/div/div[2]/div/form/div[3]/div/div/div[2]/div/div[4]/div")).click();
    driver.findElement(By.xpath("//input[@value='Търси']")).click();
    driver.findElement(By.name("specialization")).click();
    driver.findElement(By.name("specialization")).clear();
    driver.findElement(By.name("specialization")).sendKeys("");
    driver.findElement(By.cssSelector("#searchProfiles-tabs > #profileEdit-container")).click();
    driver.findElement(By.xpath("//input[@value='Търси']")).click();
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
    driver.findElement(By.cssSelector("span.icon16x16.rightArrow")).click();
    driver.findElement(By.id("allContainer")).click();
    driver.findElement(By.cssSelector("span.element-dropdown_arrow")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Изход']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Изход"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ИЗХОД"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Изход"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ИЗХОД"));
        }
        link.click();
      }
    }
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

