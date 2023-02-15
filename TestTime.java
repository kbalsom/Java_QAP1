//QAP 1- Advanced Programming (Java)
//Written By: Kara Balsom
//Date Written: January 23, 2023

//Creates the public class TestTime:
public class TestTime {

    // Creates the main() method:
    public static void main(String[] args) {

        // Uses the Time constructor to create two new objects (t1 and t2), and set the
        // variables.
        Time t1 = new Time(00, 00, 00);
        Time t2 = new Time(00, 00, 00);

        // Uses the setTime() method to set variables for t1.
        t1.setTime(21, 10, 15);

        // Uses the setHour()/setMinute()/setSecond methods to set variables for t2.
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        // Uses the nextSecond() method on t1 and the previousSecond() method on t2.
        t1.nextSecond();
        t2.previousSecond();

        // Uses the toString() method on t1 and t2 and prints the returned results.
        System.out.println("t1 is: " + t1.toString());
        System.out.println("t2 is: " + t2.toString());
    }
}
