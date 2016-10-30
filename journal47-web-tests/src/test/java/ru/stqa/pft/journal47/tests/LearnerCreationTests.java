package ru.stqa.pft.journal47.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class LearnerCreationTests extends TestBase{

    @Test
    public void LearnerCreationTests() {
        app.getHelperNavigation().goToClassPage();
        app.getHelperNavigation().goToLearnerPage();
        app.getHelperLearner().initLearnerCreation();
        app.getHelperLearner().filLearnerPage(new LearnerData("Герасименко", "Максим"));
        app.getHelperNavigation().commitAllActions();
    }




}
