package practice06;
import java.util.Scanner;

public class ConditionsSwitchDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		// 数値を読み込む
		System.out.println("数値を入力してください");
		int input = scanner.nextInt();
		
		// 3で割ったときの余りに応じて処理を分岐させる
		switch (input % 3) {
			// 余りが0のとき
			case 0:
				System.out.println("3で割り切れます");
				break;
			// 余りが1のとき
			case 1:
				System.out.println("3で割った剰余は1です");
				break;
			// 余りが2のとき
			case 2:
				System.out.println("3で割った剰余は2です");
				break;	
		}
		
		scanner.close();
	}

}
