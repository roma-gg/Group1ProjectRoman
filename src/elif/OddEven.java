package elif;

public class OddEven {

    public static String oddOrEven(int num){

        String result = "";
        if(num%2==0){
            result = "Even";
        }else{
            result="Odd";
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(oddOrEven(10));
        System.out.println(oddOrEven(11));
    }
}
