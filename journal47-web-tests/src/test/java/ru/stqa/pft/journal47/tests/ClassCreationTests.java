package ru.stqa.pft.journal47.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.journal47.model.ClassData;

public class ClassCreationTests extends TestBase {

    @Test
    public void testClassCreation() {
        app.getHelperNavigation().goToClassPage();
        app.getHelperClass().initClassCreation();
        app.getHelperClass().fillClassForm(new ClassData("8-B"));
        app.getHelperClass().commitClassCreation();
        app.getHelperNavigation().goToClassPage();
    }

}
