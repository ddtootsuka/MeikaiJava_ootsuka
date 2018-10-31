/**
 * 
 */
package kennsyuu1;

import java.util.Random;

/**
 * 以下に示すプログラムを作成せよ（実数値の乱数の生成にはnextDouble()を使うこと）
 * ・0.0以上1.0未満の実数値をランダムに生成して表示
 * ・1.0以上1.0未満の実数値をランダムに生成して表示 
 * ・0.0以上10.0未満の実数値をランダムに生成して表示
 * ・-1.0以上1.0未満の実数値をランダムに生成して表示 
 * 目的：各課題の指定の実数値の値をランダムに表示させる
 * 解き方：ランダムに生成する値の範囲に注意しながらランダム変数を使う
 */

public class E2_9_randomnumber {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Random rand = new Random();

		// 0.0以上1.0未満の乱数を生成する
		double RandomNum1 = rand.nextDouble();

		// 画面に"0.0以上1.0未満の実数値は"+ RandomNum1 + "です。"を表示させる
		System.out.println("0.0以上1.0未満の実数値は" + RandomNum1 + "です。");

		// 0.0以上10.0未満の乱数を生成する
		double RandomNum2 = rand.nextDouble() *10 ;

		// 画面に"0.0以上10.0未満の実数値は"+ RandomNum2 + "です。"を表示させる
		System.out.println("0.0以上10.0未満の実数値は" + RandomNum2 + "です。");

		// -1.0以上1.0未満の乱数を生成する
		double RandomNum3 = rand.nextDouble()*-1;
		
		// 画面に"-1.0以上1.0未満の実数値は"+ RandomNum3 + "です。"を表示させる
		System.out.println("-1.0以上1.0未満の実数値は" + RandomNum3 + "です。");

	}
}