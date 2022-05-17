package communication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommunicationTestApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 質問内容を格納した配列
		String[] quesutionArray = { "自己主張することが下手だと思う", "常に未来に対して情熱を持っている方だ", "他人のためにしたことを感謝されないと、悔しく思うことがある",
				"いやなことはいやと、はっきり言える", "人にはなかなか気を許さない", "人から楽しい人とよく言われる", "短い時間にできるだけ多くののことをしようとする", "失敗しても立ち直りが早い",
				"人からものを頼まれるとなかなかノーと言えない", "たくさんの情報を検討してから決断を下す", "人の話を聞くことよりも自分が話していることの方が多い", "どちらかというと人見知りをする方だ",
				"自分を他人とよく比較する", "変化に強く適応力がある", "何事も自分の感情を表現することが苦手だ", "相手の好き嫌いに関わらず、人の世話をしてしまう方だ", "自分が思ったことはストレートに言う",
				"仕事のできばえについて人から認められたい", "競争心が強い", "何事も完全にしないと気がすまない" };
		// 質問内容のタイプを格納した配列
		char[] quesutionType = { 'D', 'B', 'C', 'A', 'D', 'B', 'A', 'B', 'C', 'D', 'B', 'D', 'C', 'B', 'D', 'C', 'A',
				'C', 'A', 'A' };
		// 各タイプの点数を格納する変数
		int typeA = 0;
		int typeB = 0;
		int typeC = 0;
		int typeD = 0;
		// 各タイプの最終結果を格納する変数
		int resultA = 0;
		int resultB = 0;
		int resultC = 0;
		int resultD = 0;
		int[] result = new int[4];
		char[] type = { 'A', 'B', 'C', 'D' };

		Scanner scanner = new Scanner(System.in);

		System.out.println("今からあなたのコミュニケーションタイプを診断します");
		System.out.println("数値で答えてください");

		for (int i = 0; i < quesutionArray.length; i++) {
			System.out.println(quesutionArray[i]);
			System.out.println("1:よく当てはまる,2:当てはまる,3:当てはまらない,4:全然当てはまらない");
			int input = scanner.nextInt();
			switch (quesutionType[i]) {
			case 'A':
				typeA += input;
				break;
			case 'B':
				typeB += input;
				break;
			case 'C':
				typeC += input;
				break;
			case 'D':
				typeD += input;
				break;
			}
		}

		resultA = 11 - typeA;
		resultB = 12 - typeB;
		resultC = 12 - typeC;
		resultD = 13 - typeD;
		result[0] = resultA;
		result[1] = resultB;
		result[2] = resultC;
		result[3] = resultD;

		int maxValue = max(result);
		List<Integer> maxIndex = searchIndex(result, maxValue);

		System.out.println("A:" + resultA + ",B:" + resultB + ",C:" + resultC + ",D:" + resultD);
		for (int i = 0; i < maxIndex.size(); i++) {
			System.out.println("あなたのコミュニケーションタイプは" + type[maxIndex.get(i)] + "です");
		}

		System.out.println("----------------------------------------------------------------");
		System.out.println("A:ドライバー");
		System.out.println("反対を押し切ってでも成果を上げる");
		System.out.println("・人の話を聞かず、結論を急ぐ");
		System.out.println("・優しい感情を表すことは苦手で、他者から怖がられる");
		System.out.println("・自分のことをコントロールしようとする奴は全員敵");
		System.out.println("・決断力があり、ペースが速い");
		System.out.println("・行動的、野心的");
		System.out.println("・ときに、支配的、威圧的");
		System.out.println("・人間関係より仕事優先");
		System.out.println("・自分の思い通りにならないと、気がすまない");
		System.out.println("・自分以外の人間は弱い存在だと思っている");
		System.out.println("----------------------------------------------------------------");
		System.out.println("B:エクスプレッシブ");
		System.out.println("成果を上げるために、他の人を仲間に巻き込む");
		System.out.println("・お調子者、時にうぬぼれ屋");
		System.out.println("・アイデアが豊富。クリエイティブ");
		System.out.println("・楽しいことが好きで、エネルギッシュ");
		System.out.println("・飽きっぽい");
		System.out.println("・よく話して、あまり聞かない");
		System.out.println("・人のモチベーションを上げるのが上手");
		System.out.println("・変化、混乱に強く順応性が高い");
		System.out.println("・人を承認するのが得意で、承認されるものも好き");
		System.out.println("・仕切るのが好きで、得意でもある");
		System.out.println("----------------------------------------------------------------");
		System.out.println("C:エミアブル");
		System.out.println("任務進行のために他人と協力する");
		System.out.println("・人を援助する事を好む");
		System.out.println("・温かく、穏やか");
		System.out.println("・職場では協調性が高く気配りがあり、意欲もある");
		System.out.println("・決断には時間がかかる、ノーと言えない");
		System.out.println("・感情に基づいて判断する");
		System.out.println("・対立を避ける、他者の気持ちに敏感");
		System.out.println("・リスクを冒すのは苦手");
		System.out.println("・親密な人間関係を築く");
		System.out.println("・無意識に相手からの感謝や愛情を求めている");
		System.out.println("----------------------------------------------------------------");
		System.out.println("D:アナリティカル");
		System.out.println("現状を維持しながら仕事の質の向上も図る");
		System.out.println("・行動、対人関係ともに慎重");
		System.out.println("・感情表現は苦手");
		System.out.println("・客観的論理的な話し方をする、計画や分析を好む");
		System.out.println("・粘り強い");
		System.out.println("・失敗や間違いを嫌う");
		System.out.println("・自分のことはあまり話さない");
		System.out.println("・人は好きだが、大人数は苦手");
		System.out.println("・孤立してもあなり苦にならない");
		System.out.println("・物事を取り組む前に、データを集め分析する");
		System.out.println("----------------------------------------------------------------");

		scanner.close();

	}

	// 配列の最大値を求める関数
	public static int max(int[] array) {
		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}

	// 配列の任意の値のインデックスを求める関数
	public static List<Integer> searchIndex(int[] array, int number) {
		List<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				index.add(i);
			}
		}
		return index;
	}
}
