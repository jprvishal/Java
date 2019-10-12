package com.sharma.datastructure.linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedListInteger linkedList = new LinkedListInteger();

        linkedList.addElement(15);
        linkedList.addElement(5);
        linkedList.addElement(35);
        linkedList.addElement(25);

        linkedList.printList();
    }
}
