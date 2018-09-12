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
		Random rand = new Random();
		
		//Randomnumber1に１以上９以下の値がランダムに入るようにする
		int Randomnumber1 = rand.nextInt(9)+1;
		//Randomnumber2に-９以上-１以下の値がランダムに入るようにする
		int Randomnumber2 = rand.nextInt(-1)-9;		
		
		System.out.println("一桁の正の整数値は"+ Randomnumber1 + "です。");
		
		System.out.println("一桁の負の整数値は"+ Randomnumber2 + "です。");
	}
}

