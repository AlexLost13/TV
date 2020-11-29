package com.company;
/*
Реализовать в IntegersArrayList и IntegersLinkedList следующие методы:

void add(int element, int index) - добавление элемента в произвольную позицию списка.
Учитывать, что index не должен быть больше, чем фактическое количество элементов в списке.

void remove(int index) - удаление элемента из списка по его порядковому номеру.

void reverse() - разворот списка.
 */

public class IntegersLinkedList {
    private Node first;
    private Node last;
    private int count;

    private static class Node {

        private int value;

        private Node next;

         Node(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    class ArrayListIterator {
        int current;

        ArrayListIterator(){
            this.current = 0;
        }
        boolean hasNext(){
            return current < count;
        }
        int next(){
            int nextElemetn = first.value;
            current++;
            return  nextElemetn;
        }
    }

    public IntegersLinkedList() {
        this.count = 0;
    }

    public void add(int element) {
        Node newNode = new Node(element);
        if (first == null) {
            this.first = newNode;
        } else {
            this.last.setNext(newNode);
        }
        this.last = newNode;
        this.count++;
    }

    public void setIntersLinkedList() {
        Node current = first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public int get(int index) {
        Node current = first;
        int number = 0;
        while (number != index - 1) {
            current = current.next;
            number++;
        }
        return current.value;
    }

    public void remove(int index) {
        Node current = first;
        int number = 0;
        while (number != index - 2 && current != null) {
            current = current.next;
            number++;
        }
        current.setNext(current.next.next);
    }

    public void reverse() {
        Node current = first;
        Node temp = null;
        Node reverseCurrent = null;
        while (current != null) {
            temp = current.next;
            current.setNext(reverseCurrent);
            reverseCurrent = current;
            first = current;
            current = temp;
        }
        while (reverseCurrent != null) {
            System.out.println(reverseCurrent.value);
            reverseCurrent = reverseCurrent.next;
        }
    }

    public int indexOf(int index) {
        // реализовать получение элемента
        int number = 1;
        Node current = first;
        Node currentIndex = new Node(index);
        while (currentIndex.value != current.value) {
            current = current.next;
            number++;
        }
        index = number;
        return index;
    }
}
