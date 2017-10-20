package kennsyuu1;

/*
 * 以下に示すプログラムを作成せよ。
 * ・一桁の正の整数値（すなわち1以上9以下の値）をランダムに生成して表示。
 * ・一桁の負の整数値（すなわち-9以上-1以下の値）をランダムに生成して表示。
 * ・二桁の正の整数値（すなわち10以上99以下の値）をランダムに生成して表示。
 *
 *
 * */


import java.util.Random;
//３つの条件を示すプログラムを作成するクラス


public class E2_7_Ransuu {
	// 整数値をランダムに生成して表示させる
		public static void main(String[] args) {

	    // 乱数の生成を行う
		Random rand = new Random();

		// 1桁の1以上9以下の値をランダムに表示させる
		int randomNum = rand.nextInt(9)+1;

		// 1桁の-9以上-1以下の値をランダムに表示させる
		int randomNum2 = rand.nextInt(9)-9;

		// 2桁の10以上99以下の値をランダムに表示させる
		int randomNum3 = rand.nextInt(90)+10;


		// ランダムに生成される数字を表示させる
		System.out.println(randomNum);
		// ランダムに生成される数字を表示させる
		System.out.println(randomNum2);
		// ランダムに生成される数字を表示させる
		System.out.println(randomNum3);

	}


}
