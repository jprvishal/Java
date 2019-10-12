package com.sharma.core;

import java.util.ArrayList;
import java.util.List;

//Class to remove prime number from an Integer list
public class QuestionOne {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(-11);
        list.add(-2);
        list.add(-1);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(17);
        list.add(11);
        list.add(121);

        System.out.println(list);

        list = removePrimeNumber(list);
        //list = testPrimeNumber(list);

        System.out.println(list);
    }

    private static List<Integer> removePrimeNumber(List<Integer> sourceList) {
        List<Integer> noPrimeNumberList = new ArrayList<>();

        for (Integer element : sourceList) {
            if (element <= 0) {
                noPrimeNumberList.add(element);
                continue;
            }

            for (int counter = 2; counter <= element; counter++) {
                if (element % counter == 0 ) {
                    if (element != counter) {
                       noPrimeNumberList.add(element);
                       break;
                    }

                }
            }
        }

        return noPrimeNumberList;
    }

    public static List <Integer> testPrimeNumber(List<Integer> number){
        //List <Integer> number = new ArrayList<Integer>();
        List <Integer> nonPrimeNumber = new ArrayList<Integer>();
//        for(int i=0;i<30; i++){
//            Integer j = new Integer(i);
//            number.add(j);
//        }
        System.out.println(number.size());
        for(Integer num: number){
            for(int i=2;i <= num;i++){
                if(num.intValue() % i == 0 && num.intValue() == i) {
                    System.out.println("Number is prime " + num);
                }
                else if(num.intValue() == 0 || num.intValue() % i == 0 ){
                    nonPrimeNumber.add(num);
                    break;
                }
            }
        }
        for(Integer i : nonPrimeNumber){
            System.out.println("Nonprime number " + i.intValue());
        }

        return nonPrimeNumber;

    }
}
