package practice23;

public abstract class AbstractPlayer {
	String mediaName;

	public void play() {
		loadDisc();
		playDisc();
	}

	abstract void loadDisc();

	abstract void playDisc();
}
