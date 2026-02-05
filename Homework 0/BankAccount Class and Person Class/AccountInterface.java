/**
 * This class represents a bank account with basic services 
 * such as deposit, get account balance, and withdraw.
 */
public interface AccountInterface {
	
	/**
	 * Deposits the specified amount into the account. 
	 * Returns the new balance.
	 * @param amount
	 * @return
	 */
	public double deposit(double amount);
	
	/**
	 * Withdraws the specified amount from the account and applies the fee.
	 * Returns the new balance.
	 * @param amount
	 * @param fee
	 * @return
	 */
	public double withdraw(double amount, double fee);
	
	/**
	 * Withdraws the specified amount from the account.
	 * Returns the new balance.
	 * @param amount
	 * @return
	 */
	public double withdraw(double amount);
	
	/**
	 * Add the interests to the account and returns the new balance.
	 * The default interest rate is 0.0435 (4.55%)
	 * return the new balance
	 */
	public double addInterest();
	

	
	/**
	 * Increases the account balance by 1 and returns the new balance
	 * @return
	 */
	public double increment();

	/**
	 * Decreases the account balance by 1 and returns the new balance
	 * @return
	 */
	public double decrement();
	

	/**
	 * Returns the owner of the account.
	 * @return
	 */
	public Person getOwner();
	
	
	/**
	 * Returns the account number of the account.
	 * @return
	 */	
	public long getAcctNumber();
	
	
	/**
	 * Returns the current balance of the account.
	 * @return
	 */
	public double getBalance();
	
}
