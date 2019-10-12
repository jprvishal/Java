package com.sharma.algorithm.hackerrank.challenges;

import java.util.Scanner;
import java.util.Stack;

public class ATaleOfTwoStacks {

    public static class MyQueue<T> {

        private Stack<T> stackNewestOnTopHead = new Stack<>();
        private Stack<T> stackOldestOnTopTail = new Stack<>();

        private void enqueue(T value) {

            stackNewestOnTopHead.push(value);
        }

        private void transferElementsFromHeadToTailStack() {
            if (stackOldestOnTopTail.isEmpty()) {
                while (!stackNewestOnTopHead.empty()) {
                    stackOldestOnTopTail.push(stackNewestOnTopHead.pop());
                }
            }
        }

        private T peek() {
            transferElementsFromHeadToTailStack();

            return stackOldestOnTopTail.peek();
        }

        private T dequeue() {
            transferElementsFromHeadToTailStack();

            return stackOldestOnTopTail.pop();
        }
    }

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int elementsCount = scan.nextInt();
        for (int index = 0; index < elementsCount; index++) {
            int operation = scan.nextInt();
            if (operation == 1) {
               Integer value = scan.nextInt();
               queue.enqueue(value);
            } else if (operation == 2) {
                queue.dequeue();
            } else if (operation == 3) {
                System.out.println(queue.peek());
            } else {
                System.out.println("Invalid Operation " + operation);
            }
        }

    }
}
