package Ion.hkmTask;

public class FinRa {
    
    public static void finRa(){
        String result = "";
        for(int i = 1; i <= 30; i++){
            if(i % 5 == 0 && i % 3 == 0){
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else if (i % 3 == 0 ) {
                result += "FIN ";
            }else{
                result += i + " ";
            }
        }
        System.out.println(result);
    }
    
}
