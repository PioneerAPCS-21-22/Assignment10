/**
 * CheckingAccount models a bank account and can
 * simulate time passing, as well as taking
 * deposits and withdrawls.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CheckingAccount
{
    // Private instance variables
    private int acctAge;  // in months
    private double rate;  // as a decimal
    private String owner;
    private double balance;


    /**
     * Create account with starting balance bal, interest rate r, owner own
     * Remember to initialize all class variables.
     */
    public CheckingAccount(double bal, double r, String own)
    {
        balance = bal;
        rate = r;
        owner = own;
        acctAge = 0;
    }
    
    /**
     * Create account with owner given, but without an initial deposit
     * Remember to initialize all class variables (set rate = 0.001).
     */
    public CheckingAccount(String own)
    {
        owner = own;
        balance = 0;
        rate = 0.001;
        acctAge = 0;
    }

    /**
     * Get the balance (getter)
     * 
     * @return returns the current balance in the account
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Get the account owner (getter)
     * 
     * @return returns the name of the owner on the account
     */
    public String getOwner() 
    {
        return owner;
    }
    
    /**
     * Get the interest rate (getter)
     * 
     * @return returns the interest rate for the account (as a decimal)
     */
    public double getRate()
    {
        return rate;
    }
    
    /**
     * Get the account age (getter)
     * 
     * @return returns the number of months account has been open
     */
    public int getAge() 
    {
        return acctAge;
    }
    
    /**
     * Deposits some money into the account (amount > 0)
     * 
     * @param amount - the amount of money to be deposited into the account
     */
    public void processDeposit(double amount)
    {
        balance = balance + amount;
    }
    
    /**
     * Withdraws some money into the account (amount > 0)
     * 
     * @param amount - the amount of money to be taken out of the account
     */ 
    public void processWithdrawal(double amount)
    {
        balance = balance - amount;
    }
    
    /**
     * Simulates a month passing.
     *
     * 
     * A = P * (1 + (rate / 12))
     * 
     * P is current ammount
     * A is new amount after interest is added.
     */
    public void runMonth()
    { 
        /* Interest is added to balance and acctAge is incremented by one
         * A = P * (1 + (rate / compounds))
         * P is current ammount in the account
         * A is new amount after interest is added */
        
        
        balance = balance * (1 + rate / 12);
        acctAge = acctAge + 1;
    }
    
    /**
     * The account info (age, owner, rate, balance) is printed.
     */
    public void printInfo()
    {
        System.out.println("Checking Account (" + acctAge + " months old)");

        double perc = rate * 100;
        double r = Math.round(perc * 100) / 100.0;  
        System.out.println("Rate: " + r + "%");

        System.out.println("Owner: " + owner);

        double b = Math.round(balance * 100) / 100.0;
        System.out.println("Balance: $" + b);
    }


    /* DO NOT EDIT BELOW THIS LINE */

    /**
     * Simulate multiple months at once.
     *
     * @param n - the number of months to run.
     */
    public void runMultMonths(int n)
    {
        for(int i = 0; i < n; i++)
        {
            runMonth();
        }
    }
}
