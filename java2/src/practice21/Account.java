package practice21;

public class Account {
	private int accountNo;
	private int balance;

	public Account(int accountNo) {
		this.accountNo = accountNo;
	}

	public void addBalance(int balance) throws IllegalDebidException {
		if (balance < 0) {
			throw new IllegalDebidException();
		}
		this.balance += balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return balance;
	}
}
