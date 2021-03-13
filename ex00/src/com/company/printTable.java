package com.company;

public class printTable {

    printTable(int currentLesson,int lesson[][],String days[], int schedule[][], String tableStudents[] ){
        System.out.printf("%10s","");
        for (int i = 0; i < currentLesson; i++) {
            System.out.printf("%1d:00%3s%3d|", lesson[2][i], days[lesson[0][i]], lesson[1][i]);
        }
        System.out.println();

        for (int i = 0; i < schedule.length; i++) {
            System.out.printf("%10s", tableStudents[i]);
            for (int j = 0; j < schedule[i].length; j++) {
                if (schedule[i][j] != 0) {
                    System.out.printf("%10d|", schedule[i][j]);
                } else {
                    System.out.printf("%10s|", "");
                }
            }
            System.out.println();
        }
    }
}
