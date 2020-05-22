
/**
 * @author Logan Cooper
 * @version 2017.2.2
 */
public class CheckingAccount extends BankAccount {

	private double fee;

	/**
	 * @param accountNumber
	 * @param totalBalance
	 * @param fee
	 */
	public CheckingAccount(int accountNumber, double totalBalance, double fee) {
		super(accountNumber, totalBalance);
		this.fee = fee;
	}

	/**
	 * 
	 */
	public void deductFee() {
		totalBalance -= fee;
	}

	public void withdraw(double ammount) {
		totalBalance-=ammount;
		deductFee();
	}
}
