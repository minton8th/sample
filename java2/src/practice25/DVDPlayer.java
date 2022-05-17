package practice25;

public class DVDPlayer extends AbstractPlayer {

	@Override
	void loadDisc(String title) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("DVD[" + title + "]を読み込みます");
	}

	@Override
	void playDisc(String title) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("DVD[" + title + "]を再生します");
	}

}
