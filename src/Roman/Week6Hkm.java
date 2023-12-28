package Roman;

public class Week6Hkm {

    public static boolean verifyPassword(String str) {
        if (str == null || str.length() < 6)
            return false;

        int lowerCase = 0;
        int upperCase = 0;
        int specialCh = 0;
        int digits = 0;

        for (int i = 0; i < str.length(); i++) {
            var ch = str.charAt(i);

            if (Character.isSpaceChar(ch))
                return false;
            if (Character.isUpperCase(ch))
                upperCase++;
            if (Character.isLowerCase(ch))
                lowerCase++;
            if (Character.isDigit(ch))
                digits++;
            else
                specialCh++;
        }

        return lowerCase > 0 && upperCase > 0 &&
                specialCh > 0 && digits > 0;
    }

    public static int maxInArray(int[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException();

        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max)
                max = num;
        }

        return max;
    }

    public static int sumOfDigitsInString (String str) {
        int result = 0;
        var array = str.toCharArray();
        for (char ch : array) {
            if (Character.isDigit(ch))
                result += Integer.parseInt(String.valueOf(ch));
        }

        return result;
    }
}
