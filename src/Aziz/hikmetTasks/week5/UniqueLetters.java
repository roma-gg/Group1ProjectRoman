package Aziz.hikmetTasks.week5;

import java.util.*;

public class UniqueLetters {
    public static void main(String[] args) {
        String text= "AAABBBCCCDEF";
        Map<String, Integer> map = new HashMap<>();


        for (char eachChar : text.toCharArray()){
            map.put(String.valueOf(eachChar), 0);
        }
        System.out.println(Arrays.asList(map));


    }
    /*
    Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
}
