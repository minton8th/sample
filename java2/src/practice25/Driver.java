package practice25;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("プレイヤーを入力してください");
		System.out.println("1:CD 2:DVD");
		int input = scanner.nextInt();

		System.out.println("タイトルを入力してください");
		String title = scanner.next();

		PolymorphismPlayer polymorphismPlayer = new PolymorphismPlayer(title);

		if (input == 1) {
			polymorphismPlayer.call(new CDPlayer());
		} else if (input == 2) {
			polymorphismPlayer.call(new DVDPlayer());
		} else {

		}

		scanner.close();
	}
}
