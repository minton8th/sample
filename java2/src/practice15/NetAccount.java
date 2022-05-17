package practice15;

public class NetAccount extends Account {
	public NetAccount(int accountNo, String accountName, int balance) {
		super(accountNo, accountName, balance);
	}

	public void print() {
		System.out.println("インターネット口座");
		System.out.println("口座番号:" + this.getAccountNo());
		System.out.println("口座名義:" + this.getAccountName());
		System.out.println("残高:" + this.getBalance());
	}
}