package com.company;

import java.util.Random;

public class Channel {
    private String name;
    private Programs programs[];
    private int MaxPrograms = 3;
    private int count;
    private TVSamsung tvSamsung;

    Channel(String name){
        this.name = name;
        this.programs = new Programs[MaxPrograms];
        this.count = 0;
    }
    void addPrograms (Programs programs){
        if(count < MaxPrograms){
            this.programs[count] = programs;
            programs.setChannel(this);
            this.count++;
        }

    }
    void setTVSamsung(TVSamsung tvSamsung){
        this.tvSamsung = tvSamsung;
    }
    void show(){
        Random random = new Random();
        int number = random.nextInt(MaxPrograms);
        programs[number].setName();
    }
    void setName(){
        this.name = name;
        System.out.println("Channel № " + name);
    }

}
