package Ion.hkmTask;

import static Ion.hkmTask.FinRa.finRa;
import static Ion.hkmTask.OddEven.oddEven;
import static Ion.hkmTask.DivWithoutOperator.noOperator;
import static Ion.hkmTask.Swap.swapValue;

public class Test {

    public static void main(String[] args) {

        finRa();
        System.out.println("-------------------------");

        System.out.println(oddEven(2));
        System.out.println(oddEven(5));

        System.out.println("-------------------------");

        noOperator(15, 5);

        System.out.println("-------------------------");

        swapValue(5,7);

        System.out.println("-------------------------");


    }

}
