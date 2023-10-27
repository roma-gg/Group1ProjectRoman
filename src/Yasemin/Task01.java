package Yasemin;

public class Task01 {
    /*
    Return true if the given string contains an appearance of "xyz"
    where the xyz is not directly preceeded by a period (.). So "xxyz" counts
    but "x.xyz" does not.

    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true
     */

    public static boolean xyzThere(String str) {

        while(str.contains(".xyz")){

            str=str.replace(".xyz","");

        }
        if( str.contains("xyz")){
            return true;
        }else{
            return false;
        }
    }


}
