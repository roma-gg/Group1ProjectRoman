package elif.hkmTasksWeek3;

public class PrimeNumber {

    public static boolean Prime(int number){

    if( number<=1){
        return false;
    }
        for (int i = 2; i < number/2; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Prime(11));
    }
}
