package yousof.Week5TasksHkm;

public class StringPassword {

    public static boolean ValidPassword(String password){
        if(password.length() < 6 || password.contains(" ")){
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasChar = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()){
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }else if(Character.isLowerCase(ch)){
                hasLowerCase = true;
            }else if(Character.isDigit(ch)){
                hasDigit = true;
            }else if(!Character.isLetterOrDigit(ch)){
                hasChar = true;
            }
        }
        return  hasUpperCase && hasLowerCase && hasDigit && hasChar;
    }

    public static void main(String[] args) {

        System.out.println(ValidPassword("ValidP@ss5"));
    }

}
/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
 */