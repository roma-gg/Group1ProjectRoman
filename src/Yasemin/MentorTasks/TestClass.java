package Yasemin.MentorTasks;

import static Yasemin.MentorTasks.OddEvenNumber.identify;
import static Yasemin.MentorTasks.divideWithoutOperator.divideWithoutOp;


public class TestClass {

    public static void main(String[] args) {
        System.out.println("------ Odd or even Numbers------\n");

        System.out.println(identify(5));
        System.out.println(identify(5));

        System.out.println("------Division without operation------\n");

        divideWithoutOperator.divideWithoutOp(28,5);


    }
}
