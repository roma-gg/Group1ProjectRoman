package yousof.Week4TasksHkm;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println(areSameLetters("abc", "cab"));
        System.out.println(areSameLetters("abc", "abb"));

    }

    public static boolean areSameLetters(String str1, String str2){
        if(str1 == null && str2 == null){
            return true;
        }
        if(str1 == null && str2 == null){
            return false;
        }

        String cleanStr1 = str1.replaceAll("\\s", "").toLowerCase();
        String cleanStr2 = str2.replaceAll("\\s", "").toLowerCase();

        return sortedString(cleanStr1).equals(sortedString(cleanStr2));

    }

    public static String sortedString(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}
/*
Write a return method that check if a string is build out of the
same letters as another string.
 */