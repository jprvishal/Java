package com.sharma.algorithm.questions.FIFOQueueUsing2Stacks;

public class StackImpl implements Stack {
    private int[] elements;
    private int elementCount;
    @Override
    public Integer pop() {
        if (elementCount > 0) {
            return elements[elementCount--];
        } else {
            System.out.println("Stack is empty!");
        }

        return null;
    }

    @Override
    public Integer peep() {
        if (elementCount > 0) {
            return elements[elementCount];
        } else {
            System.out.println("Stack is empty!");
        }

        return null;
    }

    @Override
    public boolean push(Integer element) {
        if (elementCount == MAX_ELEMENTS_SIZE) {
            System.out.println("Stack is full!");
            return false;
        }

        elements[elementCount++] = element;
        return true;
    }

    @Override
    public int size() {
        return elementCount;
    }

    @Override
    public void printStack() {

//        for () {
//
//        }
    }
}
