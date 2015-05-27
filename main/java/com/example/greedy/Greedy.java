package com.example.greedy;

import java.io.Console;
import java.util.Scanner;

import static java.lang.Float.parseFloat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * com.example.greedy.Greedy.java
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
        StringBuilder stringBuilder = new StringBuilder();
        String currencyType;
        do {
            currencyType = null;
            stringBuilder.setLength(0);
            System.out.print("Please enter the amount and type(ie; $ or €)\n" +
                    "of converted change needed: \n");
            stringBuilder.append(input.nextLine());
            if (stringBuilder.length() <= 1) {
                continue;
            }
            if ((stringBuilder.substring(0, 1).matches("[\\$€]"))) {
                changeValue = parseFloat(stringBuilder.substring(1));
                currencyType = stringBuilder.substring(0,1);
            }

        } while (changeValue <= 0.00 || currencyType == null);

        // convert float input into int value for precise use by greedy algorithm
        int convertedChange = Math.round(changeValue * 100);

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        if (currencyType.matches("[\\$]")) {
            ChangeCalculator uSChange = (ChangeCalculator) context.getBean("dollars");
            uSChange.CalculateChange(convertedChange);

        } else if (currencyType.matches("[\\€]")) {
            ChangeCalculator eUChange = (ChangeCalculator) context.getBean("euros");
            eUChange.EuroCalculateChange(convertedChange);
        }
        else
            System.out.println("currency type does not match");
    }
}
