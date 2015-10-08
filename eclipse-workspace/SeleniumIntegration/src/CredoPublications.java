import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CredoPublications {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public static void main(String args[]) {
    CredoPublications css = new CredoPublications();
  
    try {
      css.setUp();
      css.testCredoPublications();
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
  public void testCredoPublications() throws Exception {
    driver.get(baseUrl + "/");
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Публикации']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Публикации"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ПУБЛИКАЦИИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Публикации"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ПУБЛИКАЦИИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Акушерство и гинекология']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Акушерство и гинекология"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("АКУШЕРСТВО И ГИНЕКОЛОГИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Акушерство и гинекология"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("АКУШЕРСТВО И ГИНЕКОЛОГИЯ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("a.pagination-element.rightTab")).click();
    driver.findElement(By.cssSelector("span.icon16x16.LeftArrow")).click();
    driver.findElement(By.xpath("//div[@id='articlesList']/div[2]/div[2]/a/span[2]/span")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [deselectPopUp |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [deselectPopUp |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [deselectPopUp |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [deselectPopUp |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [deselectPopUp |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [deselectPopUp |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [deselectPopUp |  | ]]
    driver.findElement(By.xpath("(//a[contains(text(),'Публикации')])[2]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Хранене и диететика']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Хранене и диететика"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ХРАНЕНЕ И ДИЕТЕТИКА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Хранене и диететика"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ХРАНЕНЕ И ДИЕТЕТИКА"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Коментирайте')])[10]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Харесвам')])[10]")).click();
    driver.findElement(By.cssSelector("span.icon16x16.rightArrow")).click();
    driver.findElement(By.cssSelector("span.element-heading")).click();
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
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Публикации']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Публикации"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ПУБЛИКАЦИИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Публикации"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ПУБЛИКАЦИИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Физиотерапия и рехабилитация']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Физиотерапия и рехабилитация"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ФИЗИОТЕРАПИЯ И РЕХАБИЛИТАЦИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Физиотерапия и рехабилитация"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ФИЗИОТЕРАПИЯ И РЕХАБИЛИТАЦИЯ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("a.pagination-element.rightTab")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Научни материали']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Научни материали"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("НАУЧНИ МАТЕРИАЛИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Научни материали"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("НАУЧНИ МАТЕРИАЛИ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("span.icon16x16.rightArrow")).click();
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

