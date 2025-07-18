package org.example.Coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesElementInArray {


    public void duplicatesInArray(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        map.forEach((key,value)->{
            if(value>1)
            System.out.println(key);
        });
    }
    public void duplicatesInArrayUsingStream(int[] arr){
        List<Integer> duplicates= Arrays.stream(arr) /*creates an InputStream from the array.*/
                .boxed() // converts primitive int to Integer (required for collectors).
                .collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting()
                ))
                .entrySet().stream()
                .filter(entry ->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        duplicates.forEach(System.out::println);
    System.out.println(duplicates);
    }


}
