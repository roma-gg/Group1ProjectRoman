package mainPackage_week1;

import Roman.PracticeTasks;
import Yasemin.Task01;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // test for pull request

        // String-3 > countYZ (Roman)
        System.out.println("String-3 > countYZ");
        System.out.println("Test case 1:");
        System.out.println(PracticeTasks.countYZ("fez day") == 2);
        System.out.println("Test case 2:");
        System.out.println(PracticeTasks.countYZ("day fez") == 2);
        System.out.println("Test case 3:");
        System.out.println(PracticeTasks.countYZ("day fyyyz") == 2);

        //space for rest of tasks
        // test module issue


        // String-2 > xyzThere (Yasemin)
        System.out.println("String-2 > xyzThere");
        System.out.println("Test case 1: ");
        System.out.println(Task01.xyzThere("abcxyz"));
        System.out.println("Test case 2:");
        System.out.println(Task01.xyzThere("abc.xyz"));
        System.out.println("Test case 3:");
        System.out.println(Task01.xyzThere("xyz.abc"));




    }
}