package com.lambdaschool.piggybank;

public class Nickel extends CoinAbstract {

    public Nickel (int count) {
        super(count);
        faceValue = 0.05;
    }

    public Nickel() {
        faceValue = 0.05;
    }

    @Override
    public String strValue() {
        return count + " Nickel";
    }

    @Override
    public String strValuePlural() {
        if (this.count > 1) {
            return count + " Nickels";
        } else {
            return strValue();
        }
    }
}
