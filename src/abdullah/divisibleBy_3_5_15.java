package abdullah;

public class divisibleBy_3_5_15 {
    public static void main(String[] args) {


        int n = 100;

        String by15 = " ";
        String by5 = " ";
        String by3 = " ";



        for (int i = 1; i < n; i++) {

            if (i % 15 == 0){
                by15 += i + " ";
            } else if (i % 5 == 0) {

                by5 += i +" ";
            } else if (i % 3 == 0) {
                by3 += i +" ";
            }

        }


        System.out.println("Divisible by15 "+by15);
        System.out.println("Divisible by5 "+by5);
        System.out.println("Divisible by3 "+by3);

    }
}
