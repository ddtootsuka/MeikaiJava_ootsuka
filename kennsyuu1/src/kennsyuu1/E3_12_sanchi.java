package kennsyuu1;

import java.util.Scanner;

/*
 * キーボードから読み込んだ三つに整数値の最小値を求めて表示するプログラムを作成せよ
 * 目的：3つの整数値を比較して一番小さい値を求める
 * 解き方：整数1から、2と3を順に比較していき最小値を求める
 */

public class E3_12_sanchi {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"Integer1:"と表示させる。Integer1にキーボードから読み込んだ値を代入する。
		System.out.print("Integer1:");
		int Integer1 = stdIn.nextInt();

		// 画面に"Integer2:"と表示させる。Integer2にキーボードから読み込んだ値を代入する。
		System.out.print("Integer2:");
		int Integer2 = stdIn.nextInt();

		// 画面に"Integer3:"と表示させる。Integer3にキーボードから読み込んだ値を代入する。
		System.out.print("Integer3:");
		int Integer3 = stdIn.nextInt();

		// minimumにまずInteger1を代入し、Integer2と比較させInteger2の方が小さければminimumにInteger2の値を代入する。そうでなければ、Integer3とminimumを比較しInteger3の方が小さければInteger3の値を代入する。
		int minimum = Integer1;
		if (Integer2 < minimum) {
			minimum = Integer2;
		}
		if (Integer3 < minimum) {
			minimum = Integer3;
		}

		// 画面に"最小値は(minimumに入る値)です"と表示させる。
		System.out.print("最小値は" + minimum + "です");

	}
}