package com.company;
/*Телевизор - название модели, список каналов (каждый канал имеет свой номер).
Канал - название канала, список передач.
Передача - название передачи.
Пульт - имеет ссылку на телевизор.
В классе RemoteController реализовать метод on(int channelNumber), который "включит" какой-либо канал, где будет "показана" какая-либо случайная передача.
 */

public class Main {

    public static void main(String[] args) {
	TVSamsung TV = new TVSamsung("Samsung");
	Programs programs1 = new Programs("Programa1");
	Programs programs2 = new Programs("Programa2");
	Programs programs3 = new Programs("Programa3");
	Channel channel1 = new Channel("1");
	channel1.addPrograms(programs1);
	channel1.addPrograms(programs2);
	channel1.addPrograms(programs3);
	Channel channel2 = new Channel("2");
	channel2.addPrograms(programs1);
	channel2.addPrograms(programs2);
	channel2.addPrograms(programs3);
	Channel channel3 = new Channel("3");
	channel3.addPrograms(programs1);
	channel3.addPrograms(programs2);
	channel3.addPrograms(programs3);
	TV.addChannel(channel1);
	TV.addChannel(channel2);
	TV.addChannel(channel3);
	RemoteController pult = new RemoteController("Pult");
	pult.addTVSamsung(TV);
	TV.addRemoteControler(pult);
	TV.onChannel();

    }
}
