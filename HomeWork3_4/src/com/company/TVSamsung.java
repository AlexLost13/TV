package com.company;

import java.util.Random;

public class TVSamsung {
    private String name;
    private Channel channel[];
    private int MaxChannel = 3;
    private int count;
    private RemoteController remoteController;


    TVSamsung(String name){
        this.name = name;
        this.channel = new Channel[MaxChannel];
        this.count = 0;
    }

    void addChannel(Channel channel){
        if(count < MaxChannel){
            this.channel[count] = channel;
            channel.setTVSamsung(this);
            this.count++;
        }
    }
    void addRemoteControler(RemoteController remoteController){
        this.remoteController = remoteController;
    }
    void onChannel(){
        int number = remoteController.on();
        channel[number].setName();
        channel[number].show();

    }
}
