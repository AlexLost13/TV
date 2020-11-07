package com.company;

public class MainForNodes {
    public static void main(String[] args) {

        Node a = new Node(7);
        Node b = new Node(-3);
        Node c = new Node(6);
        Node d = new Node(5);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);

        Node current = a;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

}
