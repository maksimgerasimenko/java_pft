package ru.stqa.pft.mine;

/**
 * Created by maksim.gerasimenko on 10/24/16.
 */
public class Point {

  double x;
  double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p1) {
    return Math.sqrt((this.x - p1.x) * (this.x - p1.x) + (this.y - p1.y) * (this.y - p1.y));
  }
}
