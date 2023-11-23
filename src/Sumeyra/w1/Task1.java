package Sumeyra.w1;

public class Task1 {



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


