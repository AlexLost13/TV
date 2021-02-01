package com.company;

import java.util.Scanner;

public class ex004 {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    char[] result = text.toCharArray();
    char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    int[] counts = new int[26];

    ex004() {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (result[i] == alphabet[j]) {
                    counts[j]++;
                }
            }
        }
        for (int i = counts.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (counts[j] > counts[j + 1]) {
                    int tmp = counts[j];
                    counts[j] = counts[j + 1];
                    counts[j + 1] = tmp;
                    char temp = alphabet[j];
                    alphabet[j] = alphabet[j + 1];
                    alphabet[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < counts.length; i++) {
            for (int j = 1; j < counts.length; j++) {
                if (counts[i] == counts[j]) {
                    int a = (int) alphabet[i] - (int) 'a' + 1;
                    int b = (int) alphabet[j] - (int) 'a' + 1;
                    if (a > b) {
                        int tmp = counts[i];
                        counts[i] = counts[j];
                        counts[j] = tmp;
                        char temp = alphabet[i];
                        alphabet[i] = alphabet[j];
                        alphabet[j] = temp;
                    }
                }
            }
        }
        for (int j = alphabet.length - 1; j > alphabet.length - 10; j--) {
            System.out.println(alphabet[j] + " " + counts[j]);
        }
    }
}
