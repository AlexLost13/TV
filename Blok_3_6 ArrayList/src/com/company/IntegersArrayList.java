package com.company;
/*\
Реализовать в IntegersArrayList и IntegersLinkedList следующие методы:

void add(int element, int index) - добавление элемента в произвольную позицию списка.
Учитывать, что index не должен быть больше, чем фактическое количество элементов в списке.

void remove(int index) - удаление элемента из списка по его порядковому номеру.

void reverse() - разворот списка.
 */

import java.util.Random;

public class IntegersArrayList {
    private static final int DEFAULT_ARRAY_SIZE = 10;

    private int elements[];

    private int count;
    private int elemetsRevers[];

    public IntegersArrayList() {
        this.elements = new int[DEFAULT_ARRAY_SIZE];
        this.count = 0;

    }

    public void add(int element, int index) {
        if (index < this.elements.length) {
            this.elements[index] = element;
            count++;
        } else {
            System.out.println("Array out of bounds");
        }
    }

    public void remove(int index) {
        elements[index] = 0;
    }

    public void reverse() {
        this.elemetsRevers = new int[DEFAULT_ARRAY_SIZE];
        int temp = 0;
        for (int i = 0; i < elements.length; i++) {
            temp = elemetsRevers[i];
            elemetsRevers[i] = elements[elements.length - i - 1];
            elements[elements.length - i - 1] = temp;

        }
    }
    public void setElementsRevers() {
        for (int i = 0; i < elemetsRevers.length; i++) {
            System.out.println(elemetsRevers[i]);
        }
    }

    public void setElements() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);

        }
    }



    /* public void add(int element) {
        if (count < this.elements.length) {
            this.elements[count] = element;
            count++;
        }else {
            System.out.println("Array out of bounds");
        }
    }

    public  int get(int index) {
        if (index >= 0 && index < count){
            return elements[index];
        }else {
            System.out.println(" Index out of range");
            return -1;
        }
    }*/

}
