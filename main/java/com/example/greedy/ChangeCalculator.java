package com.example.greedy;

/**
 * Created by garrettcoggon on 5/20/15.
 */
public class ChangeCalculator {

    public static String CalculateChange(int convertedChange) {
        // Determine how many times the given value is divisible by 25 etc
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
        System.out.format("Coins: %d\n", coins);

        return changeNeeded;
    }
    public static String EuroCalculateChange(int convertedChange) {
        // Determine how many times the given value is divisible by 200 etc
        // initialize variables
        int remainder;
        int €200 = 0;
        int €100 = 0;
        int €50 = 0;
        int €20 = 0;
        int €10 = 0;
        int €5 = 0;
        int €2 = 0;
        int €1 = 0;
        remainder = (convertedChange % 200);
        if (remainder != 0) {
            €200 = (convertedChange - remainder) / 200;
            int a = remainder % 100;
            if (99 < remainder && remainder <= 199) {
                €100 = (remainder - a) / 100;
                remainder = a;
            }
            int b = a % 50;
            if (49 < remainder && remainder <= 99) {
                €50 = (a - b) / 50;
                remainder = b;
            }
            int c = b % 20;
            if (19 < remainder && remainder <= 49) {
                €20 = (b - c) / 20;
                remainder = c;
            }
            int d = c % 10;
            if (9 < remainder && remainder <= 19) {
                €10 = (c - d) / 10;
                remainder = d;
            }
            int e = d % 5;
            if (4 < remainder && remainder <= 9) {
                €5 = (d - e) / 5;
                remainder = e;
            }
            int f = e % 2;
            if (1 < remainder && remainder <= 4) {
                €2 = (e - f) / 2;
                remainder = f;
            }
            if (0 <= remainder && remainder <= 1) {
                €1 = f;
            }
        } else if (remainder == 0) {
            €200 = (convertedChange / 200);
        }
        // Computes total number of coins req'd from individual types
        int coins = €200 + €100 + €50 + €20 + €10 + €5 + €2 + €1;

        // Displays both the individual type numbers and total number of coins
        String changeNeeded = String.format("%d €200 + %d €100 + %d €50 + %d €20 + %d €10 + %d €5 + %d €2 + %d €1 = %d Coins", €200, €100, €50, €20, €10, €5, €2, €1, coins);
        System.out.println(changeNeeded);
        System.out.format("Coins: %d\n", coins);
        return changeNeeded;
    }
}
