package com.sharma.core;

import java.util.*;

public class ThreadSafeHashMap {

    private Map map;

    ThreadSafeHashMap() {
        setup();
    }

    private void setup() {
        map = Collections.synchronizedMap(new HashMap<String, String>());
   }

    public Map getMap() {
        return map;
    }

    private void calculate() {
      for (int i = 0; i < 100; i++) {
          try {
              Thread.sleep(100);
          } catch (InterruptedException ie) {
              ie.printStackTrace();
          }

          String key = String.valueOf(Math.random());
          map.put(key, "User-1-"+key);
      }
    }

    private void calculate2() {

        for (int j=0; j < 100; j++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

            String key = String.valueOf(Math.random());
            map.put(key, "User-2-"+key);
        }
    }

    void process() {

        Thread t1 = new Thread(() -> calculate());
        t1.start();

        Thread t2 = new Thread(() -> calculate2());
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ThreadSafeHashMap userMap = new ThreadSafeHashMap();

        userMap.process();

//        userMap.getMap().keySet().stream()
//                .forEach(key -> System.out.println(key + "    " + userMap.getMap().get(key)));

        synchronized (userMap.getMap()) {
            userMap.getMap().keySet().stream()
                    .forEach(key -> System.out.println(key + "    " + userMap.getMap().get(key)));
        }

        WeakHashMap<String, Integer> map = new WeakHashMap<>();

        System.out.println("Map size == " + map.size());
    }
}
