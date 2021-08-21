package rpggame.occupation;

public class Wizard {
	// フィールド宣言
	private String name;
	private int hp;

	//　コンストラクタ
	public Wizard() {
		this("テスト");
		System.out.println("魔法使い" + this.name + "を生み出した！");
	}
	
	public Wizard(String name) {
		this.hp = 100;
		this.name = name;
		System.out.println("魔法使い" + this.name + "を生み出した！");
	}

	// メソッドの定義
	// 自分のHPを回復
	public void heal() {
		this.hp += 10;
		System.out.println(this.name + "のHPを10回復した！");
	}
	// 勇者のHPを回復
	public void heal(Hero hero) {
		hero.setHp(hero.getHp() + 10);
		System.out.println(hero.getName() + "のHPを10回復した！");
	}
}
