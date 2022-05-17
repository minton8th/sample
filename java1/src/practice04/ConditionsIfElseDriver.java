package practice04;
import java.util.Scanner;

public class ConditionsIfElseDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int input = scanner.nextInt();
		if (input % 4 == 0) {
			System.out.println("4の倍数です");
		}else {
			System.out.println("4の倍数ではありません");
		}
		scanner.close();
	}

}
