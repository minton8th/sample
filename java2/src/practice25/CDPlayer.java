package practice25;

public class CDPlayer extends AbstractPlayer {

	@Override
	void loadDisc(String title) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("CD[" + title + "]を読み込みます");
	}

	@Override
	void playDisc(String title) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("CD[" + title + "]を再生します");
	}

}
