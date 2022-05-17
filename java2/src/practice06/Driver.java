package practice06;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		Tax tax = new Tax();

		System.out.println("金額1を入力してください");
		int price1 = scanner.nextInt();
		int taxPrice1 = tax.getTaxPrice(price1);

		System.out.println("金額2を入力してください");
		String price2 = scanner.next();
		int taxPrice2 = tax.getTaxPrice(price2);

		System.out.println("結果");
		System.out.println("金額1の消費税額:" + taxPrice1);
		System.out.println("金額2の消費税額:" + taxPrice2);

		scanner.close();
	}

}
