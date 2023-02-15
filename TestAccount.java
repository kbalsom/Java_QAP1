//QAP 1- Advanced Programming (Java)
//Written By: Kara Balsom
//Date Written: January 23, 2023

//Creates the public class TestAccount:
public class TestAccount {

    // Creates the main() method:
    public static void main(String[] args) {
        // Uses the Account constructor which takes the three parameters (i, n, and b),
        // to create new accounts Acc1 and Acc2:
        Account Acc1 = new Account("1", "Acc1", 5000);
        Account Acc2 = new Account("2", "Acc2", 4000);
        // Prints out the balances of Acc1 and Acc2 using the getBalance() method:
        System.out.println("Balance of Acc1 = " + Acc1.getBalance());
        System.out.println("Balance of Acc2 = " + Acc2.getBalance());
        // Uses toString() method to print out the details of Acc2 in the specified
        // string format:
        System.out.println(Acc2.toString());
        // Uses the credit() method to add an amount to Acc1, and prints out the
        // returned balance:
        System.out.println("New Acc1 Balance = " + Acc1.credit(20));
        // Uses the debit() method to subtract an amount from Acc1 and prints out the
        // returned balance:
        System.out.println("New Acc1 Balance = " + Acc1.debit(20));
        // Uses the transferTo() method to transfer the specified amount from Acc1 to
        // Acc2:
        Acc1.transferTo(1000, Acc2);
        // Prints out the balances of Acc1 and Acc2 using the getBalance() method:
        System.out.println("Balance of Acc1 = " + Acc1.getBalance());
        System.out.println("Balance of Acc2 = " + Acc2.getBalance());
    }
}
