package kennsyuu1;
/*
 *三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ
 */

// 三つのint型変数に値を代入し、合計と平均を求めるクラス
public class E2_2_Hensuu {

	// 三つのint型変数に値を代入し、合計と平均を求めます
	public static void main(String[] args) {
		// 計算対象となる1つ目の変数を宣言する
		int firsValue;
		// 計算対象となる2つ目の変数を宣言する
		int secondValue;
		// 計算対象となる
		// 3つ目の変数を宣言する

		int thirdValue;



		// 計算対象となる1つ目の数値を設定する
		firsValue = 10;
		// 計算対象となる2つ目の数値を設定する
		secondValue = 20;
		// 計算対象となる3つ目の数値を設定する
		thirdValue = 30;

		// 合計を表示させる
		System.out.println("合計は" + (firsValue + secondValue + thirdValue) +  "です。");
		// 平均を表示させる
		System.out.println("平均は" + (firsValue + secondValue + thirdValue) / 3 +  "です。");
		;
	}
}


