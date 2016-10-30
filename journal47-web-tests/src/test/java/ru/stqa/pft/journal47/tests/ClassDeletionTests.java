package ru.stqa.pft.journal47.tests;

import org.testng.annotations.Test;

public class ClassDeletionTests extends TestBase {

  @Test
  public void testClassDeletion() {
    app.getHelperNavigation().goToClassPage();
    app.getHelperClass().deleteSelectedClass();
    app.setAlertToOk();
    app.getHelperNavigation().goToClassPage();
  }

}
