package com.company;
/*\
Реализовать в IntegersArrayList и IntegersLinkedList следующие методы:

void add(int element, int index) - добавление элемента в произвольную позицию списка.
Учитывать, что index не должен быть больше, чем фактическое количество элементов в списке.

void remove(int index) - удаление элемента из списка по его порядковому номеру.

void reverse() - разворот списка.
 */

public class IntegersArrayList {
    private static final int DEFAULT_ARRAY_SIZE = 10;

    private int[] elements;
    private int count;

    class ArrayListIterator {
        int current;

        ArrayListIterator(){
            this.current = 0;
        }
        boolean hasNext(){
            return current < count;
        }
        int next(){
            int nextElemetn = elements[current];
            current++;
            return  nextElemetn;
        }
    }
    class ArrayListIteratorRever {
        int current;

        ArrayListIteratorRever(){
            this.current = 0;
        }
        boolean hasNext(){
            return current < elements.length - count;
        }
        int next(){
            int nextElemetn = elements[current];
            current++;
            return  nextElemetn;
        }
    }


    public IntegersArrayList() {
        this.count = 0;
        this.elements = new int[DEFAULT_ARRAY_SIZE];
    }

    public void add(int element, int index) {
        if (count < this.elements.length) {
            this.elements[index] = element;
            count++;
        } else {
            int newArray[] = new int[elements.length + (elements.length / 2)];
            for (int j = 0; j < elements.length; j++){
                newArray[j] = elements[j];
            }
            for(int i = index; i < newArray.length; i ++){
                newArray[index] = element;
            }
            count++;
            this.elements = newArray;
            // если выходим за пределы массива, то надо создать новый уже увеличеный в 1.5 раза
        } /*else {
            System.out.println("Array out of bounds");
        }*/

    }

    public void remove(int index) {
        int i = index;
        for (; i < elements.length - 1; i++) {
            int temp = 0;
            temp = elements[i + 1];
            elements[i + 1] = elements[i];
            elements[i] = temp;
        }
        count--;
    }

    public void reverse() {
        int temp;
        for (int i = 0; i < elements.length / 2; i++) {
            temp = elements[elements.length - i - 1];
            elements[elements.length  - i - 1] = elements[i];
            elements[i] = temp;
        }
    }

    public void setElementsRevers() {
        for (int i = elements.length - count; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public void setElements() {
        for (int i = 0; i < count; i++) {
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
