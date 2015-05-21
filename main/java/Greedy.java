import java.io.Console;
import java.util.Scanner;
/**
 * Greedy.java
 * Simple coin changer utilizing greedy algorithm
 * Created by garrettcoggon on 5/20/15.
 */
public class Greedy {

    public static void main(String[] varArgs) {

        new Greedy().GetChange();
    }
    // Solicit and validate user input
    public void GetChange() {
        Scanner input = new Scanner(System.in);
        Console c = System.console();
        float changevalue;
        do{
            System.out.print("Please enter the amount of change needed: ");
            changevalue = input.nextFloat();

        } while (changevalue <= 0.00);
        // convert float input into int value for precise use by greedy algorithm
        change = Math.round(changevalue * 100);
        ChangeCalculator changeCalculator = new ChangeCalculator();
        changeCalculator.calculateChange();
    }
    public static int change;
}
