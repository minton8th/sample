package practice13;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.println("商品番号を入力してください");
		int productNo = scanner.nextInt();

		System.out.println("商品名を入力してください");
		String productName = scanner.next();

		System.out.println("単価を入力してください");
		int unitPrice = scanner.nextInt();

		Product product = new Product(productNo, productName, unitPrice);

		System.out.println("結果");
		System.out.println("商品番号:" + product.getProductNo());
		System.out.println("商品名:" + product.getProductName());
		System.out.println("単価:" + product.getUnitPrice());
		System.out.println("販売価格:" + product.getSalesPrice());

		scanner.close();
	}

}
