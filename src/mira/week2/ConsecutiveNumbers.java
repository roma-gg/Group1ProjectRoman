package mira.week2;

public class ConsecutiveNumbers {

    public static void consecutive(int x) {

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if ((i % 2 == 0 && i % 3 == 0)) {
                System.out.println("CodilityTest");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoder");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 5 == 0) {
                System.out.println("Codesrs");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else {
                System.out.println(i);
            }
        }

    }

}