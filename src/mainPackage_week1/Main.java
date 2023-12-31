package mainPackage_week1;

import Aziz.romanTasks.azizStringTask;
import Ion.ClassTask;
import Roman.PracticeTasks;
import Roman.Week2Hkm;
import Roman.Week3Hkm;
import Roman.Week4Hkm;
import Sumeyra.Task;
import Yasemin.Task01;
import Yasemin.Task02;

import static Ion.CatDog.catDog;


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
            System.out.println(Task.isBobHere("abcbob"));
            System.out.println("Test case 2: ");
            System.out.println(Task.isBobHere("b9b"));
            System.out.println("Test case 3: ");
            System.out.println(!Task.isBobHere("bac"));

        System.out.println("===============================================");

            //String-2 ---> countCode (Yasemin )

        System.out.println("String-2 > countcode");
        System.out.println("Test case 1: ");
        System.out.println(Task02.countCode("aaacodebbb")==1);
        System.out.println("Test case 2:");
        System.out.println(Task02.countCode("codexxcode")==2);
        System.out.println("Test case 3:");
        System.out.println(Task02.countCode("cozexxcope")==2);

        System.out.println("=======================================");

        // String-2 ---> catDog (Ion)

        System.out.println("String-2 > catDog");
        System.out.println("Test case 1: ");
        System.out.println(catDog("catdog"));
        System.out.println("Test case 2:");
        System.out.println(catDog("1cat1cadodog"));
        System.out.println("Test case 3:");
        System.out.println(catDog("dogogcat"));

        /*Week2Hkm test = new Week2Hkm();
        test.printConsecutiveNums(30);*/

        System.out.println(Week3Hkm.reverseNegativeNums(-246));

        Week4Hkm test = new Week4Hkm();
        System.out.println(test.freqOfChars("AAABBCDD"));
        System.out.println(test.sameLetters("abc", "bab"));
        System.out.println(test.removeDuplicates("AAABBBCCC"));

    }


    
}
