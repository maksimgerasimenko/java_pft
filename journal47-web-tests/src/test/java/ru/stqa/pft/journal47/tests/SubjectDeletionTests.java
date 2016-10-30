package ru.stqa.pft.journal47.tests;

import org.testng.annotations.Test;

public class SubjectDeletionTests extends TestBase{
    
    @Test
    public void testSubjectDeletion() {
        app.getHelperNavigation().goToSubjectPage();
        app.getHelperSubject().deleteSelectedSubject();
        app.setAlertToOk();
        app.getHelperNavigation().goToSubjectPage();
    }
}
