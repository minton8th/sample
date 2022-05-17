package practice30;

public class Product {
	private int no;
	private String name;
	private int price;

	public Product() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Product(int no, String name, int price) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.no = no;
		this.name = name;
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
