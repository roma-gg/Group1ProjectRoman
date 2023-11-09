package mainPackage_week1;

import Aziz.azizStringTask;
import Ion.ClassTask;
import Roman.PracticeTasks;
import Yasemin.Task01;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // test for pull request

        // String-3 > countYZ Roman)
        System.out.println("String-3 > countYZ");
        System.out.println("Test case 1:");
        System.out.println(PracticeTasks.countYZ("fez day") == 2);
        System.out.println("Test case 2:");
        System.out.println(PracticeTasks.countYZ("day fez") == 2);
        System.out.println("Test case 3:");
        System.out.println(PracticeTasks.countYZ("day fyyyz") == 2);


        System.out.println("=======================================");
        //String-2 > endOther (ION)
        System.out.println("String-2 > endOther");
        System.out.println("Test case(Ion) 1:");
        System.out.println(ClassTask.endOther("Hiabc", "abc"));
        System.out.println("Test case 2:");
        System.out.println(ClassTask.endOther("AbC", "HiaBc"));
        System.out.println("Test case 3:");
        System.out.println(!ClassTask.endOther("yz", "12xz"));
        System.out.println("Test case 4:");
        System.out.println(ClassTask.endOther("abc", "abXabc"));


        //space for rest of tasks
        // test module issue


        // String-2 > xyzThere (Yasemin)
        System.out.println("=======================================");
        System.out.println("String-2 > xyzThere");
        System.out.println("Test case 1: ");
        System.out.println(Task01.xyzThere("abcxyz"));
        System.out.println("Test case 2:");
        System.out.println(Task01.xyzThere("abc.xyz"));
        System.out.println("Test case 3:");
        System.out.println(Task01.xyzThere("xyz.abc"));

        //String -> countHi (Aziz)
        System.out.println("String -> countHi");
        System.out.println("Test case 1: ");
        System.out.println(azizStringTask.countHi("abc hi ho")==1); //returns 1
        System.out.println("Test case 2: ");
        System.out.println(azizStringTask.countHi("ABChi hi")==2); //returns 2
        System.out.println("Test case 3: ");
        System.out.println(azizStringTask.countHi("hihi")==2); //returns 2


        System.out.println("=====================================================");
        //String2--->isBobHere  (Sumeyra)
            System.out.println("Test case 1: ");
            System.out.println(Sumeyra.Task1.isBobHere("abcbob"));
            System.out.println("Test case 2: ");
            System.out.println(Sumeyra.Task1.isBobHere("b9b"));
            System.out.println("Test case 3: ");
            System.out.println(!Sumeyra.Task1.isBobHere("bac"));





        }






    
}
