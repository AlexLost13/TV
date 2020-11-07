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
    public int get(int index){
        // реализовать получение элемента
        if (count >= 0 && index < count){

        }
        return index = count;
    }
}
