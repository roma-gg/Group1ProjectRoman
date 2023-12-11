package Ion.hkmTask;

public class FrequencyOfCharacters {

    public static String frequency(String str){
        String result = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < str.length() ; j++) {
                if (ch == str.charAt(j)){
                    count++;
                }
            }
            if(!result.contains(ch+"")){
                result+=ch+""+count;
            }
            count = 0;

        }
return result;
    }

}
