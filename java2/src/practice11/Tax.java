package practice11;

public class Tax {
	static double rate;

	static {
		rate = 0.05;
	}

	public static int getTaxPrice(int price) {
		int taxPrice = (int) (price * rate);
		return taxPrice;
	}
}
