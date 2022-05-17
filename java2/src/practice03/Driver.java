package practice03;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.println("社員番号を入力してください");
		int empNo = scanner.nextInt();
		employee.empNo = empNo;

		System.out.println("社員名を入力してください");
		String empName = scanner.next();
		employee.empName = empName;

		employee.print();

		scanner.close();
	}

}
