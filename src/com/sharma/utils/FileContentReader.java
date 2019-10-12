package com.sharma.utils;


//import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FileContentReader {

    public static void main(String[] args) {

        readFileContents();

        testOnArrayList();

        testOnHashMap();

    }

    private static void testOnHashMap() {
        HashMap<String, String> personMap = new HashMap();
        personMap.put("key1", "value1");
        personMap.put("KeyToBeRemoved", "value1");
        personMap.put("key2", "value2");

        System.out.println("Map size == " + personMap.size());
        Stream<Map.Entry<String, String>> filteredStream = personMap.entrySet()
                .stream().filter(entry -> entry.getKey().equals("KeyToBeRemoved") ? true: false);

        System.out.println("Map size after stream filter == " + personMap.size());
        System.out.println("Map.Entry size after stream filter == " + filteredStream.count());

        personMap.entrySet().removeIf(entry -> entry.getKey().equals("KeyToBeRemoved") ? true: false);
        System.out.println("Map size after removeIf() == " + personMap.size());
    }

    private static void testOnArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(10000);

        System.out.println("ArrayList size == " + list.size());
        Stream<Integer> filteredList = list.stream().filter(entry -> entry.intValue() > 10 ? true : false);
        System.out.println("ArrayList size after filter == " + list.size());
        System.out.println("stream size after filter == " + filteredList.count());
    }

    private static void readFileContents() {
        try {
            String fileNamePath = "C:\\Users\\vs86591\\Documents\\role-script.json";
            FileReader fileReader = new FileReader(fileNamePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            StringBuffer fileContent = new StringBuffer();
            while ((line = bufferedReader.readLine()) != null) {
                fileContent.append(line);
               System.out.println(line);
            }
            System.out.println();
        //    Gson gson = new Gson();
        //    System.out.println(gson.toJson(fileContent.toString()));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
