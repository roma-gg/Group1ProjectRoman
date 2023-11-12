package Roman;

public class PracticeTasks {

    /* Given a string, count the number of words ending in 'y' or 'z' -- so
       the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow"
       (not case sensitive). We'll say that a y or z is at the end of a word if
       there is not an alphabetic letter immediately following it.
       (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

        countYZ("fez day") → 2
        countYZ("day fez") → 2
        countYZ("day fyyyz") → 2*/

    public static int countYZ(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)))
                temp += str.charAt(i);
            else
                temp += " ";
        }
        str = temp;

        String[] array = str.split(" ");
        int count = 0;
        for (String each : array) {
            if (each.toLowerCase().endsWith("z") || each.toLowerCase().endsWith("y"))
                count++;
        }

        return count;
    }

}
