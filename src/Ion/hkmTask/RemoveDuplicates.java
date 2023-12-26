package Ion.hkmTask;

public class RemoveDuplicates {

    public static String noDuplicates(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!result.contains(ch+"")){
                result+= ch;
            }
        }
        return result;
    }

    /*
    String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
     */
}
