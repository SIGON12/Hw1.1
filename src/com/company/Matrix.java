package com.company;


import java.util.Scanner;

public class Matrix {
    Scanner sc = new Scanner(System.in);

    //создание матрицы
    public void CreateMatrix(){
        System.out.println("Введите размер столбцов: ");
        int x = sc.nextInt();
    {
        System.out.println("Размер массива x : " + x);
    }
        System.out.println("Введите размер строк: ");
        int y = sc.nextInt();{
        System.out.println("Длинна массива y : " + y);
    }
    int[][] arrm=new int[x][y];
        arrm[x][y] =(int)(Math.random()+1);{ // заполнение матрицы
            for(int i= 0;i<arrm.length; i++){
        for (int j=0; j<arrm.length; j++){
            System.out.println("Матрица создана: " + arrm[x][y]);
           System.out.println("Матрица 1 :" + arrm[0][0]); //вывод 1 значения матрицы
        }}

    }

    }

}
