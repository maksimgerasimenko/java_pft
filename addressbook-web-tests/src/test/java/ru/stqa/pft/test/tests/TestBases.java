package ru.stqa.pft.test.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.test.appmanager.ApplicationMyManager;

/**
 * Created by maksim.gerasimenko on 10/26/16.
 */
public class TestBases {

  protected final ApplicationMyManager app = new ApplicationMyManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
