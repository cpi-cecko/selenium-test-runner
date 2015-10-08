import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CredoSearchHospital {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public static void main(String args[]) {
    CredoSearchHospital css = new CredoSearchHospital();
  
    try {
      css.setUp();
      css.testCredoSearchHospital();
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
  public void testCredoSearchHospital() throws Exception {
    driver.get(baseUrl + "/");
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Лечебни заведения']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Лечебни заведения"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ЛЕЧЕБНИ ЗАВЕДЕНИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Лечебни заведения"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ЛЕЧЕБНИ ЗАВЕДЕНИЯ"));
        }
        link.click();
      }
    }
    driver.findElement(By.name("city")).click();
    driver.findElement(By.xpath("//div[@id='mainContent']/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/div[9]/div[6]/div")).click();
    driver.findElement(By.xpath("//input[@value='Търси']")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='МБАЛ - Момчилград']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("МБАЛ - Момчилград"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МБАЛ - МОМЧИЛГРАД"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("МБАЛ - Момчилград"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МБАЛ - МОМЧИЛГРАД"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Контакти']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Контакти"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("КОНТАКТИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Контакти"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("КОНТАКТИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Специалисти']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Специалисти"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("СПЕЦИАЛИСТИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Специалисти"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("СПЕЦИАЛИСТИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Всичко']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Всичко"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ВСИЧКО"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Всичко"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ВСИЧКО"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Лечебни заведения')])[4]")).click();
    driver.findElement(By.name("city")).click();
    driver.findElement(By.cssSelector("div.ExAC-dropdown-result.not_selectable > div.ExAC-dropdown-result > div.ExAC-dropdown-result-title")).click();
    driver.findElement(By.xpath("//input[@value='Търси']")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='МЦ - ул. Цар Симеон 8']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("МЦ - ул. Цар Симеон 8"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МЦ - УЛ. ЦАР СИМЕОН 8"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("МЦ - ул. Цар Симеон 8"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МЦ - УЛ. ЦАР СИМЕОН 8"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Начало']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Начало"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("НАЧАЛО"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Начало"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("НАЧАЛО"));
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

