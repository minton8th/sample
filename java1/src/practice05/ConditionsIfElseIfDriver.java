package practice05;
import java.util.Scanner;

public class ConditionsIfElseIfDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		// 数値を読み込む
		System.out.println("数値を入力してください");
		int input = scanner.nextInt();
		
		// 読み込んだ数値が正のとき
		if (input > 0) {
			System.out.println("正の値です");
		}
		// 読み込んだ数値が0のとき
		else if (input == 0) {
			System.out.println("0です");
		}
		// 読み込んだ数値が負のとき
		else {
			System.out.println("負の値です");
		}
		
		scanner.close();
	}

}
