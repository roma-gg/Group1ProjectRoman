package elif;

public class DivideWithoutDivideOperation {

    public static int divide(int num1, int num2){

        if(num1 < 0 || num2 < 0){
            System.out.println("Please enter positive number");
            return -1;
        }
        int count = 0 ;

        if(num2 == 0){
           throw new ArithmeticException(num1+" cannot be divide to 0");
        }
        while(num1>0){
            num1=num1-num2;
            if(num1>=0)
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println( divide(20,2));
        System.out.println( divide(20,3));
        System.out.println( divide(20,-2));
        System.out.println( divide(20,0));
    }
}
