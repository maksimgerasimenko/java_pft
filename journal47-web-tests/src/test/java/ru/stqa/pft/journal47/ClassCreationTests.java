package ru.stqa.pft.journal47;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ClassCreationTests {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://journal47test.herokuapp.com/");
        wd.findElement(By.id("user_username")).click();
        wd.findElement(By.id("user_username")).clear();
        wd.findElement(By.id("user_username")).sendKeys("admin");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("secret");
        wd.findElement(By.name("commit")).click();
    }
    
    @Test
    public void testClassCreation() {
        wd.findElement(By.linkText("Классы")).click();
        wd.findElement(By.linkText("Добавить класс")).click();
        wd.findElement(By.id("form_name")).click();
        wd.findElement(By.id("form_name")).clear();
        wd.findElement(By.id("form_name")).sendKeys("8-B");
        wd.findElement(By.name("commit")).click();
        wd.findElement(By.linkText("Классы")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
