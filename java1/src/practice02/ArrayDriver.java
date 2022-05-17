package practice02;

import java.util.Scanner;

public class ArrayDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		// 入力結果を格納する配列定義
		int[] result = new int[3];
		
		// 入力を受け取って、配列に格納する
		System.out.println("数値1を入力してください");
		int num1 = scanner.nextInt();
		result[0] = num1;
		
		System.out.println("数値2を入力してください");
		int num2 = scanner.nextInt();
		result[1] = num2;
		
		System.out.println("数値3を入力してください");
		int num3 = scanner.nextInt();
		result[2] = num3;
		
		// 結果出力
		System.out.println("入力結果（変更前）");
		System.out.println("数値1:" + result[0]);
		System.out.println("数値2:" + result[1]);
		System.out.println("数値3:" + result[2]);
		
		result[1] = result[1] * 10;
		System.out.println("入力結果（変更後）");
		System.out.println("数値1:" + result[0]);
		System.out.println("数値2:" + result[1]);
		System.out.println("数値3:" + result[2]);
		
		scanner.close();
	}

}
