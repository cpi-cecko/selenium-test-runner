import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CredoLoginEvents {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public static void main(String args[]) {
    CredoLoginEvents css = new CredoLoginEvents();
  
    try {
      css.setUp();
      css.testCredoLoginEvents();
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
  public void testCredoLoginEvents() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("j_borisova@abv.bg");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("kosmos");
    driver.findElement(By.id("remember-me")).click();
    driver.findElement(By.name("loginSubmit")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Събития')])[2]")).click();
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
        link = driver.findElement(By.xpath("//a[text()='Б А Л И организира Курс по лекарствени регулации есен 2015']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Б А Л И организира Курс по лекарствени регулации есен 2015"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("Б А Л И ОРГАНИЗИРА КУРС ПО ЛЕКАРСТВЕНИ РЕГУЛАЦИИ ЕСЕН 2015"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Б А Л И организира Курс по лекарствени регулации есен 2015"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("Б А Л И ОРГАНИЗИРА КУРС ПО ЛЕКАРСТВЕНИ РЕГУЛАЦИИ ЕСЕН 2015"));
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
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Последно']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Последно"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ПОСЛЕДНО"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Последно"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ПОСЛЕДНО"));
        }
        link.click();
      }
    }
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
        link = driver.findElement(By.xpath("//a[text()='Форум']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Форум"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ФОРУМ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Форум"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ФОРУМ"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Форум')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Ортопедия и травматология']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Ортопедия и травматология"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ОРТОПЕДИЯ И ТРАВМАТОЛОГИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Ортопедия и травматология"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ОРТОПЕДИЯ И ТРАВМАТОЛОГИЯ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='тазобедренна става']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("тазобедренна става"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ТАЗОБЕДРЕННА СТАВА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("тазобедренна става"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ТАЗОБЕДРЕННА СТАВА"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("//div[@id='forum-list']/div/div/div[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Форум')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Форум')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Спешна медицина']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Спешна медицина"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("СПЕШНА МЕДИЦИНА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Спешна медицина"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("СПЕШНА МЕДИЦИНА"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Форум')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Форум')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Спортна медицина']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Спортна медицина"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("СПОРТНА МЕДИЦИНА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Спортна медицина"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("СПОРТНА МЕДИЦИНА"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Изкълчен глезен']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Изкълчен глезен"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ИЗКЪЛЧЕН ГЛЕЗЕН"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Изкълчен глезен"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ИЗКЪЛЧЕН ГЛЕЗЕН"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Моите теми']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Моите теми"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МОИТЕ ТЕМИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Моите теми"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МОИТЕ ТЕМИ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("span.forum-following_theme")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Услуги')])[2]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Future Health е банката с най-много съхранени проби и в България за 2014 година.']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Future Health е банката с най-много съхранени проби и в България за 2014 година."));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("FUTURE HEALTH Е БАНКАТА С НАЙ-МНОГО СЪХРАНЕНИ ПРОБИ И В БЪЛГАРИЯ ЗА 2014 ГОДИНА."));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Future Health е банката с най-много съхранени проби и в България за 2014 година."));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("FUTURE HEALTH Е БАНКАТА С НАЙ-МНОГО СЪХРАНЕНИ ПРОБИ И В БЪЛГАРИЯ ЗА 2014 ГОДИНА."));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("div.tabs-container")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='За нас']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("За нас"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ЗА НАС"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("За нас"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ЗА НАС"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='http://www.future-health.bg/']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("http://www.future-health.bg/"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("HTTP://WWW.FUTURE-HEALTH.BG/"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("http://www.future-health.bg/"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("HTTP://WWW.FUTURE-HEALTH.BG/"));
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

