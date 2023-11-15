package damla.hkmTask;

public class OddorEvenNumber {

    public static void main(String[] args) {

        System.out.println(identify(15));
        System.out.println(identify(24));

    }
    public static String identify(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";


        }
    }
}

/*

write a methot which can identifies given number  is even or odd
identify(5)->"odd"
identify(6)->"even"

 */