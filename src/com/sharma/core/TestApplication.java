package com.sharma.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestApplication  {

    public static void main(String[] args) {

        String[] employeeNames = {"Me", "You", "They", "That", "We", "Who", "Whom", "this" };

        Stream.of(employeeNames)
                .sorted()
                .map(name -> name)
                .filter(name -> name.toUpperCase().startsWith("T"))
                .forEach(name -> System.out.println(name));

        List<String> list = Stream.of(employeeNames)
                .sorted()
                .collect(Collectors.toList());


        //Collection<String> list = new ArrayList<>();
        //list.forEach();
        //int x = 10;
        //int y = 25;

        String maxDeviceIdToProcess = "123";
        Integer maxDeviceId = maxDeviceIdToProcess == null || "null".equalsIgnoreCase(maxDeviceIdToProcess)? 0: Integer.parseInt(maxDeviceIdToProcess);

        System.out.println("maxDeviceId == " + maxDeviceId);

    }

}
