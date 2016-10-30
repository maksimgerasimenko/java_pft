package ru.stqa.pft.journal47.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.journal47.tests.LearnerData;

/**
 * Created by maksim.gerasimenko on 10/30/16.
 */
public class HelperLearner {

  private FirefoxDriver wd;

  public HelperLearner(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void filLearnerPage(LearnerData learnerData) {
    wd.findElement(By.id("pupil_name")).click();
    wd.findElement(By.id("pupil_name")).clear();
    wd.findElement(By.id("pupil_name")).sendKeys(learnerData.getLastName());
    wd.findElement(By.id("pupil_surname")).click();
    wd.findElement(By.id("pupil_surname")).clear();
    wd.findElement(By.id("pupil_surname")).sendKeys(learnerData.getFirstName());
  }

  public void initLearnerCreation() {
    wd.findElement(By.linkText("Добавить ученика")).click();
  }
}
