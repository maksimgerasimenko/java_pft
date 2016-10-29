package ru.stqa.pft.journal47;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by maksim.gerasimenko on 10/30/16.
 */
public class TestBase {
  FirefoxDriver wd;

  public static boolean isAlertPresent(FirefoxDriver wd) {
      try {
          wd.switchTo().alert();
          return true;
      } catch (NoAlertPresentException e) {
          return false;
      }
  }

  @BeforeMethod
  public void setUp() throws Exception {
      wd = new FirefoxDriver();
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      wd.get("https://journal47test.herokuapp.com/");
      login("admin", "secret");
  }

  private void login(String username, String password) {
      wd.findElement(By.id("user_username")).click();
      wd.findElement(By.id("user_username")).clear();
      wd.findElement(By.id("user_username")).sendKeys(username);
      wd.findElement(By.id("user_password")).click();
      wd.findElement(By.id("user_password")).clear();
      wd.findElement(By.id("user_password")).sendKeys(password);
      commitClassCreation();
  }

  protected void commitClassCreation() {
      wd.findElement(By.name("commit")).click();
  }

  protected void fillClassForm(ClassData classData) {
      wd.findElement(By.id("form_name")).click();
      wd.findElement(By.id("form_name")).clear();
      wd.findElement(By.id("form_name")).sendKeys(classData.getNameForClass());
  }

  protected void initClassCreation() {
      wd.findElement(By.linkText("Добавить класс")).click();
  }

  protected void goToClassPage() {
      wd.findElement(By.linkText("Классы")).click();
  }

  @AfterMethod
  public void tearDown() {
      wd.quit();
  }

  protected void deleteSelectedClass() {
    wd.findElement(By.linkText("Удалить")).click();
  }

  protected void setAlertToOk() {
    Alert alert = wd.switchTo().alert();
    alert.accept();
  }
}
