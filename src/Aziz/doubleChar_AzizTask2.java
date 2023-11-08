package Aziz;

public class doubleChar_AzizTask2 {

    public static String doubleChar(String str) {
        String newStr = "";
        for(int i = 0, j = 0; i < str.length(); i++, j = j+2){
            newStr += str.charAt(i) + "" + str.charAt(i) + "";
        }

        return newStr;
    }


}
/*

Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */