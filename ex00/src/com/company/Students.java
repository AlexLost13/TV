package com.company;

import java.util.Scanner;

public class Students {
    int MAX_STUDENTS = 10;
    String [] students = new String[MAX_STUDENTS];
    int CurrentStudent = 0;
    Scanner scanner = new Scanner(System.in);
    Students(){
        String student = scanner.nextLine();
        while (!student.equals(".")){
            students[CurrentStudent] = student;
            CurrentStudent++;
            student = scanner.nextLine();
        }
    }

}
