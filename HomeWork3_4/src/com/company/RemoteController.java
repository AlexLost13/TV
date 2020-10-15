package com.company;

import java.util.Random;

public class RemoteController {
    private String name;
    private TVSamsung tvSamsung;
    private int MaxChannel = 3;

    RemoteController(String name){
        this.name = name;
    }
    void addTVSamsung(TVSamsung tvSamsung){
        this.tvSamsung = tvSamsung;
    }
    public int on(){
        Random random = new Random();
        int ChannelNumber = random.nextInt(MaxChannel);
        return ChannelNumber;
    }
}
