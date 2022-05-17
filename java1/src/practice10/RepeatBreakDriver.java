package practice10;
import java.util.Scanner;

public class RepeatBreakDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String[] stations = {"品川", "大崎", "五反田", "目黒", "恵比寿", "渋谷", "原宿", "代々木", "新宿"};
		
		// 駅名を読み込む
		System.out.println("駅名を入力してください");
		String station = scanner.next();
		
		// 駅の配列から同じ駅があるか探索する
		for (int i = 0; i < stations.length; i++) {
			// 配列の中に同じ駅があるとき繰り返しから抜ける
			if (station.equals(stations[i])) {
				int num = i + 1;
				System.out.println(num + "番目の駅です");
				break;
			}
			// 配列の最後まで同じ駅が見つからなかったとき
			if (i == stations.length - 1) {
				System.out.println("そのような駅は存在しません");
			}
		}
		scanner.close();
	}

}
