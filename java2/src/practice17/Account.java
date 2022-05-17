package practice17;

public class Account {
	private int accountNo;
	private String accountName;
	private int balance;

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setBalance(int balance) {
		this.balance = balance;
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
