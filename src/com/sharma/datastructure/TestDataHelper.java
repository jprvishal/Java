package com.sharma.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDataHelper {

    public static int[] prepareIntArray() {
        StringBuilder randomNumberString = new StringBuilder();
        for (int index = 1; index < 8000; index++) {
            long random = (long) (Math.random() * index * 10);
            if (index > 1) {
                //System.out.print(", ");
                randomNumberString.append(",");
            }
            //System.out.print(random);
            randomNumberString.append(random);
        }

        //int[] arr = {35,33,42,10,14,19,27,44,5,4,2,1,3,1001,201,3,45,12,99,20,11,0,101,320,450,1000,900,800,700,750,600,500,580,110,8,15,875};

        List<String> list = new ArrayList<>(Arrays.asList(randomNumberString.toString().split(",")));
        int[] arr = new int[list.size()];
        int index = 0;
        for (String str: list) {
            arr[index++] = Integer.valueOf(str);
        }
        return arr;
    }
}
