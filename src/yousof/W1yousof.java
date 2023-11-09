package yousof;

public class W1yousof {

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("hi"))
                count++;
        }
        return count;
    }

    //task from Hikmet


}
