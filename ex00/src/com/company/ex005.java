package com.company;

import java.util.Scanner;

public class ex005 {


    ex005() {
        firstNameStudent nameStudent = new firstNameStudent();
        Data data = new Data();
        statusStudent student = new statusStudent(nameStudent.count_student,data.currentLesson, nameStudent.tableStudents, data.lesson);
        printTable print = new printTable(data.currentLesson, data.lesson, data.days, student.schedule, nameStudent.tableStudents);
    }

}
