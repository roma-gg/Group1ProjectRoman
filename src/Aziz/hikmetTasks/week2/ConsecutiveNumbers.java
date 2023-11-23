package Aziz.hikmetTasks.week2;

public class ConsecutiveNumbers {
    public static void main(String[] args){
        int n = 24;
        String a = "Codility";
        String b = "Test";
        String c = "Coders";

        for (int i = 1; i<=n; i++){
            if(i%2==0 && i%3==0 && i%5==0){
                System.out.println(a+b+c);
            }else if(i%2==0 && i%3==0){
                System.out.println(a+b);
            }else if(i%2==0 && i%5==0){
                System.out.println(a+c);
            }else if(i%3==0 && i%5==0){
                System.out.println(b+c);
            }else if(i%2==0){
                System.out.println(a);
            }else if(i%3==0){
                System.out.println(b);
            }else if(i%5==0){
                System.out.println(c);
            }else{
                System.out.println(i);
            }
        }


    }
}
