package ru.stqa.pft.journal47.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.journal47.appmanager.ApplicationManager;

/**
 * Created by maksim.gerasimenko on 10/30/16.
 */
public class TestBase {

  public static final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
