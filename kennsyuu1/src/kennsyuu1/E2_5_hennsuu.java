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
		// number1の値:と表示させる文字を出力する
		System.out.println("number1の値:");
		// number1に実数値をインプットさせる
		double number1 = putinKey.nextDouble();
		// yの値を:と表示させる文字を出力する
		System.out.println("number2の値:");
		// number2に実数値をインプットさせる
		double number2 = putinKey.nextDouble();

		// 合計を求める計算式を出力する
		System.out.println("number1 + number2 =" + (number1 + number2) );

		// 平均を求める計算式を出力する
		System.out.println("number1 + number2 =" + (number1 + number2) /2 );

		}
}
