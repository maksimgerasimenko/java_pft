package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

/**
 * Created by maksim.gerasimenko on 10/25/16.
 */
public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeClass
  public void setUp() throws Exception {
    app.init();
  }

  @AfterClass
  public void tearDown() {
    app.stop();
  }

}
