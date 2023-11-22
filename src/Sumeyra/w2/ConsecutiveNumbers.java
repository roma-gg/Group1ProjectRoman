package Sumeyra.w2;


public class ConsecutiveNumbers {
    public static void main(String[] args) {

        int n= 50;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 2 == 0) {
                System.out.println("Codility" + "Test" + "Coders");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Test" + "Coders");
            } else if (i % 2 == 0 && i % 3 == 0 ) {
                System.out.println("Codility" + "Test");
            } else if (i % 2 == 0 && i % 5 == 0 ) {
                System.out.println("Codility" + "Coders");
            }else if (i % 2 == 0 ) {
                System.out.println("Codility");
            }else if (i % 3 == 0 ) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }



    }
}
