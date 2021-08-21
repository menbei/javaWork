package rpggame.occupation;

import rpggame.equipment.Sword;

public class Hero {
	// フィールド宣言
	private String name;
	private int hp;
	private Sword sword;

	// Getter、Setterを定義
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Sword getSword() {
		return this.sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
		System.out.println(this.name + "は" + this.sword.getName() + "を装備した！");

	}

	//　コンストラクタ
	public Hero() {
		this.hp = 100;
		this.name = "テスト";
		System.out.println("勇者" + this.name + "を生み出した！");
	}

	public Hero(String name) {
		this.hp = 100;
		this.name = name;
		System.out.println("勇者" + this.name + "を生み出した！");
	}

	// Heroクラスのメソッドを定義
	// 寝てHP回復
	public void sleep() {
		this.setHp(100);
		System.out.println(this.name + "は、眠って回復した！");
	}

	// 座った時間だけHP回復
	public void sit(int sec) {
		this.setHp(this.hp + sec);
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}

	// 転んでダメージ
	public void slip() {
		this.setHp(this.hp - 5);
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}

	// 勇者の攻撃
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println(this.sword.getDamage()+ "ポイントのダメージをにあたえた！");
	}

	// ゲームオーバー
	public void run() {
		System.out.println(this.name + "は、" + "逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは、" + this.hp + "でした");
	}
}
