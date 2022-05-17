package practice26;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("走らせたいものを入力してください");
		System.out.println("1:人　2:車");
		int input = scanner.nextInt();

		PolymorphismRunner polymorphismRunner = new PolymorphismRunner();
		if (input == 1) {
			polymorphismRunner.call(new Human());
		} else if (input == 2) {
			polymorphismRunner.call(new Car());
		} else {

		}

		scanner.close();

	}
}
