/**
 * CheckingAccount models a bank account and can
 * simulate time passing, as well as taking
 * deposits and withdrawls.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CheckingAccount {
    // Private instance variables


    /**
     * Create account with starting balance bal, interest rate r, owner own
     * Remember to initialize all class variables.
     */
    public CheckingAccount(double bal, double r, String own)
    {
    
    }
    
    /**
     * Create account with owner given, but without an initial deposit
     * Remember to initialize all class variables (set rate = 0.001).
     */
    public CheckingAccount(String own)
    {
        
    }

    /**
     * Get the balance (getter)
     * 
     * @return returns the current balance in the account
     */
    public double getBalance()
    {
    
    }
    
    /**
     * Get the account owner (getter)
     * 
     * @return returns the name of the owner on the account
     */
    public String getOwner() 
    {

    }
    
    /**
     * Get the interest rate (getter)
     * 
     * @return returns the interest rate for the account (as a decimal)
     */
    public double getRate()
    {

    }
    
    /**
     * Get the account age (getter)
     * 
     * @return returns the number of months account has been open
     */
    public int getAge() 
    {

    }
    
    /**
     * Deposits some money into the account (amount > 0)
     * 
     * @param amount - the amount of money to be deposited into the account
     */
    public void processDeposit(double amount)
    {
        
    }
    
    /**
     * Withdraws some money into the account (amount > 0)
     * 
     * @param amount - the amount of money to be taken out of the account
     */ 
    public void processWithdrawal(double amount)
    {
        
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
        
        
        // Add your code...
    }
    
    /**
     * The account info (age, owner, rate, balance) is printed.
     */
    public void printInfo()
    {

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
