package com.company;

import java.util.Scanner;

public class Data {
    public int MAX_LESSON = 10;
    public int MAX_WEEK = 5;
    public Scanner scanner = new Scanner(System.in);
    public int calendar[][] = new int[][]{{-1, 1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12, 13},
            {14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27},
            {28, 29, 30, -1, -1, -1, -1}};

    public String days[] = {" MO", "TU", "WE", "TH", "FR", "SA", "SU"};
    public int[][] lesson = new int[3][MAX_LESSON * MAX_WEEK];
    public int currentLesson = 0;
    public int currentHour = scanner.nextInt();
    public String currentDay = scanner.nextLine();

    public Data() {
        while (true) {
            int numberDay = -1;
            for (int i = 0; i < days.length; i++) {
                if (days[i].equals(currentDay)) {
                    numberDay = i;
                }
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < calendar[i].length; j++) {
                    if (j == numberDay && calendar[i][j] != -1) {
                        lesson[0][currentLesson] = numberDay;
                        lesson[1][currentLesson] = calendar[i][j];
                        lesson[2][currentLesson] = currentHour;
                        currentLesson++;
                    }
                }
            }
            if (scanner.hasNext("\\.")) {
                break;
            }
            currentHour = scanner.nextInt();
            currentDay = scanner.next();
        }
        for (int i = currentLesson - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (lesson[1][j] > lesson[1][j + 1]) {

                    int temp = lesson[1][j];
                    lesson[1][j] = lesson[1][j + 1];
                    lesson[1][j + 1] = temp;

                    temp = lesson[2][j];
                    lesson[2][j] = lesson[2][j + 1];
                    lesson[2][j + 1] = temp;

                    temp = lesson[0][j];
                    lesson[0][j] = lesson[0][j + 1];
                    lesson[0][j + 1] = temp;
                }
            }
        }
    }
}
