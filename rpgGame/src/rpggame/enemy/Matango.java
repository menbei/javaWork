package rpggame.enemy;

public class Matango {
	// フィールド宣言
	private int hp;
	final int LEVEL = 10;
	private char suffix;

	// Getter、Setterを定義
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public char getSuffix() {
		return suffix;
	}

	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}

	// メソッド定義
	public void run() {
		System.out.println("おばけキノコ" + this.getSuffix() + "は逃げ出した！");
	}
}
