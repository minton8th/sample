package practice25;

public class PolymorphismPlayer {
	String title;

	public PolymorphismPlayer(String title) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.title = title;
	}

	public void call(AbstractPlayer abstractPlayer) {
		abstractPlayer.play(this.title);
	}
}
