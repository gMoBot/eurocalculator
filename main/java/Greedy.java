import java.io.Console;
import java.util.Scanner;

import static java.lang.Float.parseFloat;

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
        float changeValue = 0;
        String currencyType;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            stringBuilder.setLength(0);
            System.out.print("Please enter the amount and type(ie; $ or €)\n" +
                    "of converted change needed: ");
//            changeValue = input.nextFloat();
            stringBuilder.append(input.nextLine());
            if (stringBuilder.length() <= 2){
//                currencyType = "null";
                continue;
            }
            changeValue = parseFloat(stringBuilder.substring(1));
            if ((changeValue <= 0.00) && (stringBuilder.substring(0, 1).matches("[\\$€]"))) {
                stringBuilder.substring(0, 1);
                currencyType = stringBuilder.toString();
            }

//            if (!currencyType.matches("[\\$€]")){
//                continue;
//            }

        } while (changeValue <= 0.00);
        // convert float input into int value for precise use by greedy algorithm
        int convertedChange = Math.round(changeValue * 100);
        ChangeCalculator changeCalculator = new ChangeCalculator();
//        changeCalculator.calcChange(0);
        changeCalculator.calculateChange(convertedChange);
    }

//    public static int convertedChange;
}
