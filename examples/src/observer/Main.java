package observer;

/**
 * Created by stefanius on 16/06/14.
 */
public class Main {

    public static void main(String args[]) {

        Newspaper printMedia = new Newspaper();
        Internet onlineMedia = new Internet();

        Loan personalLoan = new Loan(1.0, 1.0);
        personalLoan.registerObserver(printMedia);
        personalLoan.registerObserver(onlineMedia);
        personalLoan.setInterest(3.5f);

        personalLoan.notifyObservers();

       // Read more: http://javarevisited.blogspot.com/2011/12/observer-design-pattern-java-example.html#ixzz34qB3rXeU

    }

}
