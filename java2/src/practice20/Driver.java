package practice20;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.println("数字を入力してください");
		int x = scanner.nextInt();
		try {
			int doubleResult = toDouble(x);
			System.out.println("2倍した値:" + doubleResult);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			int squareResult = toSquare(x);
			System.out.println("2乗した値:" + squareResult);
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		scanner.close();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("数字を入力してください。");
//		int x = scanner.nextInt();
//		int doubleResult = 0;
//		try {
//			doubleResult = toDouble(x);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("2倍した値:" + doubleResult);
//		int squareResult = toSquare(x);
//		System.out.println("2乗した値:" + squareResult);
	}

	public static int toDouble(int x) throws Exception {
		if (x == 0) {
			throw new Exception("x=0");
		}
		return x * 2;
	}

	public static int toSquare(int x) throws RuntimeException {
		if (x == 0) {
			throw new RuntimeException("x=0");
		}
		return x * x;
	}

}
