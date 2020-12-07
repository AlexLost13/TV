package com.company;

public class User {
    public String firstName;
    public String lastName;
    public int age;
    public String address;


    private User(Builder builder) {
        Builder.newBuilder();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.address = builder.getAddress();
    }

    public static class Builder {

        public static Builder newBuilder() {
            return new Builder();
        }

        private String firstName;
        private String lastName;
        private int age;
        private String address;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }


}
