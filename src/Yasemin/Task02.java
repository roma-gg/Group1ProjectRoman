package Yasemin;
/*
String-2 > countCode

Return the number of times that the string "code" appears
anywhere in the given string, except we'll accept any letter
 for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */
public class Task02 {


    public int countCode(String str) {
        int a=0;
        int count=0;

        while(str.contains("co")){
            a=str.indexOf("co");
            if(a+3>str.length()-1){
                break;
            }

            if(str.charAt(a+3)=='e'){
                count++;
            }
            str=str.replaceFirst("co","");
        }return count;
    }
}
