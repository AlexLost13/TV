package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Users user = new Users.Builder()
                .addFirstName("FF")
                .addAge(22)
                .build();
    }
}
