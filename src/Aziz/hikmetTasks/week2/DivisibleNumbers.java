package Aziz.hikmetTasks.week2;

import java.util.ArrayList;

public class DivisibleNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> by15 = new ArrayList<>();
        ArrayList<Integer> by3 = new ArrayList<>();
        ArrayList<Integer> by5 = new ArrayList<>();
        for (int i = 1; i<=100; i++){
            if(i%3==0 && i%5==0 && i%15==0){
                by15.add(i);
            }else if(i%3==0 && i%15!=0){
                by3.add(i);
            }else if(i%5==0 && i%15!=0){
                by5.add(i);
            }
        }
        System.out.println(by15);
        System.out.println(by3);
        System.out.println(by5);

    }
}
