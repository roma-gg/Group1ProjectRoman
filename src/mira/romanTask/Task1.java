package mira.romanTask;

public class Task1 {

    public boolean xyBalance(String str) {

        if(!(str.contains("x")) || (str.contains("y") && str.lastIndexOf("y") > str.lastIndexOf("x"))){
            return true;
        } else{
            return false;
        }
    }
}
