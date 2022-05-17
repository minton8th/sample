package practice10;

public class Tax {
	static double rate = 0.05;

	public static int getTaxPrice(int price) {
		int taxPrice = (int) (price * rate);
		return taxPrice;
	}
}
