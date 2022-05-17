package practice04;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		Card card = new Card();

		System.out.println("カード所有者名を入力してください");
		String name = scanner.next();
		System.out.println("現在のポイント:" + card.point);
		while (true) {
			System.out.println("追加ポイントを入力してください");
			int addPoint = scanner.nextInt();
			card.addPoint(addPoint);
			System.out.println("現在のポイント:" + card.point);
		}
	}

}
