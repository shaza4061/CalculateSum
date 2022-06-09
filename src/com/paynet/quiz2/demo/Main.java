package com.paynet.quiz2.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] num = new int[9];
        int runningTotal = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 9 numbers:\n");

        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
        }
        scan.close();

        for (int j = 0; j < num.length - 1; j += 2) {
            int subTotal = add(num[j], num[j + 1]);
            runningTotal = runningTotal + subTotal;
            System.out.println(runningTotal + "\n");

        }
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
