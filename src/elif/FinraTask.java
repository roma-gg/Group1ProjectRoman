package elif;

public class FinraTask {

    public static void Finra(int number){

        for (int i = 1; i <= number; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if (i % 3 ==0){
                System.out.println("FIN");
            }else{
                System.out.println(i);
            }
        }
        }
            


    public static void main(String[] args) {
        Finra(30);
    }
}
