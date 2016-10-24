package ru.stqa.pft.sandbox;

/**
 * Created by maksim.gerasimenko on 10/20/16.
 */
public class Triangle {

  public double a;
  public double b;
  public double c;

  public Triangle (double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double area () {
    double pp = (this.a  + this.b + this.c) / 2.0;  // полупериметр
    return Math.sqrt(pp * (pp - this.a) * (pp - this.b) * (pp - this.c)); // прямо по формуле Герона из вики
  }

}
