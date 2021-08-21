package calcapp.main;

import calcapp.logics.CalcLogic;

public class Calc {
	/*
	 * メイン処理
	 */
	public static void main(String[] args) {

		//　配列処理の練習
		int[]  array = {10,20,30};
		printArray(array);
		printArray(array);
		
		//　クラス分割の練習
		int a = 10;
		int b = 5;
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

	/*
	 * 配列オブジェクトの生成
	 */
	public static void printArray(int[] arrayArgs) {
		for(int idx=0; idx<arrayArgs.length; idx++) {
			System.out.println("配列要素" + (idx+1) + "番目 " + arrayArgs[idx]);
			arrayArgs[idx] = arrayArgs[idx] * 10;
		}
	}
}
