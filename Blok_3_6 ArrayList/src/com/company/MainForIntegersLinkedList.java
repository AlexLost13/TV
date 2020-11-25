package com.company;

public class MainForIntegersLinkedList {
    public static void main(String[] args) {
        IntegersLinkedList linkedList = new IntegersLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.setIntersLinkedList();
        System.out.println(linkedList.indexOf(9));
        linkedList.get(7);

        int b = 0;
    }
}
