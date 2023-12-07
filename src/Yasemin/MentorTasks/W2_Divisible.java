package Yasemin.MentorTasks;

import java.util.ArrayList;

public class W2_Divisible {

    public static void divisible(){
        ArrayList<Integer> by3=new ArrayList<>();
        ArrayList<Integer> by5=new ArrayList<>();
        ArrayList<Integer> by15=new ArrayList<>();

        for (int i = 1; i <=100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                by15.add(i);
            }
            else if(i % 3 == 0) {
                by3.add(i);
            }
            else if (i % 5 == 0) {
                by5.add(i);
            }

        }
        System.out.println("Divisible by 15: "+by15);
        System.out.println("Divisible by 5: "+by5);
        System.out.println("Divisible by 3: "+by3);


    }
}
