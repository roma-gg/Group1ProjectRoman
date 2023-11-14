package elif;

public class OddEven {

    public static String OddOrEven(int num){

        String result = "";
        if(num%2==0){
            result = "Even";
        }else{
            result="Odd";
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(OddOrEven(10));
        System.out.println(OddOrEven(11));
    }
}
