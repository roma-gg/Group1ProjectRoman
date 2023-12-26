package yousof.Week4TasksHkm;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String input = "AAABBCDD";
        String result = CharFrequency(input);
        System.out.println(result);

    }

    public static String CharFrequency(String input){
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for(char c: input.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();



    }

}
   // Write a return method that can find the frequency of
       // characters