import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CredoNotloggedEvents {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public static void main(String args[]) {
    CredoNotloggedEvents css = new CredoNotloggedEvents();
  
    try {
      css.setUp();
      css.testCredoNotloggedEvents();
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
  public void testCredoNotloggedEvents() throws Exception {
    driver.get(baseUrl + "/index.php");
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Събития']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Събития"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("СЪБИТИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Събития"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("СЪБИТИЯ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Научен симпозиум: Нови ехографски технологии от Mindray в помощ на ехографиста. БАУМ-XVIII НАЦИОНАЛЕН КОНГРЕС ПО УЛТРАЗВУК В МЕДИЦИНАТА. 1-4.10.2015, Интерхотел Сандански']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Научен симпозиум: Нови ехографски технологии от Mindray в помощ на ехографиста. БАУМ-XVIII НАЦИОНАЛЕН КОНГРЕС ПО УЛТРАЗВУК В МЕДИЦИНАТА. 1-4.10.2015, Интерхотел Сандански"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("НАУЧЕН СИМПОЗИУМ: НОВИ ЕХОГРАФСКИ ТЕХНОЛОГИИ ОТ MINDRAY В ПОМОЩ НА ЕХОГРАФИСТА. БАУМ-XVIII НАЦИОНАЛЕН КОНГРЕС ПО УЛТРАЗВУК В МЕДИЦИНАТА. 1-4.10.2015, ИНТЕРХОТЕЛ САНДАНСКИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Научен симпозиум: Нови ехографски технологии от Mindray в помощ на ехографиста. БАУМ-XVIII НАЦИОНАЛЕН КОНГРЕС ПО УЛТРАЗВУК В МЕДИЦИНАТА. 1-4.10.2015, Интерхотел Сандански"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("НАУЧЕН СИМПОЗИУМ: НОВИ ЕХОГРАФСКИ ТЕХНОЛОГИИ ОТ MINDRAY В ПОМОЩ НА ЕХОГРАФИСТА. БАУМ-XVIII НАЦИОНАЛЕН КОНГРЕС ПО УЛТРАЗВУК В МЕДИЦИНАТА. 1-4.10.2015, ИНТЕРХОТЕЛ САНДАНСКИ"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Събития')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Всички събития']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Всички събития"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ВСИЧКИ СЪБИТИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Всички събития"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ВСИЧКИ СЪБИТИЯ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Курс за пътешественици']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Курс за пътешественици"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("КУРС ЗА ПЪТЕШЕСТВЕНИЦИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Курс за пътешественици"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("КУРС ЗА ПЪТЕШЕСТВЕНИЦИ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("div.follow-button_container.event_like > div.follow-button")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Участници']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Участници"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("УЧАСТНИЦИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Участници"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("УЧАСТНИЦИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Най- важното']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Най- важното"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("НАЙ- ВАЖНОТО"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Най- важното"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("НАЙ- ВАЖНОТО"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='За събитието']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("За събитието"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ЗА СЪБИТИЕТО"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("За събитието"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ЗА СЪБИТИЕТО"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Събития')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Научен симпозиум: Нови ехографски технологии от Mindray в помощ на ехографиста. БАУМ-XVIII НАЦИОНАЛЕН КОНГРЕС ПО УЛТРАЗВУК В МЕДИЦИНАТА. 1-4.10.2015, Интерхотел Сандански']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Научен симпозиум: Нови ехографски технологии от Mindray в помощ на ехографиста. БАУМ-XVIII НАЦИОНАЛЕН КОНГРЕС ПО УЛТРАЗВУК В МЕДИЦИНАТА. 1-4.10.2015, Интерхотел Сандански"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("НАУЧЕН СИМПОЗИУМ: НОВИ ЕХОГРАФСКИ ТЕХНОЛОГИИ ОТ MINDRAY В ПОМОЩ НА ЕХОГРАФИСТА. БАУМ-XVIII НАЦИОНАЛЕН КОНГРЕС ПО УЛТРАЗВУК В МЕДИЦИНАТА. 1-4.10.2015, ИНТЕРХОТЕЛ САНДАНСКИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Научен симпозиум: Нови ехографски технологии от Mindray в помощ на ехографиста. БАУМ-XVIII НАЦИОНАЛЕН КОНГРЕС ПО УЛТРАЗВУК В МЕДИЦИНАТА. 1-4.10.2015, Интерхотел Сандански"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("НАУЧЕН СИМПОЗИУМ: НОВИ ЕХОГРАФСКИ ТЕХНОЛОГИИ ОТ MINDRAY В ПОМОЩ НА ЕХОГРАФИСТА. БАУМ-XVIII НАЦИОНАЛЕН КОНГРЕС ПО УЛТРАЗВУК В МЕДИЦИНАТА. 1-4.10.2015, ИНТЕРХОТЕЛ САНДАНСКИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Най- важното']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Най- важното"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("НАЙ- ВАЖНОТО"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Най- важното"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("НАЙ- ВАЖНОТО"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("#loadMoreContainer > button")).click();
    driver.findElement(By.cssSelector("#loadMoreContainer > button")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Събития')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Моите събития']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Моите събития"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МОИТЕ СЪБИТИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Моите събития"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МОИТЕ СЪБИТИЯ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Всички събития']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Всички събития"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ВСИЧКИ СЪБИТИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Всички събития"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ВСИЧКИ СЪБИТИЯ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Летен медицински университет']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Летен медицински университет"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ЛЕТЕН МЕДИЦИНСКИ УНИВЕРСИТЕТ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Летен медицински университет"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ЛЕТЕН МЕДИЦИНСКИ УНИВЕРСИТЕТ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Участници']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Участници"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("УЧАСТНИЦИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Участници"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("УЧАСТНИЦИ"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("//div[@id='dashboard-items']/div/div[4]/div[9]/div[2]/div/span")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Най- важното']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Най- важното"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("НАЙ- ВАЖНОТО"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Най- важното"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("НАЙ- ВАЖНОТО"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("#loadMoreContainer > button")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='За събитието']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("За събитието"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ЗА СЪБИТИЕТО"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("За събитието"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ЗА СЪБИТИЕТО"));
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

