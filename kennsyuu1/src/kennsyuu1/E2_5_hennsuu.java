package kennsyuu1;
/*
 * 二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 * */

import java.util.Scanner;
// 実数値を読み込み、和とへ平均を求めるクラス
public class E2_5_hennsuu {

		// xとyの実数値を読み込み、和と平均を求めて表示させよう
		public static void main(String[] args) {
		// キーボードのスキャナーを入力します
		Scanner putinKey = new Scanner(System.in);
		// xの値:と表示させる文字を出力する
		System.out.println("xの値:");
		// xに実数値をインプットさせる
		double x = putinKey.nextDouble();
		// yの値を:と表示させる文字を出力する
		System.out.println("yの値:");
		// yに実数値をインプットさせる
		double y = putinKey.nextDouble();

		// 合計を求める計算式を出力する
		System.out.println("x + y =" + (x + y) );

		// 平均を求める計算式を出力する
		System.out.println("x + y =" + (x + y) /2 );

		}
}
