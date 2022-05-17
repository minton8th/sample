package practice11;
import java.util.Scanner;

public class RepeatContinueDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String[] stations = {"品川", "大崎", "五反田", "目黒", "恵比寿", "渋谷", "原宿", "代々木", "新宿"};
		
		System.out.println("駅名を入力してください");
		String station = scanner.next();
		
		for (int i = 0; i < stations.length; i++) {
			if (station.equals(stations[i])) {
				continue;
			}
			System.out.println(stations[i]);
		}
		scanner.close();
	}

}
