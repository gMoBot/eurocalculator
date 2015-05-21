/**
 * Created by garrettcoggon on 5/20/15.
 */
public class ChangeCalculator {

    public static void calculateChange(){
        // Determine how many times the given value is divisible by 25
        // initialize variables
        int remainder;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        remainder = (Greedy.change % 25);
        if (remainder != 0){
            quarters = (Greedy.change - remainder) / 25;
            int x = remainder % 10;
            if (9 < remainder && remainder <= 25) {
                dimes = (remainder - x) / 10;
                remainder = x;
            }
            int i = x % 5;
            if (4 < remainder && remainder <= 9){
                nickels = (x - i) / 5;
                remainder = i;
            }
            System.out.format("%d = qs\n", nickels);
            if (1 <= remainder && remainder <= 4){
                pennies = i;
            }
        }
        else if (remainder == 0){
            quarters = (Greedy.change / 25);
        }
        // Computes total number of coins req'd from individual types
        int coins = quarters + dimes + nickels + pennies;

        // Displays both the individual type numbers and total number of coins
        System.out.format("%d Quarters + %d Dimes + %d Nickels +%d Pennies = %d Coins\n", quarters,dimes, nickels, pennies, coins);
        System.out.format("Coins: %d\n", coins);
    }
}
