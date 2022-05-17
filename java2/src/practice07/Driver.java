package practice07;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.println("社員番号を入力してください");
		int empNo = scanner.nextInt();

		System.out.println("社員名を入力してください");
		String empName = scanner.next();

		Employee employee = new Employee(empNo);
		employee.empName = empName;

		System.out.println("結果");
		System.out.println("社員番号:" + employee.empNo);
		System.out.println("社員名:" + employee.empName);

		scanner.close();
	}
}
