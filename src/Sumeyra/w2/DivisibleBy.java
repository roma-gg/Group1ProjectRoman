package Sumeyra.w2;

public class DivisibleBy {

    public static void main(String[] args) {
        String div15 ="";
        String div5 ="";
        String div3 ="";


        for (int i = 1; i <= 100; i++) {

            if(i % 3 ==0 && i % 5 ==0){
                div15 += i +" ";

            }
            if (i % 5 ==0){
                div5 += i+" ";


            }if (i % 3 ==0){
                div3 +=i+" ";
            }
        }
        System.out.println("Divisible by 15 = " + div15);
        System.out.println("Divisible by 5 = " + div5);
        System.out.println("Divisible by 3 = " + div3);

    }
}
