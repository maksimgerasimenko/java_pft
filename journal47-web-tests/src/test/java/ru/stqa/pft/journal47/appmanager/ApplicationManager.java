package ru.stqa.pft.journal47.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.journal47.model.ClassData;

import java.util.concurrent.TimeUnit;

/**
 * Created by maksim.gerasimenko on 10/30/16.
 */
public class ApplicationManager {
  FirefoxDriver wd;

  public static boolean isAlertPresent(FirefoxDriver wd) {
      try {
          wd.switchTo().alert();
          return true;
      } catch (NoAlertPresentException e) {
          return false;
      }
  }

  public void init() {
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

  public void commitClassCreation() {
      wd.findElement(By.name("commit")).click();
  }

  public void fillClassForm(ClassData classData) {
      wd.findElement(By.id("form_name")).click();
      wd.findElement(By.id("form_name")).clear();
      wd.findElement(By.id("form_name")).sendKeys(classData.getNameForClass());
  }

  public void initClassCreation() {
      wd.findElement(By.linkText("Добавить класс")).click();
  }

  public void goToClassPage() {
      wd.findElement(By.linkText("Классы")).click();
  }

  public void stop() {
    wd.quit();
  }

  public void deleteSelectedClass() {
    wd.findElement(By.linkText("Удалить")).click();
  }

  public void setAlertToOk() {
    Alert alert = wd.switchTo().alert();
    alert.accept();
  }
}
