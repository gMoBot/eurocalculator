import com.example.greedy.ChangeCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by garrettcoggon on 5/26/15.
 */
public class EuroChangeCalculatorTest {

    @Test
    public void zeroChangeMeansYouGetZeroCoins() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(0);
        // assert
        assertEquals("0 €200 + 0 €100 + 0 €50 + 0 €20 + 0 €10 + 0 €5 + 0 €2 + 0 €1 = 0 Coins", coinMessage);
    }
    @Test
    public void twoHundredChangeMeansYouGetOneTwoHundredCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(200);
        // assert
        assertEquals("1 €200 + 0 €100 + 0 €50 + 0 €20 + 0 €10 + 0 €5 + 0 €2 + 0 €1 = 1 Coins", coinMessage);
    }
    @Test
    public void oneHundredChangeMeansYouGetOneHundredCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(100);
        // assert
        assertEquals("0 €200 + 1 €100 + 0 €50 + 0 €20 + 0 €10 + 0 €5 + 0 €2 + 0 €1 = 1 Coins", coinMessage);
    }
    @Test
    public void fiftyChangeMeansYouGetOneFiftyCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(50);
        // assert
        assertEquals("0 €200 + 0 €100 + 1 €50 + 0 €20 + 0 €10 + 0 €5 + 0 €2 + 0 €1 = 1 Coins", coinMessage);
    }

    @Test
    public void twentyChangeMeansYouGetOneTwentyCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(20);
        // assert
        assertEquals("0 €200 + 0 €100 + 0 €50 + 1 €20 + 0 €10 + 0 €5 + 0 €2 + 0 €1 = 1 Coins", coinMessage);
    }
    @Test
    public void tenChangeMeansYouGetOneTenCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(10);
        // assert
        assertEquals("0 €200 + 0 €100 + 0 €50 + 0 €20 + 1 €10 + 0 €5 + 0 €2 + 0 €1 = 1 Coins", coinMessage);
    }
    @Test
    public void fiveChangeMeansYouGetOneFiveCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(5);
        // assert
        assertEquals("0 €200 + 0 €100 + 0 €50 + 0 €20 + 0 €10 + 1 €5 + 0 €2 + 0 €1 = 1 Coins", coinMessage);
    }
    @Test
    public void twoChangeMeansYouGetOneTw0Cent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(2);
        // assert
        assertEquals("0 €200 + 0 €100 + 0 €50 + 0 €20 + 0 €10 + 0 €5 + 1 €2 + 0 €1 = 1 Coins", coinMessage);
    }
    @Test
    public void oneChangeMeansYouGetOneOneCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(1);
        // assert
        assertEquals("0 €200 + 0 €100 + 0 €50 + 0 €20 + 0 €10 + 0 €5 + 0 €2 + 1 €1 = 1 Coins", coinMessage);
    }
    @Test
    public void threeChangeMeansYouGetOneOneAndOneTwoCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(3);
        // assert
        assertEquals("0 €200 + 0 €100 + 0 €50 + 0 €20 + 0 €10 + 0 €5 + 1 €2 + 1 €1 = 2 Coins", coinMessage);
    }
    @Test
    public void eightChangeMeansYouGetOneOneAndOneTwoAndOneFiveCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(8);
        // assert
        assertEquals("0 €200 + 0 €100 + 0 €50 + 0 €20 + 0 €10 + 1 €5 + 1 €2 + 1 €1 = 3 Coins", coinMessage);
    }
    @Test
    public void eighteenChangeMeansYouGetOneOneAndOneTwoAndOneFiveAndOneTenCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(18);
        // assert
        assertEquals("0 €200 + 0 €100 + 0 €50 + 0 €20 + 1 €10 + 1 €5 + 1 €2 + 1 €1 = 4 Coins", coinMessage);
    }
    @Test
    public void thirtyeightChangeMeansYouGetOneOneAndOneTwoAndOneFiveAndOneTenAndOneTwentyCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(38);
        // assert
        assertEquals("0 €200 + 0 €100 + 0 €50 + 1 €20 + 1 €10 + 1 €5 + 1 €2 + 1 €1 = 5 Coins", coinMessage);
    }
    @Test
    public void eightyeightChangeMeansYouGetOneOneAndOneTwoAndOneFiveAndOneTenAndOneTwentyAndOneFiftyCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(88);
        // assert
        assertEquals("0 €200 + 0 €100 + 1 €50 + 1 €20 + 1 €10 + 1 €5 + 1 €2 + 1 €1 = 6 Coins", coinMessage);
    }
    @Test
    public void oneeightyeightChangeMeansYouGetOneOneAndOneTwoAndOneFiveAndOneTenAndOneTwentyAndOneFiftyAndOneHundredCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(188);
        // assert
        assertEquals("0 €200 + 1 €100 + 1 €50 + 1 €20 + 1 €10 + 1 €5 + 1 €2 + 1 €1 = 7 Coins", coinMessage);
    }
    @Test
    public void ThreeeightyeightChangeMeansYouGetOneOneAndOneTwoAndOneFiveAndOneTenAndOneTwentyAndOneFiftyAndOneHundredandOneTwoHundredCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(388);
        // assert
        assertEquals("1 €200 + 1 €100 + 1 €50 + 1 €20 + 1 €10 + 1 €5 + 1 €2 + 1 €1 = 8 Coins", coinMessage);
    }
    @Test
    public void fortynineChangeMeansYouGetTwoTwosAndOneFiveAndTwoTwentysCent() {
        // setup
        ChangeCalculator changeCalculator = new ChangeCalculator();
        // action
        String coinMessage = changeCalculator.euroCalculateChange(49);
        // assert
        assertEquals("0 €200 + 0 €100 + 0 €50 + 2 €20 + 0 €10 + 1 €5 + 2 €2 + 0 €1 = 5 Coins", coinMessage);
    }
}
