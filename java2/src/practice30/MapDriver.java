package practice30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDriver {

//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		Scanner scanner = new Scanner(System.in);
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
//		map.put(101, "ポテトチップス");
//		map.put(102, "オレンジジュース");
//		map.put(103, "バナナ");
//		map.put(104, "リンゴ");
//		map2.put(101, 150);
//		map2.put(102, 120);
//		map2.put(103, 100);
//		map2.put(104, 200);
//
//		System.out.println("商品番号を入力してください");
//		int no = scanner.nextInt();
//
//		if (map.containsKey(no)) {
//			System.out.println("商品番号:" + no + "　商品名:" + map.get(no) + "　価格:" + map2.get(no));
//		} else {
//			System.out.println("対象の商品は存在しません");
//		}
//
//		scanner.close();
//	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Product> map = new HashMap<Integer, Product>();
		map.put(101, new Product(101, "ポテトチップス", 150));
		map.put(102, new Product(102, "オレンジジュース", 120));
		map.put(103, new Product(103, "バナナ", 100));
		map.put(104, new Product(104, "リンゴ", 200));

		System.out.println("商品番号を入力してください");
		int no = scanner.nextInt();

		if (map.containsKey(no)) {
			System.out.println(
					"商品番号:" + map.get(no).getNo() + "　商品名:" + map.get(no).getName() + "　価格:" + map.get(no).getPrice());
		} else {
			System.out.println("対象の商品は存在しません");
		}

		scanner.close();
	}

}
