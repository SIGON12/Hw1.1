package com.company;

public class Circle {
  int R = 12;
  int b = 2;
  int S = (int) (Math.PI*Math.pow(R,b));

  void plosh (){
      System.out.println("Площадь круга = " + S);
  }
}
