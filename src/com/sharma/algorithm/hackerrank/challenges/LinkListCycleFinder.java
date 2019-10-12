package com.sharma.algorithm.hackerrank.challenges;

import java.util.HashSet;
import java.util.Set;

public class LinkListCycleFinder {

   private static class Node {
        int data;
        Node next;

        Node(int d, Node n) {
            data = d;
            next = n;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1, null);
        Node next = new Node(2, null);
        head.next = next;
        Node next1 = new Node(3, null);
        next.next = next1;
        next1.next = next;

        boolean result = hasCycle(head);
        System.out.println(result);

    }

    private static boolean hasCycle(Node head) {
        boolean result = false;

        Set<Node> nodesSet = new HashSet<>();
        Node newHead = head;
        while (newHead != null) {
            if (nodesSet.contains(newHead)) {
                result = true;
                break;
            } else {
                nodesSet.add(newHead);
            }
            newHead = newHead.next;
        }

        return result;
    }

}
