package Yasemin.MentorTasks.week_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameLetters {

    public static boolean isSame(String str1, String str2) {

        List<String> word1= new ArrayList<>(Arrays.asList(str1.split("")));
        List<String> word2= new ArrayList<>(Arrays.asList(str2.split("")));

       return ((word1.size()==word2.size()) && (word1.containsAll(word2)) );


    }
}


 /*
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */