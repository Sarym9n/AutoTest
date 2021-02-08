package ru.stqa.AutoTest.San;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("Воин");

    Squere s = new Squere(5);
    System.out.println("Площадь " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Приветствую " + somebody);
  }

}