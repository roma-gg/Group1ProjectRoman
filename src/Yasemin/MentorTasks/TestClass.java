package Yasemin.MentorTasks;

import static Yasemin.MentorTasks.OddEvenNumber.identify;



public class TestClass {

    public static void main(String[] args) {
        System.out.println("------ Odd or even Numbers------\n");

        System.out.println(identify(5));
        System.out.println(identify(5));

        System.out.println("------Division without operation------\n");

        divideWithoutOperator.divideWithoutOp(28,5);

        System.out.println("--------------FINRA----------------\n");

        FinRa.finRa();

        System.out.println("----------Swap Numbers-----------\n");

        SwapNumbers.swapNumbers(5,10);

        System.out.println("------Divisible by 3,,5,15-------\n");

        Divisible.divisible();

        System.out.println("------Consecutive Numbers-------\n");

        ConsecutiveNumbers.consecutive(24);

        System.out.println("------ Prime Number-------\n");

        W3_PrimeNumber.isPrime(12);

        System.out.println("------Reverse Number-------\n");

        System.out.println("reverse of number is= "+reverseNumber.reverseNum(-123));



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