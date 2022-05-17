package practice05;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		Product product = new Product();

		System.out.println("商品名を入力してください");
		String productName = scanner.next();
		product.productName = productName;

		System.out.println("単価を入力してください");
		int unitPrice = scanner.nextInt();
		product.unitPrice = unitPrice;

		int price = product.getSalePrice();

		System.out.println("結果");
		System.out.println("商品名:" + product.productName);
		System.out.println("単価:" + product.unitPrice);
		System.out.println("税込価格:" + price);

		scanner.close();
	}

}
