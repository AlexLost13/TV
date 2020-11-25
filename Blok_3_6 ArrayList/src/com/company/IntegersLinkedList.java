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

    public IntegersLinkedList(){
        this.count = 0;
    }

    public void add(int element) {
        Node newNode = new Node(element);
        if(first == null){
            this.first = newNode;
            this.last = newNode;
        }else {
/*            Node current = first;
            while (current.getNext() != null){
                current.getNext();
            }
            current.setNext(newNode);

 */
            this.last.setNext(newNode);
            this.last = newNode;
        }
        this.count++;
    }
    public void setIntersLinkedList(){
        Node current = first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    public void get(int index){
        Node current = first;
        int number = 0;
        while (number != index -1) {
            current = current.getNext();
            number++;
        }
        System.out.println(current.getValue());
    }

    public int indexOf(int index){
        // реализовать получение элемента
        int number = 1;
        Node current = first;
        Node currentIndex = new Node(index);
        while (currentIndex.getValue() != current.getValue()) {
            current = current.getNext();
            number++;
            }
        index = number;
        return index;
    }
}
