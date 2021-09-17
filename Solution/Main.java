/**
 * This class runs the program for managing a checking account.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {

        // create CheckingAccount object with starting deposit of
        // $1000, 1.2% interest rate, and an account owner.
        CheckingAccount acct1 = new CheckingAccount(1000.0, 0.012, "Mr. King");        
        
        // create CheckingAccount object with an account owner (no initial deposit).
        CheckingAccount acct2 = new CheckingAccount("Mr. King");        
        
        // print account info for both accounts
        acct1.printInfo();
        acct2.printInfo();

        
        // make one month pass for both accounts
        acct1.runMonth();
        acct2.runMonth();

        
        // print account info for both accounts
        acct1.printInfo();
        acct2.printInfo();
        

        // make three months pass for both accounts
        acct1.runMultMonths(3);
        acct2.runMultMonths(3);

        
        // deposit $300 into both accounts
        acct1.processDeposit(300);
        acct2.processDeposit(300);

        
        // make eight months pass for both accounts
        acct1.runMultMonths(8);
        acct2.runMultMonths(8);

        
        // print account info for both accounts
        acct1.printInfo();
        acct2.printInfo();

        
        // withdraw $75 from both accounts
        acct1.processWithdrawal(75);
        acct2.processWithdrawal(75);

        
        // print account info for both accounts
        acct1.printInfo();
        acct2.printInfo();
    }
}
