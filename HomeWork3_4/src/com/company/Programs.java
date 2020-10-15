package com.company;

public class Programs {
    private String name;
    private Channel channel;

    Programs(String name){
        this.name = name;
    }
    void setChannel(Channel channel){
        this.channel = channel;
    }
    void setName(){
        this.name = name;
        System.out.println(name);
    }
}
