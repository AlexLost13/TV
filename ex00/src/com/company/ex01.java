package com.company;

import java.util.Scanner;

public class ex01 {
    int current = 1;
    static int var = 2;
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    public void natural(int number) {
        this.number = number;
        if (number > 1) {
            if (number % var != 0) {
                var++;
                current++;
                natural(number);
            } else if (number % var == 0) {
                printIsItNaturalNumber(var, number);
            }
        }else {
            System.out.println("Illegal Argument");
        }
    }

    private void printIsItNaturalNumber(int var, int number) {
        if (var == number) {
            System.out.println(true + " " + current);
        } else {
            System.out.println(false + " " + current);
        }
    }
}
