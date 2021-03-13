package com.company;

import java.util.Scanner;

public class ex005Mars {
    // максимальное количество студентов
    private static int STUDENTS_MAX_COUNT = 10;
    // максимальное количество уроков в неделю
    private static int LESSONS_IN_WEEK_MAX_COUNT = 5;
    // максимальное количество недель
    private static int WEEKS_COUNT = 5;

    ex005Mars() {
        Scanner scanner = new Scanner(System.in);
        // календарь сентября 2020-го года
        int calendar[][] = {{-1, 1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12, 13},
                {14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27},
                {28, 29, 30, -1, -1, -1, -1}};
        // дни недели
        String days[] = {"MO", "TU", "WE", "TH", "FR", "SA", "SU"};

        // массив для студентов
        String students[] = new String[STUDENTS_MAX_COUNT];
        int currentStudentsCount = 0;
        String currentStudent = scanner.nextLine();
        // пока не точка мы заполняем студентов
        while (!currentStudent.equals(".")) {
            students[currentStudentsCount] = currentStudent;
            currentStudentsCount++;
            currentStudent = scanner.nextLine();
        }
        // массив чисел с тремя строками и 25-ю столбцами (максимальное количество уроков)
        // [ ... ]
        // [ ... ]
        // [ ... ]
        int lessons[][] = new int[3][LESSONS_IN_WEEK_MAX_COUNT * WEEKS_COUNT];
        int currentLessonsCount = 0;
        // считываешь с консоли текущий час
        int currentHour = scanner.nextInt();
        // считали с консоли день
        String currentDayOfWeek = scanner.next();
        // запускаем бесконечный цикл
        while (true) {
            // номер дня = -1
            int dayNumber = -1;
            // пробегаемся по всем дням (с понедельника по воскресенье
            for (int i = 0; i < days.length; i++) {
                // если текущий день недели равен тому, что был в массиве дней
                if (days[i].equals(currentDayOfWeek)) {
                    // текущий номер дня - номер дня недели
                    dayNumber = i;
                }
            }
            // ^ - если человек ввел WE -> dayNumber = 2
            // пробегаем все дни календаря
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < calendar[i].length; j++) {
                    // если у нас текущий номер дня совпал с календарем и там не было -1
                    // значит можно запоминать урок
                    if (j == dayNumber && calendar[i][j] != -1) {
                        // в первую строку массива уроков записываешь номер дня (день недели)
                        lessons[0][currentLessonsCount] = dayNumber;
                        // во вторую строку массива уроков записываешь число
                        lessons[1][currentLessonsCount] = calendar[i][j];
                        // в третью строку массива час
                        lessons[2][currentLessonsCount] = currentHour;
                        currentLessonsCount++;
                        // для 2 MO получится -> 7, 14, 21, 28
                        // lessons[0] = {0, 0, 0, 0}
                        // lessons[1] = {7, 14, 21, 28}
                        // lesson[2] = {2, 2, 2, 2}
                        // currentLessonsCount -> 4
                    }
                }
            }
            // если дальше точка - то останавливаем цикл
            if (scanner.hasNext("\\.")) {
                break;
            }
            // считываешь новый час
            currentHour = scanner.nextInt();
            // считываешь новую неделю
            currentDayOfWeek = scanner.next();
        }
        // TODO: зависит от ввода
        scanner.nextLine();
        scanner.nextLine();
        // сортируем список уроков по значению даты числа
        for (int i = currentLessonsCount - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (lessons[1][j] > lessons[1][j+1]) {

                    int temp = lessons[1][j];
                    lessons[1][j] = lessons[1][j+1];
                    lessons[1][j+1] = temp;

                    temp = lessons[2][j];
                    lessons[2][j] = lessons[2][j+1];
                    lessons[2][j+1] = temp;

                    temp = lessons[0][j];
                    lessons[0][j] = lessons[0][j+1];
                    lessons[0][j+1] = temp;
                }
            }
        }
        // массив посещений размер - количество студентов на количество уроков
        int schedule[][] = new int[currentStudentsCount][currentLessonsCount];
        // считываем имя студента
        currentStudent = scanner.next();
        // считываем час урока
        currentHour = scanner.nextInt();
        // считываем дату урока
        int currentDate = scanner.nextInt();
        // считываем статус посещения
        String status = scanner.next();

        while (true) {
            int studentNumber = -1;
            // если нашли студента в списке студентов
            for (int i = 0; i < currentStudentsCount; i++) {
                if (currentStudent.equals(students[i])) {
                    // запоминаем его номер в списке (если John был записан первым, то у него номер 0)
                    studentNumber = i;
                }
            }
            int lessonNumber = -1;
            // ищем номер урока
            for (int i = 0; i < currentLessonsCount; i++) {
                // если нашли урок, который попадает под дату и время
                if (lessons[1][i] == currentDate && lessons[2][i] == currentHour) {
                    // запоминаем номер урока
                    lessonNumber = i;
                }
            }
            // в зависимости от статуса
//            if (status.equals("HERE")) {
//                schedule[studentNumber][lessonNumber] = 1;
//            } else {
//                schedule[studentNumber][lessonNumber] = -1;
//            }
            int statusValue = status.equals("HERE") ? 1 : -1;
            // вносим в расписание статус посещения студента в уроке
            schedule[studentNumber][lessonNumber] = statusValue;

            if (scanner.hasNext("\\.")) {
                break;
            }
            // считываешь данные следующего студента
            currentStudent = scanner.next();
            currentHour = scanner.nextInt();
            currentDate = scanner.nextInt();

            status = scanner.next();
        }

        System.out.printf("%10s","");
        for (int i = 0; i < currentLessonsCount; i++) {
            System.out.printf("%1d:00%3s%3d|", lessons[2][i], days[lessons[0][i]], lessons[1][i]);
        }
        System.out.println();

        for (int i = 0; i < schedule.length; i++) {
            System.out.printf("%10s", students[i]);
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