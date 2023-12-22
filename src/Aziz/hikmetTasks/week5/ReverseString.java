package Aziz.hikmetTasks.week5;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("reversedString(\"java\") = " + reversedString("java"));
    }
    public static String reversedString(String text){
        
        String reversed = "";
        for (int i = text.length()-1; i >= 0; i--) {
            reversed+=String.valueOf(text.charAt(i));
        }
        return reversed;
    }
}
