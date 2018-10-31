package kennsyuu1;

import java.util.Scanner;

/*
 * 右に示すように、整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ。
 * 目的：整数値を読み込んで、その絶対値を表示させる
 * 解き方：キーボードから読み込んだ値が絶対値になっているか、ifを使って判別する
 */

public class E3_1_ifinteger {
	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"整数値：" と表示させる
		System.out.println("整数値：");
		// キーボードから読み込ませた値をmustnumに宣言する
		int mustnum = stdIn.nextInt();

		// もし、０よりmustnumが小さければ、画面に"その絶対値は"+ mustnum + "です。"と正の値を表示させる
		if (mustnum < 0)
			System.out.println("その絶対値は" + -mustnum + "です。");

	}
}
