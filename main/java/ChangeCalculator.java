import static java.lang.String.valueOf;

/**
 * Created by garrettcoggon on 5/20/15.
 */
public class ChangeCalculator {

    public static String calculateChange(int convertedChange) {
        // Determine how many times the given value is divisible by 25
        // initialize variables
        int remainder;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        remainder = (convertedChange % 25);
        if (remainder != 0) {
            quarters = (convertedChange - remainder) / 25;
            int x = remainder % 10;
            if (9 < remainder && remainder <= 25) {
                dimes = (remainder - x) / 10;
                remainder = x;
            }
            int i = x % 5;
            if (4 < remainder && remainder <= 9) {
                nickels = (x - i) / 5;
                remainder = i;
            }
            if (1 <= remainder && remainder <= 4) {
                pennies = i;
            }
        } else if (remainder == 0) {
            quarters = (convertedChange / 25);
        }
        // Computes total number of coins req'd from individual types
        int coins = quarters + dimes + nickels + pennies;

        // Displays both the individual type numbers and total number of coins
        String changeNeeded = String.format("%d Quarters + %d Dimes + %d Nickels + %d Pennies = %d Coins", quarters, dimes, nickels, pennies, coins);
        System.out.println(changeNeeded);
//        System.out.format("%d Quarters + %d Dimes + %d Nickels + %d Pennies = %d Coins\n", quarters, dimes, nickels, pennies, coins);
        System.out.format("Coins: %d\n", coins);
//        String changeNeeded = new String.format("%d Quarters + %d Dimes + %d Nickels +%d Pennies = %d Coins",quarters,dimes,nickels,pennies,coins);
//        return coins;
        return changeNeeded;
    }

//    public String calcChange(float changeNeeded) {
//        int convertedChange = Math.round(changeNeeded * 100);
//        if (convertedChange > 9){
//            return "1 Dime";
//        }
//        else if (1 <= convertedChange){
//            return "1 Penny";
//        } else {
//            return "Zero Coins";
//        }
//    }


}
