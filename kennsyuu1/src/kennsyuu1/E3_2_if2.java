package kennsyuu1;

import java.util.Scanner;

/*
 *二つの正の整数値を読み込んで、後者が前者の約数であれば「BはAの約数です。」と表示し、
 *そうでなければ「BはAの約数ではありません。」と表示するプログラムを作成せよ。
 *目的：AとBを比較して約数であるか、そうでないかを判別させる
 *解き方：AとBを比較し、約数であれば適する文言を表示させ、約数でなければそれに適する文言を表示させる。
*/

public class E3_2_if2 {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"整数A：" と表示させる
		System.out.println("整数A：");
		// キーボードから読み込ませた値をvariableA（整数A）に宣言する
		int variableA = stdIn.nextInt();

		// 画面に"整数B：" と表示させる
		System.out.println("整数B：");
		// キーボードから読み込ませた値をvariableB（整数B）に宣言する
		int variableB = stdIn.nextInt();

		// variableAをvariableBで割り、その余剰が0であれば"BはAの約数です"と画面に表示させる
		if (variableA % variableB == 0) {
			System.out.println("BはAの約数です");
			// そうでなければ、"BはAの約数ではありません"と画面に表示させる
		} else {
			System.out.println("BはAの約数ではありません");
		}
	}
}
