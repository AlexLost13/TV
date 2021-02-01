package com.company;

import java.util.Scanner;

public class ex03 {
    int week;
    // int[] control = new int[controlFinal];
    int appraisal;
    final static int weekFinal = 18;
    final static int controlFinal = 5;
    final static int appraisalFinal = 9;
    Scanner scanner = new Scanner(System.in);
    Node first;
    Node last;
    int count = 1;

    ex03() {
        while (week != 42) {
            this.week = getWeek();
            if (week <= count && count < weekFinal) {
                addWeek(week);
            } else {
                System.out.println("Illegal Argument");
                break;
            }
        }
    }
    /*public boolean equals(Node node) {
        return this.first.value ==  node.value;
    }*/
    public void addWeek(int week) {
        Node newNode = new Node(week);
        int newArray[] = new int[controlFinal];
        if (this.first == null) {
            for (int i = 0; i < controlFinal; i++) {
                newArray[i] = getAppraisal();
            }
            this.first = newNode;
            first.array = newArray;
            count++;
            System.out.println("week" + " " + week);
            for (int i = 0; i < controlFinal; i++) {
                System.out.print(first.array[i] + " ");
            }
            System.out.println();

        } else {
            this.last.setNext(newNode);
            for (int i = 0; i < controlFinal; i++) {
                newArray[i] = getAppraisal();
            }
            this.last = newNode;
            last.array = newArray;
            count++;
            System.out.println("week" + " " + week);
            for (int i = 0; i < controlFinal; i++) {
                System.out.print(last.array[i] + " ");
            }
            System.out.println();
        }
        this.last = newNode;

    }
    private static class Node {
        private int value;
        private Node next;
        private int array[];

        Node(int value) {
            this.value = value;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }

    public int getWeek() {
        if (week < weekFinal) {
            return week = scanner.nextInt();
        } else return -1;
    }

    public int getAppraisal() {
        if (appraisal < appraisalFinal) {
            return appraisal = scanner.nextInt();
        } else return -1;
    }
}
