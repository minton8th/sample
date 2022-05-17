package practice28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		List<Product> products = new ArrayList<Product>();

		System.out.println("何商品登録しますか？");
		int itemNum = scanner.nextInt();

		for (int i = 0; i < itemNum; i++) {
			System.out.println("商品番号[" + i + "]を入力してください");
			int no = scanner.nextInt();

			System.out.println("商品名[" + i + "]を入力してください");
			String name = scanner.next();

			System.out.println("価格[" + i + "]を入力してください");
			int price = scanner.nextInt();

			Product product = new Product(no, name, price);
			products.add(product);
		}

		for (int i = 0; i < itemNum; i++) {
			System.out.println("商品[" + i + "]");
			System.out.println("商品番号:" + products.get(i).getNo() + "　商品名:" + products.get(i).getName() + "　価格:"
					+ products.get(i).getPrice());

		}

		scanner.close();
	}

}
