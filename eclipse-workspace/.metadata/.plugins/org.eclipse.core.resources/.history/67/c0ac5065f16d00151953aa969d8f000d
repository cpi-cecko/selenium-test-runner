import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CredoLoginProfileChange {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public static void main(String args[]) {
    CredoLoginProfileChange css = new CredoLoginProfileChange();
  
    try {
      css.setUp();
      css.testCredoLoginProfileChange();
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
  public void testCredoLoginProfileChange() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("j_borisova@abv.bg");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("kosmos11");
    driver.findElement(By.id("remember-me")).click();
    driver.findElement(By.name("loginSubmit")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Създай страница']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Създай страница"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("СЪЗДАЙ СТРАНИЦА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Създай страница"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("СЪЗДАЙ СТРАНИЦА"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("span.icon-page.medical")).click();
    driver.findElement(By.name("sub_profile_type_id")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Откажете']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Откажете"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ОТКАЖЕТЕ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Откажете"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ОТКАЖЕТЕ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("span.icon-page.organization")).click();
    driver.findElement(By.name("sub_profile_type_id")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Откажете']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Откажете"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ОТКАЖЕТЕ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Откажете"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ОТКАЖЕТЕ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("span.icon-page.firm")).click();
    driver.findElement(By.name("sub_profile_type_id")).click();
    new Select(driver.findElement(By.name("sub_profile_type_id"))).selectByVisibleText("Медия със здравна насоченост");
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Откажете']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Откажете"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ОТКАЖЕТЕ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Откажете"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ОТКАЖЕТЕ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("span.icon-page.theme")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Откажете']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Откажете"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ОТКАЖЕТЕ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Откажете"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ОТКАЖЕТЕ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("span.icon-page.pharmacy")).click();
    driver.findElement(By.name("sub_profile_type_id")).click();
    new Select(driver.findElement(By.name("sub_profile_type_id"))).selectByVisibleText("Дрогерия");
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Откажете']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Откажете"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ОТКАЖЕТЕ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Откажете"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ОТКАЖЕТЕ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Редакция на профил']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Редакция на профил"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("РЕДАКЦИЯ НА ПРОФИЛ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Редакция на профил"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("РЕДАКЦИЯ НА ПРОФИЛ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='За мен']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("За мен"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ЗА МЕН"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("За мен"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ЗА МЕН"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Опит и образование']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Опит и образование"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ОПИТ И ОБРАЗОВАНИЕ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Опит и образование"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ОПИТ И ОБРАЗОВАНИЕ"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("//div[@id='profileEdit-container']/div[2]/div/div[2]/div")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Тип на профила']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Тип на профила"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ТИП НА ПРОФИЛА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Тип на профила"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ТИП НА ПРОФИЛА"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='E-mail и парола']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("E-mail и парола"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("E-MAIL И ПАРОЛА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("E-mail и парола"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("E-MAIL И ПАРОЛА"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("button.facebook-login-button.logout")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | f2ff0e706ff8e5c | 30000]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=_e_0lCi | ]]
    driver.findElement(By.name("__CANCEL__")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
    driver.findElement(By.id("old_password")).clear();
    driver.findElement(By.id("old_password")).sendKeys("kosmos");
    driver.findElement(By.id("new_password")).clear();
    driver.findElement(By.id("new_password")).sendKeys("kosmos11");
    driver.findElement(By.id("new_password_repeat")).clear();
    driver.findElement(By.id("new_password_repeat")).sendKeys("kosmos11");
    driver.findElement(By.xpath("//input[@value='Запазете']")).click();
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
    driver.findElement(By.xpath("//div[@id='profileEdit-tab_content']/div/div/form/div[4]/div[2]/div/div/span")).click();
    driver.findElement(By.name("public_email_pub_patients")).click();
    driver.findElement(By.name("public_email_pub_sellers")).click();
    driver.findElement(By.xpath("//div[@id='sizzle-1443602445845']/div[2]/div[4]/div")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Интереси']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Интереси"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ИНТЕРЕСИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Интереси"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ИНТЕРЕСИ"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//input[@name='interests[]'])[22]")).click();
    driver.findElement(By.xpath("//input[@value='Запазете']")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Страници']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Страници"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("СТРАНИЦИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Страници"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("СТРАНИЦИ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("div.tab-container.current > div.tab")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Моите активности']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Моите активности"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МОИТЕ АКТИВНОСТИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Моите активности"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МОИТЕ АКТИВНОСТИ"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'За мен')])[2]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Известия']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Известия"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ИЗВЕСТИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Известия"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ИЗВЕСТИЯ"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//input[@name='active_notification_mail_ids[]'])[4]")).click();
    driver.findElement(By.xpath("//input[@value='Запазете']")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Кого следвам']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Кого следвам"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("КОГО СЛЕДВАМ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Кого следвам"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("КОГО СЛЕДВАМ"));
        }
        link.click();
      }
    }
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

