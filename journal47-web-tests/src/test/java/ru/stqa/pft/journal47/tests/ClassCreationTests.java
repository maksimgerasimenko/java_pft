package ru.stqa.pft.journal47.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.journal47.model.ClassData;

public class ClassCreationTests extends TestBase {

    @Test
    public void testClassCreation() {
        app.goToClassPage();
        app.initClassCreation();
        app.fillClassForm(new ClassData("8-B"));
        app.commitClassCreation();
        app.goToClassPage();
    }

}
