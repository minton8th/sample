package practice01;
import java.util.Scanner;

public class OperatorDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int input = scanner.nextInt();
		int output1 = input + 5;
		int output2 = input - 5;
		System.out.println("5を加えた結果は" + output1 + "です");
		System.out.println("5を減じた結果は" + output2 + "です");
		scanner.close();
	}

}
