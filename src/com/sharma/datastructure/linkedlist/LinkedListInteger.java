package com.sharma.datastructure.linkedlist;

public class LinkedListInteger {
    private class Node {
        Integer data;
        Node next;

        Node(Integer dataValue, Node nextValue) {
            data = dataValue;
            next = nextValue;
        }

        Integer getData() {
            return data;
        }

        Node getNext() {
            return next;
        }
    }

    private Node root;
    private Node last;

    public Node addElement(Integer element) {
        Node newNode = new Node(element, null);
        if (root == null) {
            root = newNode;
            last = root;

            return root;
        }

        if (last == root) {
            root.next = newNode;
        } else {
            last.next = newNode;
        }

        last = newNode;

        return root;
    }

    public void printList() {
        Node node = root;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
}
