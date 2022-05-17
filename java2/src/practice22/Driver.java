package practice22;

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
			System.out.println("結果:" + Calculator.divide(x, y));
		} catch (IllegalInputException e) {
			// TODO: handle exception
			System.out.println("不正な数が入力されました");
			e.printStackTrace();
		}

		scanner.close();
	}

}
