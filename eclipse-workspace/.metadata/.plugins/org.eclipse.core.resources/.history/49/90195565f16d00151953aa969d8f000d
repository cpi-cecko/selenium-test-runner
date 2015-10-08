import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CredoLoggedPublications {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public static void main(String args[]) {
    CredoLoggedPublications css = new CredoLoggedPublications();
  
    try {
      css.setUp();
      css.testCredoLoggedPublications();
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
  public void testCredoLoggedPublications() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("j_borisova@abv.bg");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("kosmos");
    driver.findElement(By.id("remember-me")).click();
    driver.findElement(By.name("loginSubmit")).click();
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
    driver.findElement(By.xpath("//div[@id='articlesList']/div[3]/div[2]/a/span[2]/span")).click();
    driver.findElement(By.cssSelector("button.ytp-large-play-button.ytp-button")).click();
    driver.findElement(By.cssSelector("button.ytp-play-button.ytp-button")).click();
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
    driver.findElement(By.cssSelector("a.element")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Всички специалности']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Всички специалности"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ВСИЧКИ СПЕЦИАЛНОСТИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Всички специалности"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ВСИЧКИ СПЕЦИАЛНОСТИ"));
        }
        link.click();
      }
    }
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
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Моите интереси']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Моите интереси"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МОИТЕ ИНТЕРЕСИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Моите интереси"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МОИТЕ ИНТЕРЕСИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='УНГ']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("УНГ"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("УНГ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("УНГ"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("УНГ"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("//div[@id='articlesList']/div[3]/div[2]/a/span[2]/span")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='медицински стандарт по спешна медицина']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("медицински стандарт по спешна медицина"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МЕДИЦИНСКИ СТАНДАРТ ПО СПЕШНА МЕДИЦИНА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("медицински стандарт по спешна медицина"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МЕДИЦИНСКИ СТАНДАРТ ПО СПЕШНА МЕДИЦИНА"));
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
    driver.findElement(By.xpath("(//a[contains(text(),'Дискусии')])[2]")).click();
    driver.findElement(By.cssSelector("a.element")).click();
    driver.findElement(By.cssSelector("div.dropdown_menu-trigger")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Вече не харесвам']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Вече не харесвам"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ВЕЧЕ НЕ ХАРЕСВАМ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Вече не харесвам"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ВЕЧЕ НЕ ХАРЕСВАМ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Всички специалности']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Всички специалности"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ВСИЧКИ СПЕЦИАЛНОСТИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Всички специалности"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ВСИЧКИ СПЕЦИАЛНОСТИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Гастроентерология']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Гастроентерология"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ГАСТРОЕНТЕРОЛОГИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Гастроентерология"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ГАСТРОЕНТЕРОЛОГИЯ"));
        }
        link.click();
      }
    }
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
    driver.findElement(By.xpath("//div[@id='articlesList']/div[7]/div[2]/a/span[2]/span")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='противогрипна ваксина']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("противогрипна ваксина"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ПРОТИВОГРИПНА ВАКСИНА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("противогрипна ваксина"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ПРОТИВОГРИПНА ВАКСИНА"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Сезонът на грипа']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Сезонът на грипа"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("СЕЗОНЪТ НА ГРИПА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Сезонът на грипа"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("СЕЗОНЪТ НА ГРИПА"));
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
    driver.findElement(By.cssSelector("img[alt=\"CredoWeb\"]")).click();
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

