package practice18;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.println("割られる数を入力してください");
		int x = scanner.nextInt();

		System.out.println("割る数を入力してください");
		int y = scanner.nextInt();

		try {
			int result = x / y;
			System.out.println("結果:" + result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("例外が発生しました");
			e.printStackTrace();
		}

		scanner.close();
	}

}
