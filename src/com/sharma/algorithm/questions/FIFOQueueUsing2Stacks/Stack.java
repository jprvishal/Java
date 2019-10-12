package com.sharma.algorithm.questions.FIFOQueueUsing2Stacks;

public interface Stack {
    final int MAX_ELEMENTS_SIZE = 20;

    public Integer pop();
    public Integer peep();
    public boolean push(Integer element);
    public int size();
    public void printStack();

}
