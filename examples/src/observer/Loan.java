package observer;

import observer.pattern.base.Subject;

/**
 * Created by stefanius on 16/06/14.
 */
public class Loan extends Subject {

    protected double interest;

    protected double amount;

    public Loan(double interest, double amount) {
        this.interest = interest;
        this.amount = amount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
