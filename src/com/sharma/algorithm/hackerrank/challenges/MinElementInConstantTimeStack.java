package com.sharma.algorithm.hackerrank.challenges;

public class MinElementInConstantTimeStack {

    private int MAX_SIZE;
    private int[] valueStack;
    private int[] minimumValueStack;
    private  int elementCount = 0;

    public MinElementInConstantTimeStack(int size) {
        MAX_SIZE = size;
        valueStack = new int[MAX_SIZE];
        minimumValueStack = new int[MAX_SIZE];
    }

    public void push(int element) throws  Exception {
        if (valueStack.length == (MAX_SIZE - 1)) {
            throw new Exception("Stack is full!");
        }

        if (elementCount == 0) {
            valueStack[elementCount] = element;
            minimumValueStack[elementCount++] = element;
        } else {

            int minValue = minimumValueStack[elementCount-1];
            if (element < minValue ) {
                minValue = element;
            }
            valueStack[elementCount] = element;
            minimumValueStack[elementCount++] = minValue;
        }
    }

    public int pop() throws Exception {
        if (elementCount == 0) {
            throw new Exception("Stack is empty!");
        }

        int element = valueStack[elementCount-1];
        int minVallue = minimumValueStack[elementCount -1];
        elementCount--;

        return element;
    }

    public int peek() throws Exception {

        if (elementCount == 0) {
            throw new Exception("Stack is empty!");
        }

        return valueStack[elementCount-1];
    }

    public int getMinmumElement() throws Exception {

        if (elementCount == 0) {
            throw new Exception("Stack is empty!");
        }

        return minimumValueStack[elementCount-1];
    }


    public static void main(String[] args) {
        MinElementInConstantTimeStack mimNumInConstantTimeStack = new MinElementInConstantTimeStack(10);

        try {
            mimNumInConstantTimeStack.push(10);
            mimNumInConstantTimeStack.push(11);
            mimNumInConstantTimeStack.push(5);
            mimNumInConstantTimeStack.push(10);
            mimNumInConstantTimeStack.push(15);
            mimNumInConstantTimeStack.push(1);

            System.out.println("Min Element == " + mimNumInConstantTimeStack.getMinmumElement());
            mimNumInConstantTimeStack.pop();
            System.out.println("Min Element == " + mimNumInConstantTimeStack.getMinmumElement());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
