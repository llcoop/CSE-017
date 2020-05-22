
/**
 * @author Logan Cooper
 * @version 2017.2.2
 */
public class SavingsAccount extends BankAccount{

	private double interestRate;
	
	/**
	 * @param accountNumber
	 * @param totalBalance
	 * @param interestRate
	 */
	public SavingsAccount(int accountNumber, double totalBalance, double interestRate)
	{
		super(accountNumber, totalBalance);
		this.interestRate=interestRate;
	}
	
	/**
	 * 
	 */
	public void addInterest()
	{
		totalBalance*=interestRate;
	}
}
