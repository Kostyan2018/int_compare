package com.company;

import java.util.Scanner;

import static java.lang.Math.random;


public class Main {
    public static final int RNDM = (int)(random()*100);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("add int = ");
        int i = sc.nextInt();

        while (i != RNDM ) {
            System.out.println("Try again ");
            i=sc.nextInt();
        }
        System.out.println("true");
        sc.close();
        }
    }

