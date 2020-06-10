/**
 * This Object-Oriented" version of the "BankAccount" class
 * is stripped down to the essentials for illustrating the
 * use of the "if" statement.
 * 
 * SKELETON FOR LAB TEST.
 * 
 * @author Raymond Lister
 * @version April 2015
 */

public class BankAccountOOif
{

    private double balance; // e.g. 1.27 means $1.27


    /**
     * @param    bal    opening balance
     */
    public BankAccountOOif(double bal)
    {
        
        balance = bal;
    }

    
   /**
    * @return     The account balance 
    */
    public double getBalance()
    {
        return balance;
    }
    

    /**
     * The withdrawal should be refused if the withdrawal
     * would result in a negative balance.
     * 
     * @param   amount  The amount to be withdrawn
     *
     * @return  new balance or -1.0 if withdrawal refused
     */
    public double withdraw(double amount)
    {  
       
       if (balance < amount)
       return -1;
       
       balance -= amount;
       return balance;
       
       
       
       
    }

} // class BankAccountOOif
