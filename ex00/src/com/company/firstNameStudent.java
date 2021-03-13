package com.company;

import java.util.Scanner;

public class firstNameStudent {
    Scanner scanner = new Scanner(System.in);
    public int count_student = 0;
    public String firstName = scanner.nextLine();
    int max_student = 10;
    public String[] tableStudents = new String[max_student];


    public firstNameStudent() {
        while (true) {
            tableStudents[count_student] = firstName;
            count_student++;
            if (scanner.hasNext("\\.")) {
                break;
            }
            firstName = scanner.nextLine();

        }
    }

}
