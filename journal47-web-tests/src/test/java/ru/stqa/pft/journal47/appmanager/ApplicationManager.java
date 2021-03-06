package ru.stqa.pft.journal47.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by maksim.gerasimenko on 10/30/16.
 */
public class ApplicationManager {
  FirefoxDriver wd;

  private HelperNavigation helperNavigation;
  private HelperClass helperClass;
  private HelperSession helperSession;
  private HelperSubject helperSubject;
  private HelperLearner helperLearner;

  public static boolean isAlertPresent(FirefoxDriver wd) {
      try {
          wd.switchTo().alert();
          return true;
      } catch (NoAlertPresentException e) {
          return false;
      }
  }

  public void init() {
    ProfilesIni profile = new ProfilesIni();
    FirefoxProfile myprofile = profile.getProfile("MyProfileWithoutCache");
    wd = new FirefoxDriver(myprofile);

    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("https://journal47test.herokuapp.com/");
    helperLearner = new HelperLearner(wd);
    helperSubject = new HelperSubject(wd);
    helperClass = new HelperClass(wd);
    helperNavigation = new HelperNavigation(wd);
    helperSession = new HelperSession(wd);
    helperSession.login("admin", "secret");
  }

  public void stop() {
    wd.quit();
  }

  public void setAlertToOk() {
    Alert alert = wd.switchTo().alert();
    alert.accept();
  }

  public HelperClass getHelperClass() {
    return helperClass;
  }

  public HelperNavigation getHelperNavigation() {
    return helperNavigation;
  }

  public HelperSubject getHelperSubject() {
    return helperSubject;
  }

  public HelperLearner getHelperLearner() {
    return helperLearner;
  }
}
