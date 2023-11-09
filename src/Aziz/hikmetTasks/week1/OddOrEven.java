package Aziz.hikmetTasks.week1;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(identify(5));

    }
    public static String identify(int number){
        String odd = "odd";
        String even = "even";
        if(number%2==0){
            return even;
        }else{
            return odd;
        }
    }
}
