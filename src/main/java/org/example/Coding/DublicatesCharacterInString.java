package org.example.Coding;

import java.util.HashMap;
import java.util.Map;

public class DublicatesCharacterInString {

    public static void duplicateCharacter(String s){
        Map<Character,Integer> duplicatesMap=new HashMap<>();
        for (char a:s.toCharArray()){
            duplicatesMap.put(a,duplicatesMap.getOrDefault(a,0)+1);
        }
//        duplicatesMap.forEach((key,value)->{
//            System.out.println(key+" "+ value);

//        });
    for(Map.Entry<Character, Integer> travserseMap:duplicatesMap.entrySet()){
        System.out.println(travserseMap.getKey()+" "+travserseMap.getValue());
    }
    }
}
