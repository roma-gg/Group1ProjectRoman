package Sumeyra;
/*

Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
 */
public class Task1 {

    public static boolean isBobHere(String str) {

        boolean bob=false;
        for(int i=0;i<str.length()-2;i++) {
            if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")) {
                bob = true;
            }
        }

        return bob;
    }
}

//    public static void main(String[] args) {
//        System.out.println("Test case 1: ");
//        System.out.println(isBobHere("abcbob"));
//        System.out.println("Test case 2: ");
//        System.out.println(isBobHere("b9b"));
//        System.out.println("Test case 3: ");
//        System.out.println(!isBobHere("bac"));
//    }

