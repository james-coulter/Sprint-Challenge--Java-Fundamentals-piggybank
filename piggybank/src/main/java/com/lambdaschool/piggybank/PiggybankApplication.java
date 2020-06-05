package com.lambdaschool.piggybank;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class PiggybankApplication {

    public static List<CoinAbstract> piggyBank = new ArrayList<>();

    public static void main(String[] args) {

//        System.out.println("It's Compiling!!");

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        System.out.println("*** MVP | Piggy Bank Value ***");
        piggyBank.forEach(p -> System.out.println(p.strValuePlural()));

        DecimalFormat DecFormat = new DecimalFormat("$###,###.00");

        double piggyValue = 0.0;
        for (CoinAbstract m : piggyBank) {
            piggyValue = piggyValue + m.getValue();
        }
        System.out.println("The piggy bank holds " + DecFormat.format(piggyValue));

        System.out.println("*** STRETCH ***");

    }

}
