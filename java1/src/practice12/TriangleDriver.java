package practice12;
import java.util.Scanner;

public class TriangleDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		// 数値を読み込む
		System.out.println("数値を入力してください");
		int input = scanner.nextInt();
		
		// スペースが必要な数を格納した変数定義
		int spaceCount = input - 1;
		
		// 読み込んだ数値分繰り返す
		for (int i = 0; i < input; i++) {
			// 各行での処理
			for (int j = 0; j < input; j++) {
				// スペースが必要な数に達するまでスペースを出力する
				if (j < spaceCount) {
					System.out.print("　");
				}
				// スペースを入力しきったら行の最後の数-1まで▲を出力する
				else {
					System.out.print("▲");
				}
			}
			// スペースが必要な数を1減らす
			spaceCount = spaceCount - 1;
			System.out.println();
		}
		
		scanner.close();
	}

}
