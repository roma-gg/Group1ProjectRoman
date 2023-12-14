package Yasemin.MentorTasks.week_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void removeDouble(String str1){

        String newWord="";

       Set<String> word =new HashSet<>(Arrays.asList(str1.split("")));
        for (String each : word) {
            newWord +=each;
        }

       System.out.println("The new word is : "+newWord);
    }
}


/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */