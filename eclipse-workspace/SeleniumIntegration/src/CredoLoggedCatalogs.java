import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CredoLoggedCatalogs {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public static void main(String args[]) {
    CredoLoggedCatalogs css = new CredoLoggedCatalogs();
  
    try {
      css.setUp();
      css.testCredoLoggedCatalogs();
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
  public void testCredoLoggedCatalogs() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("j_borisova@abv.bg");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("kosmos11");
    driver.findElement(By.name("loginSubmit")).click();
    driver.findElement(By.xpath("//div[@id='mainMenu-new']/div[2]/div")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Продукти')])[3]")).click();
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
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='7']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("7"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("7"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("7"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("7"));
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
        link = driver.findElement(By.xpath("//a[text()='Ginkofol']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Ginkofol"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("GINKOFOL"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Ginkofol"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("GINKOFOL"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='още за Ginkofol']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("още за Ginkofol"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ОЩЕ ЗА GINKOFOL"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("още за Ginkofol"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ОЩЕ ЗА GINKOFOL"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("div.tabs-container")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Публикации')])[3]")).click();
    driver.findElement(By.cssSelector("span.element-heading")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Продукти')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Ambinor (Амбинор)']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Ambinor (Амбинор)"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("AMBINOR (АМБИНОР)"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Ambinor (Амбинор)"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("AMBINOR (АМБИНОР)"));
        }
        link.click();
      }
    }
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
    driver.findElement(By.xpath("(//a[contains(text(),'Публикации')])[3]")).click();
    driver.findElement(By.cssSelector("div.content.menu > div.dropdown_menu-element > a")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='д-р Васил Василев']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("д-р Васил Василев"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("Д-Р ВАСИЛ ВАСИЛЕВ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("д-р Васил Василев"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("Д-Р ВАСИЛ ВАСИЛЕВ"));
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
        link = driver.findElement(By.xpath("//a[text()='Месторабота']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Месторабота"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МЕСТОРАБОТА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Месторабота"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МЕСТОРАБОТА"));
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
    driver.findElement(By.xpath("(//a[contains(text(),'Публикации')])[3]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Медицински специалисти')])[5]")).click();
    driver.findElement(By.name("doctor")).click();
    driver.findElement(By.cssSelector("div.ExAC-dropdown-result-title")).click();
    driver.findElement(By.name("city")).click();
    driver.findElement(By.xpath("//div[@id='mainContent']/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/div[22]/div[5]/div")).click();
    driver.findElement(By.name("specialization")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [clickAt | //div[@id='mainContent']/div/div/div/div[2]/div/form/div[3]/div/div/div[2]/div/div[5]/div | ]]
    driver.findElement(By.name("first_name")).click();
    driver.findElement(By.xpath("//input[@value='Търси']")).click();
    driver.findElement(By.name("city")).click();
    driver.findElement(By.cssSelector("div.ExAC-dropdown-result.not_selectable > div.ExAC-dropdown-result > div.ExAC-dropdown-result-title")).click();
    driver.findElement(By.xpath("//input[@value='Търси']")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Услуги')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='БиоСел BioCell']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("БиоСел BioCell"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("БИОСЕЛ BIOCELL"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("БиоСел BioCell"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("БИОСЕЛ BIOCELL"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Организации')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='НАЦИОНАЛНА ЗДРАВНООСИГУРИТЕЛНА КАСА (НЗОК)']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("НАЦИОНАЛНА ЗДРАВНООСИГУРИТЕЛНА КАСА (НЗОК)"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("НАЦИОНАЛНА ЗДРАВНООСИГУРИТЕЛНА КАСА (НЗОК)"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("НАЦИОНАЛНА ЗДРАВНООСИГУРИТЕЛНА КАСА (НЗОК)"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("НАЦИОНАЛНА ЗДРАВНООСИГУРИТЕЛНА КАСА (НЗОК)"));
        }
        link.click();
      }
    }
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
    driver.findElement(By.xpath("(//a[contains(text(),'Публикации')])[3]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Аптеки/Оптики')])[2]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Аптека Афиа Търговска']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Аптека Афиа Търговска"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("АПТЕКА АФИА ТЪРГОВСКА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Аптека Афиа Търговска"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("АПТЕКА АФИА ТЪРГОВСКА"));
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
    driver.findElement(By.xpath("(//a[contains(text(),'Лечебни заведения')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='УМБАЛ Александровска']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("УМБАЛ Александровска"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("УМБАЛ АЛЕКСАНДРОВСКА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("УМБАЛ Александровска"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("УМБАЛ АЛЕКСАНДРОВСКА"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='I-во очно отделение (по глаукома и катаракта)']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("I-во очно отделение (по глаукома и катаракта)"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("I-ВО ОЧНО ОТДЕЛЕНИЕ (ПО ГЛАУКОМА И КАТАРАКТА)"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("I-во очно отделение (по глаукома и катаракта)"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("I-ВО ОЧНО ОТДЕЛЕНИЕ (ПО ГЛАУКОМА И КАТАРАКТА)"));
        }
        link.click();
      }
    }
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
    driver.findElement(By.xpath("(//a[contains(text(),'Публикации')])[3]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Галерии']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Галерии"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ГАЛЕРИИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Галерии"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ГАЛЕРИИ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("img[alt=\"3fd1b8a9c5e6373190128b4485001319.jpg\"]")).click();
    driver.findElement(By.cssSelector("div.element-content > div.image-container > img")).click();
    driver.findElement(By.cssSelector("a.enlarge")).click();
    driver.findElement(By.cssSelector("div.delete.closeModalWindow")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='I-во очно отделение (по глаукома и катаракта)']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("I-во очно отделение (по глаукома и катаракта)"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("I-ВО ОЧНО ОТДЕЛЕНИЕ (ПО ГЛАУКОМА И КАТАРАКТА)"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("I-во очно отделение (по глаукома и катаракта)"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("I-ВО ОЧНО ОТДЕЛЕНИЕ (ПО ГЛАУКОМА И КАТАРАКТА)"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Клиники']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Клиники"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("КЛИНИКИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Клиники"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("КЛИНИКИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='ІІ Клиника по коремна хирургия']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("ІІ Клиника по коремна хирургия"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ІІ КЛИНИКА ПО КОРЕМНА ХИРУРГИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("ІІ Клиника по коремна хирургия"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ІІ КЛИНИКА ПО КОРЕМНА ХИРУРГИЯ"));
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
    driver.findElement(By.cssSelector("div.content.menu > div.dropdown_menu-element > a")).click();
    driver.findElement(By.xpath("//a[contains(text(),'д-р Красимир  Хаджилазов')]")).click();
    driver.findElement(By.cssSelector("div.tabs-container")).click();
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
        link = driver.findElement(By.xpath("//a[text()='Месторабота']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Месторабота"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МЕСТОРАБОТА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Месторабота"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МЕСТОРАБОТА"));
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
    driver.findElement(By.xpath("(//a[contains(text(),'Форум')])[2]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Изследвания на хормони!']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Изследвания на хормони!"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ИЗСЛЕДВАНИЯ НА ХОРМОНИ!"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Изследвания на хормони!"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ИЗСЛЕДВАНИЯ НА ХОРМОНИ!"));
        }
        link.click();
      }
    }
    driver.findElement(By.xpath("(//a[contains(text(),'Услуги')])[3]")).click();
    driver.findElement(By.name("service")).click();
    driver.findElement(By.xpath("//div[@id='mainContent']/div/div/div/div[2]/div/form/div/div/div/div/div[2]/div[2]/div")).click();
    driver.findElement(By.xpath("//input[@value='Търси']")).click();
    driver.findElement(By.name("service")).click();
    driver.findElement(By.xpath("//div[@id='mainContent']/div/div/div/div[2]/div/form/div/div/div/div/div[2]/div[3]/div")).click();
    driver.findElement(By.xpath("//input[@value='Търси']")).click();
    driver.findElement(By.name("service")).click();
    driver.findElement(By.cssSelector("div.ExAC-dropdown-result-title")).click();
    driver.findElement(By.xpath("//input[@value='Търси']")).click();
    driver.findElement(By.name("service")).click();
    driver.findElement(By.xpath("//div[@id='mainContent']/div/div/div/div[2]/div/form/div/div/div/div/div[2]/div[5]/div")).click();
    driver.findElement(By.xpath("//input[@value='Търси']")).click();
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

