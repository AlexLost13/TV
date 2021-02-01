package com.company;

import java.util.Scanner;

public class ex005 {
    public String firstName;
    Scanner scanner = new Scanner(System.in);
    public String stop = ".";
    int n1 = 11;
    int i = 1;
    int n = 11;
    public String[][] table = new String[n][n1];

    ex005() {
        addDate();
        firstName = " ";
        while (!firstName.equals(stop)) {
            firstName = scanner.nextLine();
            if (!firstName.equals(stop)) {
                table[i][0] = firstName;
                i++;
            }
        }

    }

    public void addDate() {
        table[0][0] = " ";
        table[0][1] = "4:00 WE  2|";
        table[0][2] = "4:00 WE  2|";
        table[0][3] = "4:00 WE  2|";
        table[0][4] = "4:00 WE  2|";
        table[0][5] = "4:00 WE  2|";
        table[0][6] = "4:00 WE  2|";
        table[0][7] = "4:00 WE  2|";
        table[0][8] = "4:00 WE  2|";
        table[0][9] = "4:00 WE  2|";
        table[0][10] = "4:00 WE  2|";
    }

    public void setTable() {
        for (String[] strings : table) {
            for (String string : strings) {
                System.out.format("%10s", string + "\t");
            }
            System.out.println();
        }
    }
}
