package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by maksim.gerasimenko on 10/26/16.
 */
public class NavigationContactHelper extends HelperBase{

  public NavigationContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void goToHomePage() {
      click(By.linkText("home"));
  }
}
