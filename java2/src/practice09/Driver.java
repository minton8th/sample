package practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		List<Store> stores = new ArrayList<Store>();

		int storeNumber = 3; // 店舗数

		for (int i = 0; i < storeNumber; i++) {
			System.out.println("店舗名" + (i + 1) + "を入力してください");
			String storeName = scanner.next();
			System.out.println("売上金額" + (i + 1) + "を入力してください");
			int sales = scanner.nextInt();
			Store.totalSales += sales;
			Store store = new Store(storeName, sales);
			stores.add(store);
		}

		System.out.println("結果");
		for (int i = 0; i < stores.size(); i++) {
			System.out.println("店舗名" + (i + 1) + ":" + stores.get(i).storeName);
			System.out.println("売上金額" + (i + 1) + ":" + stores.get(i).sales);
		}
		System.out.println("総売上金額:" + Store.totalSales);

		scanner.close();
	}

}
