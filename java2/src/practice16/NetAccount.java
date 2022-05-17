package practice16;

public class NetAccount extends Account {
	public NetAccount(int accountNo, String accountName, int balance) {
		super(accountNo, accountName, balance);
	}

	public void print() {
		System.out.println("インターネット口座");
		super.print();
	}
}
