package ru.stqa.pft.journal47;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ClassCreationTests extends TestBase{

    @Test
    public void testClassCreation() {
        goToClassPage();
        initClassCreation();
        fillClassForm(new ClassData("8-B"));
        commitClassCreation();
        goToClassPage();
    }

}
