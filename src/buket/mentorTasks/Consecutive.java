package buket.mentorTasks;

public class Consecutive {

    public static void consecutive(int n){

        String result = "";

        for (int i = 1; i < n; i++) {
            if (i % 2== 0 && i % 3== 0 && i % 5 == 0){
                result = "CodilityTestCoders";
            } else if (i %2 == 0 && i % 3 == 0) {
                result = "CodilityTest";
            } else if (i % 2 == 0 && i % 5 == 0) {
                result = "CodilityCoders";
            } else if (i % 3 ==0 && i % 5 ==0 ) {
                result = "TestCoders";
            } else if (i % 2 == 0) {
                result = "Codility";
            } else if (i % 3 ==0 ) {
                result = "Test";
            } else if (i % 5 == 0) {
                result = "Coders";
            }else result = " " + i;
            System.out.println(result);
        }


    }
}
