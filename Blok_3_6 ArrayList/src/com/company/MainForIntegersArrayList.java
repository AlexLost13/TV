package com.company;

public class MainForIntegersArrayList {

    public static void main(String[] args) {
        IntegersArrayList list = new IntegersArrayList();

        list.add(1, 0);
        list.add(2, 1);
        list.add(3, 2);
        list.add(4, 3);
        list.add(5, 4);
        list.add(6, 5);
        list.add(7, 6);
        list.add(8, 7);
        list.add(9, 8);
        list.add(10, 9);
        list.add(11, 10);
        list.add(12, 11);
        IntegersArrayList.ArrayListIterator iterator = list.new ArrayListIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        list.remove(5);
        IntegersArrayList.ArrayListIterator iterator1 = list.new ArrayListIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
       // list.setElements();
        list.reverse();
        //list.setElementsRevers();
        IntegersArrayList.ArrayListIteratorRever iterator2 = list.new ArrayListIteratorRever();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
