/**
 * 
 */
package kennsyuu1;

import java.util.Random;
/**
 *　以下に示すプログラムを作成せよ（実数地の乱数の生成にはnextDouble()を使うこと）
 *・0.0以上1.0未満の実数地をランダムに生成して表示
 *・0.0以上10.0未満の実数地をランダムに生成して表示
 *・-1.0以上1.0未満の実数地をランダムに生成して表示
 * 目的：各課題の指定の実数地の値をランダムに表示させる
 * 解き方：ランダムに生成する値の範囲に注意しながらランダム変数を使う
 */

public class E2_9_randomnumber {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int Randomnum1 = rand.nextDouble(0.0)-1.0;
}
}