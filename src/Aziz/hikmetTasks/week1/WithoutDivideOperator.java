package Aziz.hikmetTasks.week1;

public class WithoutDivideOperator {
    public static void main(String[] args) {
        System.out.println(without(100,1));

    }

    public static double without(int a, int b){
        double result = 0;
        if(a>=b){
            for (int i = a; i >= b; i -= b){
                if(a>=b){
                    result += 1;
                }
            }
        }
        if(b>a){
            for (int i = b; i >= a; i -= a){
                if(b>=a){
                    result +=1;
                }
            }
        }
        return result;
    }
}
