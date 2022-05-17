package practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();
		int people = 3; // 追加する社員人数

		for (int i = 0; i < people; i++) {
			Employee employee = new Employee();
			employees.add(employee);
		}

		for (int i = 1; i <= people; i++) {
			System.out.println("社員番号" + i + "を入力してください");
			int empNo = scanner.nextInt();
			employees.get(i - 1).empNo = empNo;

			System.out.println("社員名" + i + "を入力してください");
			String empName = scanner.next();
			employees.get(i - 1).empName = empName;
		}

		System.out.println("結果");
		for (int i = 0; i < people; i++) {
			System.out.println("社員番号" + (i + 1) + ":" + employees.get(i).empNo);
			System.out.println("社員名" + (i + 1) + ":" + employees.get(i).empName);
		}
		scanner.close();
	}

}
