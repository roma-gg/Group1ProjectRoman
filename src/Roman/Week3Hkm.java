package Roman;

public class Week3Hkm {
    public static boolean isPrimeNumber(int num) {
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static int reverseNegativeNums(int num) {
        String number = String.valueOf(num);
        String result = "";

        if (number.startsWith("-"))
            result = "-";

        for (int i = number.length() - 1; i >= 0; i--) {
            if (number.charAt(i) == '-')
                continue;
            result += number.charAt(i);
        }

        return Integer.parseInt(result);
    }


}
