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
}
