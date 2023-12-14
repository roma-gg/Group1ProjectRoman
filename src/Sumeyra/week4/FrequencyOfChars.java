package Sumeyra.week4;

public class FrequencyOfChars {

    public static void main(String[] args) {


        System.out.println(frequencyOfChars("aabcccd"));// a2b1c3d1

        System.out.println(frequencyOfChars("AAABBCDD"));//A3B2C1D2

    }

    public static String frequencyOfChars (String str){

        String result = "";  // a2b1c3d1
        // a b c d
        // 2 1 3 1


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);  //a
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch) {

                    count++;
                }

            }

            if (result.contains("" + ch)) { // if the character is already included in the result
                continue; //skip the character
            }

            result += ch + "" + count;

        }



        return result;


    }
}
