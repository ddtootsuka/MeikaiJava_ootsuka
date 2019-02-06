package kennsyuu1;

import java.util.Scanner;

/*
 * 二つの整数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。
 * 目的：二つの値を比較してその値の差を表示させる。
 * 解き方：二つの整数値を比較して、比較した値がtrueである場合とfalseの場合のそれぞれの出る差を求める
 */
public class E3_10_if10 {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"整数a:"と表示させる。aにキーボードから読み込んだ値を代入する。
		System.out.print("整数a:");
		int a = stdIn.nextInt();

		// 画面に"整数b:"と表示させる。bにキーボードから読み込んだ値を代入する。
		System.out.print("整数b:");
		int b = stdIn.nextInt();

		// それらの値を求めるために、ａとｂを比較させ、ａの方が小さければb-aを行い、bの方が小さければａ-bを行う
		int difference = a < b ? (b - a) : (a - b);

		// 画面に"それらの差は"differenceに入る値"です"と表示させる。
		System.out.print("それらの差は" + difference + "です");

	}
}
