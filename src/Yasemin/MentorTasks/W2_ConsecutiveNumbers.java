package Yasemin.MentorTasks;

public class W2_ConsecutiveNumbers {

    public static void consecutive(int n){
        for (int i = 1; i <=n; i++) {
            String result=(i%2==0 && i%5==0 && i%3==0)?" CodilityTestCoders"
                    :(i%2==0 && i%3==0)?"CodilityTest "
                    :(i%3==0 && i%5==0)?" TestCoders"
                    :(i%2==0 && i%5==0)?" CodilityCoder"
                    :(i%2==0)?" Codility"
                    :(i%5==0) ? " Coders"
                    :(i%3==0)?" Test"
                    :" "+i;
            System.out.println(result);
        }

    }


}
/*
2: Codility
3:test
5:coder
2-3: codilityTest
2-5:Codility coder
3-5:Test Coder
 */