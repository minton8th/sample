package practice05;

public class Product {
	String productName;
	int unitPrice;
	double rate = 0.2;

	public int getSalePrice() {
		int price = (int) (this.unitPrice * (1 + this.rate));
		return price;
	}
}
