import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by garrettcoggon on 5/21/15.
 */
public class ChangeCalculatorTest {

    @Test
    public void zeroChangeMeansYouGetZeroCoins() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(0);
        // assert
        assertEquals("0 Quarters + 0 Dimes + 0 Nickels + 0 Pennies = 0 Coins", coinMessage);
    }

    @Test
    public void oneCentShouldGiveYouOnePenny() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(1);
        // assert
        assertEquals("0 Quarters + 0 Dimes + 0 Nickels + 1 Pennies = 1 Coins", coinMessage);
    }
    @Test
    public void fiveCentsShouldGiveYouOneNickel() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(5);
        // assert
        assertEquals("0 Quarters + 0 Dimes + 1 Nickels + 0 Pennies = 1 Coins", coinMessage);
    }
    @Test
    public void tenCentsShouldGiveYouOneDime() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(10);
        // assert
        assertEquals("0 Quarters + 1 Dimes + 0 Nickels + 0 Pennies = 1 Coins", coinMessage);
    }
    @Test
    public void twentyfiveCentsShouldGiveYouOneQuarter() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(25);
        // assert
        assertEquals("1 Quarters + 0 Dimes + 0 Nickels + 0 Pennies = 1 Coins", coinMessage);
    }
    @Test
    public void sixCentsShouldGiveYouOneNickelAndOnePenny() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(6);
        // assert
        assertEquals("0 Quarters + 0 Dimes + 1 Nickels + 1 Pennies = 2 Coins", coinMessage);
    }
    @Test
    public void nineCentsShouldGiveYouOneNickelAndFourPennies() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(9);
        // assert
        assertEquals("0 Quarters + 0 Dimes + 1 Nickels + 4 Pennies = 5 Coins", coinMessage);
    }
    @Test
    public void elevenCentsShouldGiveYouOneDimeAndOnePennies() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(11);
        // assert
        assertEquals("0 Quarters + 1 Dimes + 0 Nickels + 1 Pennies = 2 Coins", coinMessage);
    }
    @Test
    public void fourteenCentsShouldGiveYouOneDimeAndFourPennies() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(14);
        // assert
        assertEquals("0 Quarters + 1 Dimes + 0 Nickels + 4 Pennies = 5 Coins", coinMessage);
    }
    @Test
    public void NineteenCentsShouldGiveYouOneDimeOneNickelAndFourPennies() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(19);
        // assert
        assertEquals("0 Quarters + 1 Dimes + 1 Nickels + 4 Pennies = 6 Coins", coinMessage);
    }
    @Test
    public void twentynineCentsShouldGiveYouOneQuarterAndFourPennies() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(29);
        // assert
        assertEquals("1 Quarters + 0 Dimes + 0 Nickels + 4 Pennies = 5 Coins", coinMessage);
    }
    @Test
    public void fourtyfourCentsShouldGiveYouOneQuarterOneDimeOneNickelAndFourPennies() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(44);
        // assert
        assertEquals("1 Quarters + 1 Dimes + 1 Nickels + 4 Pennies = 7 Coins", coinMessage);
    }
    @Test
    public void onehundredCentsShouldGiveYouFourQuarters() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.calculateChange(100);
        // assert
        assertEquals("4 Quarters + 0 Dimes + 0 Nickels + 0 Pennies = 4 Coins", coinMessage);
    }
}