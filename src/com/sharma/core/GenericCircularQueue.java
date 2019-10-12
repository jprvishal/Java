package com.sharma.core;


import java.lang.reflect.Array;

public class GenericCircularQueue<T> {

    private T[] elements;
    private int head;
    private int tail;

    public GenericCircularQueue(Class<T> cls, int size) {
        elements = (T[])Array.newInstance(cls, size);
    }

    public static void main(String[] args) {
        String emailAddresses = "vsharma@aquent.com;vsharma@aquent.com";

        System.out.println(emailAddresses.split(";").length);
    }
}
