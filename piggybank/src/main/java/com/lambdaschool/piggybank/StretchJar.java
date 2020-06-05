package com.lambdaschool.piggybank;

public class StretchJar {

    public int pennies;
    public double total;

    public StretchJar(int p) {
        pennies = p;
        total = 0.0;
    }

    public void addPennies(int p) {
        if (p <= 0) {
            System.out.println("Cannot Add a Negative Amount of Pennies");
        } else {
            pennies = pennies + p;
            total = total + p * 0.01;
        }
    }

    public void removePennies(int p) {
        if (p <= 0 || pennies <= 0) {
            System.out.println("Cannot Remove a Negative Amount of Pennies");
        } else {
            pennies = pennies - p;
            total = total - p * 0.01;
        }
    }

    public double getTotalofStretch() {
        return total;
    }

    @Override
    public String toString() {
        return "Total of Pennies: " + pennies;
    }
}
