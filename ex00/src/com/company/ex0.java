package com.company;

public class ex0 {
    int number;
    int summa;
    public ex0 (){
        this.number = getNumber();

    }
    public int getNumber() {
        return number;
    }
     public int summa(){
        int i = number;
        while (i != 0){
            summa += (i % 10);
           i = i /10;
        }
        return summa;
    }
}
