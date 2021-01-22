package com.company;

import java.util.Scanner;

public class Vector implements Arifmetic{
    Scanner sc = new Scanner(System.in);

    public void CreateVector() {
        int x = sc.nextInt();
        int[] arrv = new int[x];
        {
            for (int i = 0; i < arrv.length; i++) {
                System.out.println("Вектор = " + arrv);
            }

        }
    }

    @Override
    public void summa() {

    }

    @Override
    public void sravn() {



    }
}
