package ru.stqa.pft.mine;

/**
 * Created by maksim.gerasimenko on 10/24/16.
 */
public class CalculationOfDistance {
  public static void main(String[] args) {

    Point p1 = new Point(2, 3);

    Point p2 = new Point(4, 5);

    System.out.println("Расстояние между двумя точками на плоскости = " + p1.distance(p2));
  }
}
