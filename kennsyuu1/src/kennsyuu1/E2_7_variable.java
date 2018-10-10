package kennsyuu1;
 
/*
 * 以下に示すプログラムを作成せよ。
 * ・１桁の正の整数値（すなわち１以上９以下の値）をランダムに生成して表示
 * ・１桁の不の整数値（すなわち－９以上－１以下の値）をランダムに生成して表示
 *　・２桁の正の整数値（すなわち１０以上９９以下の値）をランダムに生成して表示
 *目的：３種類の整数をランダムに生成する
 *解き方：各整数値をランダムで表示させるため、正確な変数を指定して乱数を表示させる
 */

import java.util.Random;

public class E2_7_variable {
	
//メインメソッドを宣言する
	public static void main(String[] args) {
		Random variable = new Random();
		
		//Randomnumber1に１以上９以下の値がランダムに入るようにする
		int Randomnumber1 = variable.nextInt(9)+1;
		
		//Randomnumber2に-９以上-１以下の値がランダムに入るようにする
		int Randomnumber2 = variable.nextInt(9)-9;

		//Randomnumber3に１０以上９９以下の値がランダムに入るようにする
		int Randomnumber3 = 10 + variable.nextInt(90);
		
		//画面に"一桁の正の整数値は"+ Randomnumber1 + "です。"を表示させる
		System.out.println("一桁の正の整数値は"+ Randomnumber1 + "です。");
		
		//画面に"一桁の負の整数値は"+ Randomnumber2 + "です。"を表示させる
		System.out.println("一桁の負の整数値は"+ Randomnumber2 + "です。");
		
		//画面に"二桁の正の整数値は"+ Randomnumber3 + "です。"を表示させる
		System.out.println("二桁の正の整数値は"+ Randomnumber3 + "です。");
	}
}

