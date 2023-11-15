package Sumeyra.w1Sumeyra;

    public class Task2 {
        public static void main(String[] args) {

           // divideWithoutOperator(5, 10);
            divideWithoutOperator(10,5);
        }

        public static void divideWithoutOperator(int divident, int divisor) {

            int quotient = 0;
            int remainder = 0;

            if (divident < divisor) {
                System.err.println("Divident must be bigger than divisor");
                System.exit(1);
            }

            while (divident >= divisor) {
                divident = divident - divisor;
                quotient++;
                remainder = divident;
            }

            System.out.println("quotient = " + quotient + ", remainder = " + remainder);


        }
    }


