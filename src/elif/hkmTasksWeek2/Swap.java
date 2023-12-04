package elif.hkmTasksWeek2;

public class Swap {

    public static void SwapNumbers(int n1, int n2){


        System.out.println("number1: "+ n1+"\nnumber2: "+ n2);
        //n1=1  n2=2

        n1= n1+n2;  //3
        n2=n1-n2;   //1
        n1= n1-n2;  //2

        System.out.println("updated number1: "+ n1+"\nupdated number2: "+n2);
    }

    public static void main(String[] args) {
        SwapNumbers(1,2);
    }
}
