package practice03;
import java.util.Scanner;

public class ConditionsIfDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("数値を入力してください");
		int input = scanner.nextInt();
		
		if (input % 2 == 0) {
			int output = input * 10;
			System.out.println("結果:" + output);
		}else {
			System.out.println("結果:" + input);
		}
		
		scanner.close();
	}

}
