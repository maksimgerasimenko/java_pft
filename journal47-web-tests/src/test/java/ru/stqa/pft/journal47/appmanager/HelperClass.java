package ru.stqa.pft.journal47.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.journal47.model.ClassData;
import ru.stqa.pft.journal47.tests.TestBase;

import java.util.List;

/**
 * Created by maksim.gerasimenko on 10/30/16.
 */
public class HelperClass {
  private FirefoxDriver wd;

  public HelperClass(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void fillClassForm(ClassData classData) {
      wd.findElement(By.id("form_name")).click();
      wd.findElement(By.id("form_name")).clear();
      wd.findElement(By.id("form_name")).sendKeys(classData.getNameForClass());
  }

  public void initClassCreation() {
      wd.findElement(By.linkText("Добавить класс")).click();
  }

  public void deleteSelectedClass() {
    wd.findElement(By.linkText("Удалить")).click();
  }

  public void deleteAllSelectedClass() {
    List<WebElement> elements = wd.findElements(By.linkText("Удалить"));
    for (int i = 0; i < elements.size(); i++) {
      wd.findElement(By.linkText("Удалить")).click();
      TestBase.app.setAlertToOk();
    }
  }
}
