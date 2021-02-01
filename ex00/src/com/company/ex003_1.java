package com.company;

import java.util.Scanner;

public class ex003_1 {
    int week;
    int appraisal;
    final static int weekFinal = 18;
    final static int appraisalFinal = 9;
    Scanner scanner = new Scanner(System.in);
    int count = 1;

    ex003_1() {
        while (week != 42) {
            week = scanner.nextInt();
            if (week < weekFinal && week == count) {
                int appraisal1 = addAppraisal();
                int appraisal2 = addAppraisal();
                int appraisal3 = addAppraisal();
                int appraisal4 = addAppraisal();
                int appraisal5 = addAppraisal();
                System.out.println("Week" + " " + week);
                System.out.print(appraisal1 + " ");
                System.out.print(appraisal2 + " ");
                System.out.print(appraisal3 + " ");
                System.out.print(appraisal4 + " ");
                System.out.print(appraisal5 + " ");
                System.out.println();
                count++;
            } else {
                System.out.println("Illegal Argument");
                break;
            }

        }
    }

    public int addAppraisal() {
        this.appraisal = scanner.nextInt();
        if (appraisal < appraisalFinal) {
            return this.appraisal;
        }
        return week = 42;
    }
}
