package kennsyuu1;

/*
 * 三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 *目的：平均と合計を求める
 *解き方：３つの値のそれぞれ合計と平均を求めていく
 */

public class E2_2_variable {
	//メインメソッドを宣言します
	public static void main(String[] args) {
		
		//int型の変数、variable1を宣言する
		int variable1;
		//int型の変数、variable2を宣言する
		int variable2;
		//int型の変数、variable3を宣言する
		int variable3;
		
		//3つの整数値の合計と平均を求めるためにvariable1に5を代入する
		variable1 = 5;
		//3つの整数値の合計と平均を求めるためにvariable2に3を代入する
		variable2 = 3;
		//3つの整数値の合計と平均を求めるためにvariable3に2を代入する
		variable3 = 2;
		
		//variable1の値を画面に表示させる
		System.out.println("variable1の値は " + variable1 + "です。");
		//variable2の値を画面に表示させる
		System.out.println("variable2の値は " + variable2 + "です。");	
		//variable3の値を画面に表示させる
		System.out.println("variable3の値は " + variable3 + "です。");
		//3つの整数値の合計を画面に表示させる
		System.out.println("合計は " + (variable1 + variable2 + variable3) + "です。");
		//3つの整数値の平均を画面に表示させる
		System.out.println("平均は" + (variable1 + variable2 + variable3) / 3 + "です。");
		
	}
	
}
