package com.company;

import java.util.Random;

public class MainForIntegersArrayList {

    public static void main(String[] args) {
	IntegersArrayList list = new IntegersArrayList();



	list.add(1, 5);
	list.add(2, 3);
	list.add(3, 1);
	list.add(4, 4);
	list.add(5, 7);
	list.add(6, 0);
	list.add(7, 8);
	list.add(8, 2);
	list.add(9, 6);
	list.add(10, 9);
	list.remove(5);
	list.setElements();
	list.reverse();
	list.setElementsRevers();

    }
}
