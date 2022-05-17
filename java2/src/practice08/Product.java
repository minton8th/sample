package practice08;

public class Product {
	int productNo;
	String productName;
	int unitPrice;
	int stock;

	public Product(int pProductNo) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.productNo = pProductNo;
	}

	public Product(int pProductNo, String pProductName) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.productNo = pProductNo;
		this.productName = pProductName;
	}

	public Product(int pProductNo, String pProductName, int pUnitPrice) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.productNo = pProductNo;
		this.productName = pProductName;
		this.unitPrice = pUnitPrice;
	}
}
