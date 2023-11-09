package Aziz.hikmetTasks.week1;

import java.util.Arrays;

public class FINRA {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[30];
        for (int i = 1; i <= 30; i++){
            arrayNumbers[i-1] = i;
        }
        System.out.println(Arrays.toString(arrayNumbers));

        finra(arrayNumbers);


    }

    public static void finra(int[] array){
        for (int eachArray: array){
            if(eachArray%3==0 && eachArray%5==0){
                System.out.print("FINRA, ");
            }else if(eachArray%3==0){
                System.out.print("FIN, ");
            }else if(eachArray%5==0){
                System.out.print("RA, ");
            }else{
                System.out.print(eachArray + ", ");
            }
        }
    }
}
