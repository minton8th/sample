package practice15;

public class Account {
	private int accountNo;
	private String accountName;
	private int balance;

	public Account(int accountNo, String accountName, int balance) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public int getBalance() {
		return balance;
	}

	public void print() {
		System.out.println("口座番号:" + accountNo);
		System.out.println("口座名義:" + accountName);
		System.out.println("残高:" + balance);
	}
}
