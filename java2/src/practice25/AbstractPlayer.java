package practice25;

public abstract class AbstractPlayer {
	String mediaName;

	public void play(String title) {
		loadDisc(title);
		playDisc(title);
	}

	abstract void loadDisc(String title);

	abstract void playDisc(String title);
}
