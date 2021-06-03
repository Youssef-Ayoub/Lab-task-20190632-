
package banksystem;

/**
 * Creates and Initializes an Account 
 * @author Ahmed Elsayed(20190018)
 */
public class Account {
    double Balance ;
    int accountNumber ;
    static int ID = 1 ;

    /**
     * Constructor which increments the last ID and save it to the
     * new Account number
     */
    public Account() {
        this.accountNumber = ID ;
        ID++ ;
        this.Balance = 0 ;
    }

    /**
     * making you able to set the account number and the initial balance for the account
     * @param Balance of the account
     * @param Account_number of the account
     */
    public Account(double Balance, int Account_number) {
        this.Balance = Balance;
        this.accountNumber = Account_number;
        Account.ID = Account_number ;
        ID++ ;
    }

    /**
     * @return Balance of the account
     */
    public double getBalance() {
        return Balance;
    }

    /**
     * @param Balance of the Account you wish to set to the Account
     */
    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    /**
     * 
     * @return the Account number
     */
    public int getAccount_number() {
        return accountNumber;
    }

    /**
     * 
     * @param Account_number 
     */
    public void setAccount_number(int Account_number) {
        this.accountNumber = Account_number;
    }

    /**
     * 
     * @return the attributes of the account in a certain way
     */
    @Override
    public String toString() {
        return "Account #" + this.accountNumber + " : Balance = " + this.Balance ;
    }
    
    /**
     * Allows you to withdraw from the account Till the balance reaches zero
     * @param amount of money to withdraw
     */
    public void Withdraw(int amount){
        if( this.Balance - amount < 0 || amount < 0){
            System.out.println("This is invalid amount");
            return ;
        }
        this.Balance -= amount ;
    }
    
    /**
     * Allows you to add to the balance of the account
     * @param amount of money to Deposit
     */
    public void Deposit(int amount) {
        if (amount < 0) {
            System.out.println("This is invalid amount");
            return;
        }
        this.Balance += amount ;
    }
}
