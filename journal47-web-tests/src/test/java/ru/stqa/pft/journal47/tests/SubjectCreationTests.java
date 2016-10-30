package ru.stqa.pft.journal47.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.journal47.model.SubjectData;

public class SubjectCreationTests extends TestBase{
    
    @Test
    public void testSubjectCreation() {
        app.getHelperNavigation().goToSubjectPage();
        app.getHelperSubject().initSubjectCreation();
        app.getHelperSubject().fillSubjectPage(new SubjectData("History"));
        app.getHelperSubject().commitSubjectCreation();
        app.getHelperNavigation().goToSubjectPage();
    }
}
