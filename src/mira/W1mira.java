package mira;


import java.util.Scanner;

public class w1mira {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number : ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("is even number");
            } else {
                System.out.println("its odd number");
            }
            System.out.println("would you like to enter another number, yes/no");
            String answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("invalid answer, would u like to try again : ");
                answer = input.next().toLowerCase();
            }
            if (answer.equals("no")) {
                break;
            }


        }

    }
}






/* Write a method which can identifies given number is odd or even

      identify(5) -> "odd"
      identify(6) -> "even"

 */

