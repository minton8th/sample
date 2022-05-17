package practice21;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.println("口座番号を入力してください");
		int accountNo = scanner.nextInt();

		System.out.println("貯金額を入力してください");
		int balance = scanner.nextInt();

		Account account = new Account(accountNo);
		try {
			account.addBalance(balance);

			System.out.println("結果");
			System.out.println("口座番号:" + account.getAccountNo());
			System.out.println("残高:" + account.getBalance());

		} catch (IllegalDebidException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("不正な貯金額が入力されました");
		}

		scanner.close();
	}

}
