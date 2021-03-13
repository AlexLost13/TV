package com.company;

import java.util.Scanner;

public class statusStudent {

    public int schedule[][];
    Scanner scanner = new Scanner(System.in);

    public String currentStudent = scanner.next();
    public int currentHour = scanner.nextInt();
    public int currentDate = scanner.nextInt();
    public String status = scanner.next();


    public statusStudent(int count_student, int currentLesson, String tableStudents[], int lesson[][]) {
        schedule = new int[count_student][currentLesson];
        while (true) {
            int studentNumber = -1;

            for (int i = 0; i < count_student; i++) {
                if (currentStudent.equals(tableStudents[i])) {
                    studentNumber = i;
                }
            }
            int lessonNumber = -1;
            for (int i = 0; i < currentLesson; i++) {
                if (lesson[1][i] == currentDate) {
                    if (lesson[2][i] == currentHour) {
                        lessonNumber = i;
                    }
                }
            }
            int statusValue = status.equals("HERE") ? 1 : -1;

            schedule[studentNumber][lessonNumber] = statusValue;

            if (scanner.hasNext("\\.")) {
                break;
            }
            currentStudent = scanner.next();
            currentHour = scanner.nextInt();
            currentDate = scanner.nextInt();

            status = scanner.next();
        }
    }
}
