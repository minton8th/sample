package practice27;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.println("EAST, WEST, SOUTH, NORTHの何れかを入力してください。");
		String jname = scanner.next();

		Direction direction = Direction.valueOf(jname);
		System.out.println(direction.getJname() + "が指定されました");

		scanner.close();
	}

}
