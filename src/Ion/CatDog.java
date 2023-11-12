package Ion;

public class CatDog {

    public static boolean catDog(String str){
        int catCount = 0,
                dogCount = 0;
        for(int i = 0; i < str.length()-2; i++){

            if(str.substring(i,i+3).equalsIgnoreCase("cat")){
                catCount++;
            } else if (str.substring(i,i+3).equalsIgnoreCase("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    /*
    Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
     */
}