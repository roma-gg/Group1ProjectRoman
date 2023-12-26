package Sumeyra.week4;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDups("xyzxyzxyz"));
        System.out.println(removeDups("AAABBBCCC"));

    }

    public static String removeDups(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if(result.contains(""+str.charAt(i))){
                continue;
            }
           result += str.charAt(i);
        }


        return result;

    }
}
