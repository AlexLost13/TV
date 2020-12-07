package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        User user = User.Builder.newBuilder()
                .firstName("Marsel")
                .lastName("Sidikov")
                .build();
        System.out.println(user.firstName);


    }
}
