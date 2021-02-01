package com.company;

import java.util.Scanner;

public class ex02 {
    int number;
    Scanner scanner = new Scanner(System.in);
    int summa;
    int current = 0;
    int var = 2;

    ex02() {
        while (this.number != 42) {
            this.number = getNumber();
            natureNumber();
        }
    }

    public void setCurrent() {
        System.out.println("Count of coffee-request" + "-" + current);
    }


    public boolean naturalNumber() {
        if (number > 1) {
        }
        return true;
    }

    public int summa() {
        if (naturalNumber()) {
            int i = number;
            while (i != 0) {
                summa += (i % 10);
                i = i / 10;
            }
        }
        return summa;
    }

    public void natureNumber() {
        int i = summa();
        if (i % var != 0) {
            var++;
            current++;
        } else if (i % var == 0) {
            printIsItNaturalNumber(var, i);
        }

    }

    private void printIsItNaturalNumber(int var, int i) {
        if (var == i) {
            current++;
        }
    }

    public int getNumber() {
        return number = scanner.nextInt();
    }
}
