package elif.hkmTasksWeek2;

public class Divisible {

    public static void main(String[] args) {

        String div3 ="";
        String div5 ="";
        String div15 ="";

        for (int i = 1; i <=100 ; i++) {
            if (i%3==0 && i%5==0){
                div15+=i+",";
            }
            if(i%3==0){
                div3+=i+",";
            }
            if(i%5==0){
                div5+=i+",";
            }
        }

        System.out.println("Divisible by3= "+div3);
        System.out.println("Divisible by5= "+div5);
        System.out.println("Divisible by15= "+div15);
    }
}
