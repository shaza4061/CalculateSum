package com.paynet.quiz2.demo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static int runningTotal;

    public static void main(String[] args) {
        int[] num = new int[9];
        runningTotal = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 9 numbers:\n");
        IntStream.range(0,9).forEach(i->num[i] = scan.nextInt());
        scan.close();

        for (int j = 0; j < num.length - 1; j += 2) {
            add(num[j], num[j + 1]);
        }
    }

    private static void add(int a, int b) {
        runningTotal=runningTotal+a+b;
        System.out.println(runningTotal + "\n");
    }
}
