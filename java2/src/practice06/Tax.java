package practice06;

public class Tax {
	double rate = 0.05;

	public int getTaxPrice(int price) {
		int taxPrice = (int) (price * this.rate);
		return taxPrice;
	}

	public int getTaxPrice(String price) {
		int intPrice = Integer.parseInt(price);
		int taxPrice = (int) (intPrice * this.rate);
		return taxPrice;
	}
}
