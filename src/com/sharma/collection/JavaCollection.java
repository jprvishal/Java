package com.sharma.collection;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class JavaCollection implements Runnable {

    @Override
    public void run() {

    }

    public static void main(String[] args) {

        HashMap<String, String> stringMap = new HashMap<String, String>();
        HashSet<String> stringSet = new HashSet<String>();
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        Stack<Long> longStack = new Stack<Long>();
        LinkedHashMap<String, Long> longLinkedHashMap = new LinkedHashMap<>();

        AtomicInteger intVal = new AtomicInteger(15);
        AtomicLong longVal = new AtomicLong(20L);

        System.out.println(intVal.addAndGet(1));
        System.out.println(intVal.getAndIncrement());
        System.out.println(intVal.getAndDecrement());

        System.out.println(longVal.addAndGet(1));
        System.out.println(longVal.getAndIncrement());
        System.out.println(longVal.getAndDecrement());
    }
}
