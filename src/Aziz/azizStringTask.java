package Aziz;

public class azizStringTask {
    //Project imported to Git
    //Task solved using custom method
    //Tested in main method:
    public static void main(String[] args) {
        System.out.println(count("xyHixxhxhi")); //2

    }
    public static int count(String str){
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i,i+2).contains("hi")){
                count++;
            }
        }
        return count;
    }

}
/*
Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */


