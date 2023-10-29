package AzizPackage2;

import java.util.ArrayList;
import java.util.Arrays;

public class Aziz_LoopTask {
    public static void main(String[] args) {
        ArrayList<String> namesOf = new ArrayList<>();
        namesOf.addAll(Arrays.asList("Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"));
        System.out.println(namesOf);
    }

    public static int count(ArrayList<String> names){
        int count = 0;
        for (String eachName : names) {
            if(eachName.charAt(0) == eachName.charAt(eachName.length()-1)){
                count++;
            }
        }
        return count;

    }

}
/*
Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter
                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"
                Output : 4
 */