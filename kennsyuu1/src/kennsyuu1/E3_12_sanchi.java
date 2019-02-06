package kennsyuu1;

import java.util.Scanner;

/*
 * キーボードから読み込んだ三つに整数値の最小値を求めて表示するプログラムを作成せよ
 * 目的：３つの整数値を比較して一番小さい値を求める
 * 解き方：整数ａから、ｂとcを順に比較していき最小値を求める
 */

public class E3_12_sanchi {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"整数a:"と表示させる。aにキーボードから読み込んだ値を代入する。
		System.out.print("整数a:");
		int a = stdIn.nextInt();

		// 画面に"整数b:"と表示させる。bにキーボードから読み込んだ値を代入する。
		System.out.print("整数b:");
		int b = stdIn.nextInt();

		// 画面に"整数c:"と表示させる。cにキーボードから読み込んだ値を代入する。
		System.out.print("整数c:");
		int c = stdIn.nextInt();

		//minimumにまず整数ａを代入し、整数ｂと比較させ整数ｂの方が小さければminimumに整数bの値を代入する。そうでなければ、整数cとminimumを比較し整数ｃの方が小さければ整数cの値を代入する。
		int minimum = a;
		if (b < minimum) {minimum = b;}
		if (c < minimum) {minimum = c;}

		//画面に"最小値は(minimumに入る値)です"と表示させる。
		System.out.print("最小値は" + minimum + "です");

	}
}