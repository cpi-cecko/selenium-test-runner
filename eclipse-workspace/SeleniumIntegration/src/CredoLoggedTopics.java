import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CredoLoggedTopics {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public static void main(String args[]) {
    CredoLoggedTopics css = new CredoLoggedTopics();
  
    try {
      css.setUp();
      css.testCredoLoggedTopics();
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
  public void testCredoLoggedTopics() throws Exception {
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
        link = driver.findElement(By.xpath("//a[text()='Теми']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Теми"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ТЕМИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Теми"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ТЕМИ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("a.pagination-element.rightTab")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='1']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("1"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("1"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("1"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("1"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Грип – симптоми и лечение']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Грип – симптоми и лечение"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ГРИП – СИМПТОМИ И ЛЕЧЕНИЕ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Грип – симптоми и лечение"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ГРИП – СИМПТОМИ И ЛЕЧЕНИЕ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='още за Грип – симптоми и лечение']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("още за Грип – симптоми и лечение"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ОЩЕ ЗА ГРИП – СИМПТОМИ И ЛЕЧЕНИЕ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("още за Грип – симптоми и лечение"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ОЩЕ ЗА ГРИП – СИМПТОМИ И ЛЕЧЕНИЕ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Свързани продукти']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Свързани продукти"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("СВЪРЗАНИ ПРОДУКТИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Свързани продукти"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("СВЪРЗАНИ ПРОДУКТИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Теми']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Теми"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ТЕМИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Теми"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ТЕМИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Хепатит C? Вече е лечим']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Хепатит C? Вече е лечим"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ХЕПАТИТ C? ВЕЧЕ Е ЛЕЧИМ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Хепатит C? Вече е лечим"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ХЕПАТИТ C? ВЕЧЕ Е ЛЕЧИМ"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Публикации')])[3]")).click();
    driver.findElement(By.cssSelector("span.element-heading")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Мит е, че от контрацептивните хапчета се напълнява']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Мит е, че от контрацептивните хапчета се напълнява"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МИТ Е, ЧЕ ОТ КОНТРАЦЕПТИВНИТЕ ХАПЧЕТА СЕ НАПЪЛНЯВА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Мит е, че от контрацептивните хапчета се напълнява"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МИТ Е, ЧЕ ОТ КОНТРАЦЕПТИВНИТЕ ХАПЧЕТА СЕ НАПЪЛНЯВА"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Теми']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Теми"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ТЕМИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Теми"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ТЕМИ"));
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
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Здравословен живот']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Здравословен живот"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ЗДРАВОСЛОВЕН ЖИВОТ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Здравословен живот"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ЗДРАВОСЛОВЕН ЖИВОТ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("div.follow-button")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Добавяне в контакти']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Добавяне в контакти"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ДОБАВЯНЕ В КОНТАКТИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Добавяне в контакти"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ДОБАВЯНЕ В КОНТАКТИ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("div.delete.closeModalWindow")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Теми']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Теми"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ТЕМИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Теми"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ТЕМИ"));
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
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='4']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("4"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("4"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("4"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("4"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("span.icon16x16.LeftArrow")).click();
    driver.findElement(By.cssSelector("span.icon32x32.megaphone")).click();
    driver.findElement(By.cssSelector("span.icon32x32.megaphone")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Дискусии']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Дискусии"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ДИСКУСИИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Дискусии"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ДИСКУСИИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Да си поговорим за здравословното хранене']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Да си поговорим за здравословното хранене"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ДА СИ ПОГОВОРИМ ЗА ЗДРАВОСЛОВНОТО ХРАНЕНЕ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Да си поговорим за здравословното хранене"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ДА СИ ПОГОВОРИМ ЗА ЗДРАВОСЛОВНОТО ХРАНЕНЕ"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Дискусии')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Има ли полза от ваксините?']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Има ли полза от ваксините?"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ИМА ЛИ ПОЛЗА ОТ ВАКСИНИТЕ?"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Има ли полза от ваксините?"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ИМА ЛИ ПОЛЗА ОТ ВАКСИНИТЕ?"));
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
    driver.findElement(By.cssSelector("#loadMoreContainer > button")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='За дискусията']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("За дискусията"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ЗА ДИСКУСИЯТА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("За дискусията"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ЗА ДИСКУСИЯТА"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='имунизационен календар']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("имунизационен календар"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ИМУНИЗАЦИОНЕН КАЛЕНДАР"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("имунизационен календар"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ИМУНИЗАЦИОНЕН КАЛЕНДАР"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Д-р Балджиева: Ротавирусната и пневмококовата ваксина трябва да са безплатни']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Д-р Балджиева: Ротавирусната и пневмококовата ваксина трябва да са безплатни"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("Д-Р БАЛДЖИЕВА: РОТАВИРУСНАТА И ПНЕВМОКОКОВАТА ВАКСИНА ТРЯБВА ДА СА БЕЗПЛАТНИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Д-р Балджиева: Ротавирусната и пневмококовата ваксина трябва да са безплатни"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("Д-Р БАЛДЖИЕВА: РОТАВИРУСНАТА И ПНЕВМОКОКОВАТА ВАКСИНА ТРЯБВА ДА СА БЕЗПЛАТНИ"));
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
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Дискусии']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Дискусии"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ДИСКУСИИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Дискусии"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ДИСКУСИИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Всички дискусии']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Всички дискусии"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ВСИЧКИ ДИСКУСИИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Всички дискусии"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ВСИЧКИ ДИСКУСИИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Стресът убива ли']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Стресът убива ли"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("СТРЕСЪТ УБИВА ЛИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Стресът убива ли"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("СТРЕСЪТ УБИВА ЛИ"));
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
    driver.findElement(By.cssSelector("#loadMoreContainer > button")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='За дискусията']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("За дискусията"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ЗА ДИСКУСИЯТА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("За дискусията"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ЗА ДИСКУСИЯТА"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Дискусии')])[2]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Моите дискусии']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Моите дискусии"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МОИТЕ ДИСКУСИИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Моите дискусии"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МОИТЕ ДИСКУСИИ"));
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

