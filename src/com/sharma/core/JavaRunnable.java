package com.sharma.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class JavaRunnable implements Runnable {

    private String message;

    JavaRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new JavaRunnable("Hello from JavaRunnable"));
        thread.start();

        JavaRunnable runnable = new JavaRunnable("Hello from JavaRunnable using run()");
        runnable.run();

        Runnable runnable2 = () -> System.out.println("Hello from JavaRunnable using Lambda 2");

        Runnable runnable1 = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(30);
                System.out.println("Hello from JavaRunnable using Lambda");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(runnable);
        executorService.submit(runnable1);
        executorService.submit(runnable2);
        int[] arr = {2,5,3,8,1, 11, 15, 23};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> primeToRemove = new ArrayList<>();

        for(int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

        for (Integer num : list) {
            if (num == 1) {
                continue;
            }

            if (num == 2 || num == 3) {
                primeToRemove.add(num);
            }

            boolean isPrime = false;
            isPrime = isPrime(num);

            if (isPrime ) {
                primeToRemove.add(num);
            }
        }

        System.out.println("Prime numbers in list");
        for(int index = 0; index < primeToRemove.size(); index++) {
            System.out.println(primeToRemove.get(index));
        }

        list.removeAll(primeToRemove);

        System.out.println("List after prime removed");
        for(int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

        executorService.shutdown();
  }

    private static boolean isPrime(Integer num) {
        for (int x = 2; x < Math.sqrt(num); x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}
