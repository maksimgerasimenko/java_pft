package ru.stqa.pft.journal47.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by maksim.gerasimenko on 10/30/16.
 */
public class HelperNavigation {
  FirefoxDriver wd;

  public HelperNavigation(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void goToClassPage() {
      wd.findElement(By.linkText("Классы")).click();
  }
  public void goToSubjectPage() {
    wd.findElement(By.linkText("Предметы")).click();
  }
  public void commitAllActions() {
    wd.findElement(By.name("commit")).click();
  }
  public void goToLearnerPage() {
    wd.findElement(By.linkText("Ученики")).click();
  }
}
