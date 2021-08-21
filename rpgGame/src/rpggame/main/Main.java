package rpggame.main;

import rpggame.equipment.Sword;
import rpggame.occupation.Hero;
import rpggame.occupation.SuperHero;
import rpggame.occupation.Wizard;

public class Main {

	public static void main(String[] args) {
		// 勇者の生成
		Hero hero1 = new Hero("ミナト");
		// 装備を生成し、勇者に持たせる
		Sword sword1 = new Sword();
		sword1.setName("炎の剣");
		sword1.setDamage(30);
		hero1.setSword(sword1);

		//　スーパー勇者の生成
		SuperHero sHero1 = new SuperHero("イオリ");
		// 装備を生成し、勇者に持たせる
		Sword sword2 = new Sword();
		sword2.setName("炎の剣");
		sword2.setDamage(50);
		sHero1.setSword(sword2);


		// 魔法使いの生成
		Wizard wizard1 = new Wizard("カナタ");

		// 勇者パーティの行動
	    hero1.attack();
		hero1.sit(25);
		wizard1.heal();
		wizard1.heal(hero1);
		wizard1.heal(hero1);
		hero1.slip();
		hero1.run();

		sHero1.fly();
		sHero1.attack();
		sHero1.run();

//		// おばけキノコの生成、初期値セット
//		Matango matango1 = new Matango();
//		matango1.setHp(50);
//		matango1.setSuffix('A');
//
//		Matango matango2 = new Matango();
//		matango2.setHp(40);
//		matango2.setSuffix('B');
//
//		//おばけキノコのメソッドを呼び出していく
//		matango1.run();
//		matango2.run();
	}

}
