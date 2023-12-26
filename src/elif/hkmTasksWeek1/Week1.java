package elif.hkmTasksWeek1;

public class Week1 {

    public int countCode(String str) {
        if (str==null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {
            String text = str.substring(i,i+4);
            if( text.startsWith("co") && text.endsWith("e")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Week1().countCode("aaacodebbcobe"));
        System.out.println(new Week1().countCode(""));
        System.out.println(new Week1().countCode(null));

    }

}

/*

Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */
