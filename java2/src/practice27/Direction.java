package practice27;

public enum Direction {
	EAST("東"), WEST("西"), SOUTH("南"), NORTH("北");

	String jname;

	private Direction(String jname) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.jname = jname;
	}

	public String getJname() {
		return jname;
	}

}
