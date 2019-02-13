package kennsyuu1;

import java.util.Scanner;

/*
 * キーボードから読み込んだ三つに整数値の最小値を求めて表示するプログラムを作成せよ
 * 目的：３つの整数値を比較して一番小さい値を求める
 * 解き方：Variable1から、2と3を順に比較していき最小値を求める
 */

public class E3_12_sanchi {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"Variale1:"と表示させる。Variable1にキーボードから読み込んだ値を代入する。
		System.out.print("Variable1:");
		int Variable1 = stdIn.nextInt();

		// 画面に"Variable2:"と表示させる。Variable2にキーボードから読み込んだ値を代入する。
		System.out.print("Variable2:");
		int Variable2 = stdIn.nextInt();

		// 画面に"Variable3:"と表示させる。Variable3にキーボードから読み込んだ値を代入する。
		System.out.print("Variable3:");
		int Variable3 = stdIn.nextInt();

		// minimumにまずVariable1を代入し、Variable2と比較させVariable2の方が小さければminimumにVariable2の値を代入する。そうでなければ、Variable3とminimumを比較しVariable3の方が小さければVariable3の値を代入する。
		int minimum = Variable1;
		if (Variable2 < minimum) {
			minimum = Variable2;
		}
		if (Variable3 < minimum) {
			minimum = Variable3;
		}

		// 画面に"最小値は(minimumに入る値)です"と表示させる。
		System.out.print("最小値は" + minimum + "です");

	}
}