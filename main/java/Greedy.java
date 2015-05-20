import java.io.Console;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by garrettcoggon on 5/20/15.
 */
public class Greedy {

    public static void main(String[] varArgs) {

//        getChange();
    }

    public void getChange() {
        Scanner input = new Scanner(System.in);
        Console c = System.console();
        do{
            System.out.print("Please enter the amount of change needed: ");
            change = input.nextFloat();

        } while (change <= 0);
    }
    public static float change;
}
