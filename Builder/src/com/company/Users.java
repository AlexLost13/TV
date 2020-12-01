package com.company;

public class Users {
    private String firstName;
    private String lastName;
    private int age;
    private String adress;

    private Users(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.adress = builder.address;
    }

    static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;

        public Builder addFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder addLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder addAge(int age) {
            this.age = age;
            return this;
        }

        public Builder addAddress(String adress) {
            this.address = adress;
            return this;
        }

        public Users build() {
            return new Users(this);
        }
    }

}
