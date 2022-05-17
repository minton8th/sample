package practice17;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.println("口座番号を入力してください");
		int accountNo = scanner.nextInt();

		System.out.println("口座名義を入力してください");
		String accountName = scanner.next();

		System.out.println("残高を入力してください");
		int balance = scanner.nextInt();

		NetAccount account = new NetAccount();
		account.setAccountNo(accountNo);
		account.setAccountName(accountName);
		account.setBalance(balance);

		System.out.println("結果");
		account.print();

		scanner.close();
	}

}
