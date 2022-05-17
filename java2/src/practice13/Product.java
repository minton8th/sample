package practice13;

public class Product {
	private int productNo;
	private String productName;
	private int unitPrice;

	public Product(int productNo, String productName, int unitPrice) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.productNo = productNo;
		this.productName = productName;
		this.unitPrice = unitPrice;
	}

	public int getSalesPrice() {
		int salesPrice = (int) (this.unitPrice * 0.5);
		return salesPrice;
	}

	public int getProductNo() {
		return productNo;
	}

	public String getProductName() {
		return productName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}
}
