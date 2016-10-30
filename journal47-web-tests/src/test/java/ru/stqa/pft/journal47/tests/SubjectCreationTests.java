package ru.stqa.pft.journal47.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.journal47.model.SubjectData;

public class SubjectCreationTests extends TestBase{
    
    @Test
    public void testSubjectCreation() {
        app.getHelperNavigation().goToSubjectPage();
        app.getHelperSubject().initSubjectCreation();
        app.getHelperSubject().fillSubjectPage(new SubjectData("History"));
        app.getHelperNavigation().commitAllActions();
        app.getHelperNavigation().goToSubjectPage();
    }
}
