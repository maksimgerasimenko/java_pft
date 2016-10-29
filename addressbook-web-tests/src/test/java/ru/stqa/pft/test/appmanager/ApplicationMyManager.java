package ru.stqa.pft.test.appmanager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.appmanager.ContactHelper;
import ru.stqa.pft.addressbook.appmanager.NavigationContactHelper;

import java.util.concurrent.TimeUnit;

/**
 * Created by maksim.gerasimenko on 10/26/16.
 */
public class ApplicationMyManager {
  FirefoxDriver wd;

  private SessionHelper sessionHelper;
  private NavigationContactHelper navigationContactHelper;
  private ContactHelper contactHelper;

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
    wd.get("http://localhost/addressbook/index.php");
    contactHelper = new ContactHelper(wd);
    navigationContactHelper = new NavigationContactHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    wd.quit();
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationContactHelper getNavigationContactHelper() {
    return navigationContactHelper;
  }
}
