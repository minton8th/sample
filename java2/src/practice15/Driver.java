package practice15;

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

		NetAccount netAccount = new NetAccount(accountNo, accountName, balance);

		System.out.println("結果");
		netAccount.print();

		scanner.close();
	}

}
