package kennsyuu1;

import java.util.Scanner;

/*
 * 二つの実数値を読み込んで、大きいほうの値を表示するプログラムを作成せよ。
 * 目的：打ち込んだ整数のどちらが大きいかを判別し、大きいほうを表示させる
 * 解き方：二つの整数を比較させ、大きいほうを表示させる
 */

public class E3_9_if9 {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"整数A:"と表示させる
		System.out.print("整数A:");
		// 整数1という変数を代入する
		int variable1 = stdIn.nextInt();

		// 画面に"整数B："と表示させる
		System.out.print("整数B：");
		// 整数2という変数を代入する
		int variable2 = stdIn.nextInt();

		// 大きい方の値
		int big;

		// 整数2より整数1のほうが大きければ、変数bigに整数1を代入する
		if (variable1 > variable2) {
			big = variable1;
		}
		// そうでなければ、整数2を変数bigに代入する
		else {
			big = variable2;
		}
		// 大きいほうの数字を文言内に表示させ、画面に"大きいほうの値は（変数の値）です。"と変数の値が入るようにする
		System.out.println("大きいほうの値は" + big + "です。");
	}

}
