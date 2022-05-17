package practice08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		List<Integer> productNos = new ArrayList<Integer>();
		List<String> productNames = new ArrayList<String>();
		List<Integer> unitPrices = new ArrayList<Integer>();
		List<Integer> stocks = new ArrayList<Integer>();

		int number = 3; // プロダクトの数

		for (int i = 0; i < number; i++) {
			System.out.println("商品番号" + (i + 1) + "を入力してください");
			int productNo = scanner.nextInt();
			productNos.add(productNo);

			System.out.println("商品名" + (i + 1) + "を入力してください");
			String productName = scanner.next();
			productNames.add(productName);

			System.out.println("単価" + (i + 1) + "を入力してください");
			int unitPrice = scanner.nextInt();
			unitPrices.add(unitPrice);

			System.out.println("在庫数" + (i + 1) + "を入力してください");
			int stock = scanner.nextInt();
			stocks.add(stock);
		}

		Product product1 = new Product(productNos.get(0));
		product1.productName = productNames.get(0);
		product1.unitPrice = unitPrices.get(0);
		product1.stock = stocks.get(0);

		Product product2 = new Product(productNos.get(1), productNames.get(1));
		product2.unitPrice = unitPrices.get(1);
		product2.stock = stocks.get(1);

		Product product3 = new Product(productNos.get(2), productNames.get(2), unitPrices.get(2));
		product3.stock = stocks.get(2);

		Product[] products = { product1, product2, product3 };

		System.out.println("結果");
		for (int i = 0; i < number; i++) {
			System.out.println("商品番号" + (i + 1) + ":" + products[i].productNo);
			System.out.println("商品名" + (i + 1) + ":" + products[i].productName);
			System.out.println("単価" + (i + 1) + ":" + products[i].unitPrice);
			System.out.println("在庫数" + (i + 1) + ":" + products[i].stock);
		}

		scanner.close();
	}

}
