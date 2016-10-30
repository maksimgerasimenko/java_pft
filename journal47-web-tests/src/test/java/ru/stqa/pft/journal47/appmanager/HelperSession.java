package ru.stqa.pft.journal47.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by maksim.gerasimenko on 10/30/16.
 */
public class HelperSession {
  private FirefoxDriver wd;

  public HelperSession(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void login(String username, String password) {
    wd.findElement(By.id("user_username")).click();
    wd.findElement(By.id("user_username")).clear();
    wd.findElement(By.id("user_username")).sendKeys(username);
    wd.findElement(By.id("user_password")).click();
    wd.findElement(By.id("user_password")).clear();
    wd.findElement(By.id("user_password")).sendKeys(password);
    wd.findElement(By.name("commit")).click();
  }
}