package typing;

import java.util.Random;
import java.util.Scanner;

public class TypingApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		// 予約語の配列定義
		String[] reserveWords = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
				"for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new",
				"package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch",
				"synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while" };
		// 正解した数を格納する変数
		int correctNumber = 0;
		// ゲーム終了させるかのフラグ
		boolean finishFlag = false;

		// メインのタイピングアプリの処理
		while (finishFlag == false) {
			// 難易度選択
			System.out.println("難易度の数字を入力してください（初級:0,中級:1,上級:2）");
			int level = scanner.nextInt();
			// 問題数入力
			System.out.println("問題数を入力してください（最大:" + reserveWords.length + ")");
			int questionNumber = scanner.nextInt();
			// ランダムに問題を生成する
//			int[] choiceArray = choice(questionNumber);
			int[] choiceArray = choice2(questionNumber);

			// 問題出題し、入力受け取る処理
			for (int i = 0; i < choiceArray.length; i++) {
				System.out.println("入力してください:");
				System.out.println(reserveWords[choiceArray[i]]);
				String input = scanner.next();
				// EXITと入力されたらループを抜ける
				if (input.equals("EXIT")) {
					System.out.println("終了です");
					questionNumber = i;
					break;
				} else if (input.equals(reserveWords[choiceArray[i]])) {
					System.out.println("OKです");
					correctNumber++;
				} else {
					System.out.println("NGです");
				}
			}
			// 正解数表示
			System.out.println(questionNumber + "問中" + correctNumber + "問正解でした！");
			// もう一度挑戦するかの確認
			System.out.println("もう一度挑戦しますか？(y/n):");
			String retry = scanner.next();
			// フラグで切り替え
			if (retry.equals("y")) {
				finishFlag = false;
			} else {
				finishFlag = true;
			}
		}
		System.out.println("終了です");
		scanner.close();
	}

	// 問題をランダムにチョイスし、配列を返す関数
	public static int[] choice(int questionNumber) {
		int[] choiceArray = new int[questionNumber];
		// choiceArrayの中の数値をすべて範囲外にする
		for (int i = 0; i < questionNumber; i++) {
			choiceArray[i] = 999;
		}
		// 乱数を生成し、その数値がchoiceArrayに含まれていなければchoiceArrayに置き換える
		// questionNumber分置き換え終了したら、繰り返しを抜ける
		Random random = new Random();
		boolean iterFlag = true;
		int count = 0;

		// フラグが切り替わる（すべての要素が999から置換される）まで繰り返す
		while (iterFlag == true) {
			// 0~49までの乱数を生成
			int randomNumber = random.nextInt(50);
			// 生成した乱数がすでにchoiceArrayに含まれていないか探索
			for (int i = 0; i < choiceArray.length; i++) {
				// 含まれていれば、重複するので繰り返しを抜け、再び乱数を生成する
				if (randomNumber == choiceArray[i]) {
					break;
				}
				// 最後まで含まれていなければchoiceArrayのcount番目を生成した乱数に置き換える
				if (i == choiceArray.length - 1) {
					choiceArray[count] = randomNumber;
					// countを1増やす
					count++;
				}
			}

			// countが問題数に達したら、フラグを切り替え、繰り返しを抜ける
			if (count == questionNumber) {
				iterFlag = false;
			}
		}

		return choiceArray;
	}

	// 問題をランダムにチョイスし、配列を返す関数2
	public static int[] choice2(int questionNumber) {
		int[] choiceArray = new int[questionNumber];
		int[] questionArray = new int[50];
		for (int i = 0; i < questionArray.length; i++) {
			questionArray[i] = i;
		}
		Random random = new Random();
		for (int i = questionArray.length - 1; i > 0; i--) {
			int randomNumber = random.nextInt(i + 1);

			int temp = questionArray[i];
			questionArray[i] = questionArray[randomNumber];
			questionArray[randomNumber] = temp;
		}
//		System.out.println(Arrays.toString(questionArray));
		for (int i = 0; i < choiceArray.length; i++) {
			choiceArray[i] = questionArray[i];
		}
		return choiceArray;
	}

}
