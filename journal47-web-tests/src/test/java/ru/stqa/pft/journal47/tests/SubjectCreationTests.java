package ru.stqa.pft.journal47.tests;

import org.testng.annotations.Test;

public class SubjectCreationTests extends TestBase{
    
    @Test
    public void testSubjectCreation() {
        app.getHelperNavigation().goToSubjectPage();
        app.getHelperSubject().initSubjectCreation();
        app.getHelperSubject().fillSubjectPage();
        app.getHelperSubject().commitSubjectCreation();
        app.getHelperNavigation().goToSubjectPage();
    }
}
