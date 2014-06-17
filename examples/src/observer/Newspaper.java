package observer;

import observer.pattern.interfaces.ISubject;
import observer.pattern.base.Observer;

/**
 * Created by stefanius on 16/06/14.
 */

public class Newspaper extends Observer {

    @Override
    public void update(ISubject subject) {

        Loan loan = (Loan) subject;

        System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                + loan.getInterest());
    }
}


//Read more: http://javarevisited.blogspot.com/2011/12/observer-design-pattern-java-example.html#ixzz34q9TdcJX