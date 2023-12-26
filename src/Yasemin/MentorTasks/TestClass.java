package Yasemin.MentorTasks;

import Yasemin.MentorTasks.week_01.W2_divideWithoutOperator;
import Yasemin.MentorTasks.week_02.W1_FinRa;
import Yasemin.MentorTasks.week_02.W1_SwapNumbers;
import Yasemin.MentorTasks.week_02.W2_ConsecutiveNumbers;
import Yasemin.MentorTasks.week_03.W2_Divisible;
import Yasemin.MentorTasks.week_03.W3_PrimeNumber;
import Yasemin.MentorTasks.week_03.W3_reverseNumber;
import Yasemin.MentorTasks.week_04.FrequencyOfCharacter;
import Yasemin.MentorTasks.week_04.RemoveDuplicates;
import Yasemin.MentorTasks.week_04.SameLetters;

import static Yasemin.MentorTasks.week_01.W1_OddEvenNumber.identify;



public class TestClass {

    public static void main(String[] args) {
        System.out.println("------ Odd or even Numbers------\n");

        System.out.println(identify(5));
        System.out.println(identify(5));

        System.out.println("------Division without operation------\n");

        W2_divideWithoutOperator.divideWithoutOp(28,5);

        System.out.println("--------------FINRA----------------\n");

        W1_FinRa.finRa();

        System.out.println("----------Swap Numbers-----------\n");

        W1_SwapNumbers.swapNumbers(5,10);

        System.out.println("------Divisible by 3,,5,15-------\n");

        W2_Divisible.divisible();

        System.out.println("------Consecutive Numbers-------\n");

        W2_ConsecutiveNumbers.consecutive(24);

        System.out.println("------ Prime Number-------\n");

        W3_PrimeNumber.isPrime(12);

        System.out.println("------Reverse Number-------\n");

        System.out.println("reverse of number is= "+ W3_reverseNumber.reverseNum(-123));

        System.out.println("------Frequency of Character-------\n");

        System.out.println("Frequency Of Character is : "+ FrequencyOfCharacter.FrequecyString("AAABBBBDDC"));

        System.out.println("------Is Same Letter-------\n");

        System.out.println("Are letters same : "+SameLetters.isSame("asb","acb"));

        System.out.println("------Remove Duplicates-------\n");

        RemoveDuplicates.removeDouble("AAGGGLLLOHGFRRT");
    }
}
/*
2: Codility
3:test
5:coder
2-3: codilityTest
2-5:Codility coder
3-5:Test Coder
 */