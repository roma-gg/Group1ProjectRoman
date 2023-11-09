package Sumeyra;

public class w1sumeyra {

    public static void main(String[] args) {

        identify(5);
        identify(18);
    }


    public static void identify(int number) {

//way1
//        if(number%2==0){
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
//    }
//way2
        String str = (number % 2 == 0) ? "even" : "odd";
        System.out.println(str);
    }
}
