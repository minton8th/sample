package practice09;

public class RepeatWhileDriver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] stations = {"品川", "大崎", "五反田", "目黒", "恵比寿", "渋谷", "原宿", "代々木", "新宿"};
		
		int count = 0;
		
		while (count < stations.length) {
			System.out.println(stations[count]);
			count++;
		}
	}

}
