package Ion.hkmTask;

import java.util.Arrays;

public class SameLetters {
    public static boolean same(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();

        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);

        return Arrays.equals(str1CharArray,str2CharArray);



    }


    /*
    String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */
}
