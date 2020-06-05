package com.lambdaschool.piggybank;

public class Penny extends CoinAbstract {

    public Penny(int count) {
        super(count);
        faceValue = 0.01;
    }

    public Penny() {
        faceValue = 0.01;
    }

    @Override
    public String strValue() {
        return count + " penny";
    }

    @Override
    public String strValuePlural() {
        if (this.count > 1) {
            return count + " pennies";
        } else {
            return strValue();
        }
    }
}
