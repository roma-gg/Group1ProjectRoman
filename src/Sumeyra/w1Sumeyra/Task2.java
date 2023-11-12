package Sumeyra.w1Sumeyra;

    public class Task2 {


        public static void divideWithoutOperator(int divident, int divisor) {

            int quotient = 0;
            int remainder = 0;
            while (divident >= divisor) {
                divident = divident - divisor;
                quotient++;
                remainder = divident;
            }

            System.out.println("quotient = " + quotient + ", remainder = " + remainder);
// could not achieve
//        if (divident < divisor) {
//            System.err.println("Divident must be bigger than divisor");
//            System.exit(1);
//        }

        }


    }


