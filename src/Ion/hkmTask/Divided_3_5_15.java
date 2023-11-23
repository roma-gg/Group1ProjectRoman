package Ion.hkmTask;

public class Divided_3_5_15 {

    public static void divided_3_5_15(){

        String divBy15 = "";
        String divBy5 = "";
        String divBy3 = "";

        for (int i = 1; i <= 100; i++){

            if(i%3 == 0 && i%5 == 0 && i%15 == 0){
                divBy15 += i+" ";
            } else if (i%3 == 0 && i%15 != 0) {
                divBy3 += i+" ";
            } else if (i%5 == 0 && i%15 != 0) {
                divBy5 += i+" ";
            }

        }

        System.out.println("divBy15 = " + divBy15);
        System.out.println("divBy3 = " + divBy3);
        System.out.println("divBy5 = " + divBy5);

    }

}
