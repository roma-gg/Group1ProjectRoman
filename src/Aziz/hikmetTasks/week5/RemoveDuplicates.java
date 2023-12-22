package Aziz.hikmetTasks.week5;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args){
    String text = "AAABBBCCCDEF";

        System.out.println("uniqueLetters(\"AAABBBCCCDEF\") = " + uniqueLetters("AAABBBCCCDEF"));
    }
    public static String uniqueLetters(String text){
        Set<String> list = new HashSet<>();

        for (char each : text.toCharArray()) {
            list.add(String.valueOf(each));
        }

        String uniqueLetters = "";
        for (String each : list){
            uniqueLetters += each;
        }
    return uniqueLetters;

    }
}
/*
String -- remove the duplicates.
Write a return method that can remove duplicated characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */