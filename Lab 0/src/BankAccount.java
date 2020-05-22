
/**
 * @author Logan Cooper
 * @version 2107.2.2
 */
public class BankAccount {

	public int accountNumber;
	public double totalBalance;

	/**
	 * @param accountNumber
	 * @param totalBalance
	 */
	public BankAccount(int accountNumber, double totalBalance) {
		this.accountNumber = accountNumber;
		this.totalBalance = totalBalance;
	}
	
	/**
	 * @param ammount
	 */
	public void deposit(double ammount)
	{
		totalBalance+=ammount;
	}
	/**
	 * @param ammount
	 */
	public void withdraw(double ammount)
	{
		totalBalance-=ammount;
	}
	/**
	 * @return totalBalance
	 */
	public double getBalance()
	{
		return totalBalance;
	}
}
