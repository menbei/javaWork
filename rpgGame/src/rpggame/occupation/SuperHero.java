package rpggame.occupation;

public class SuperHero extends Hero{
	// フィールド宣言
	boolean flying = false;

	// コンストラクタ
	public SuperHero(){
		super();
	}

	public SuperHero(String name){
		super(name);
	}

	//　メソッド定義
	public void fly() {
		this.flying = true;
		System.out.println(this.getName() + "は飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println(this.getName() + "は着地した！");
	}

	public void run() {
		System.out.println(this.getName() + "は撤退した！");
	}

	public void attack() {
		super.attack();

		if(this.flying) {
			System.out.println("飛行中なので追加攻撃！！");
			super.attack();
		}
	}
}
