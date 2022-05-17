package practice11;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.println("金額を入力してください");
		int price = scanner.nextInt();
		int taxPrice = Tax.getTaxPrice(price);
		System.out.println("結果");
		System.out.println("金額の消費税額:" + taxPrice);

		scanner.close();
	}

}
