package ru.stqa.pft.mine;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by maksim.gerasimenko on 10/24/16.
 */
public class PointTests {

  @Test

  public void testArea() {
    Point p1 = new Point(2, 3);
    Point p2 = new Point(4, 5);

    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
  }

}
