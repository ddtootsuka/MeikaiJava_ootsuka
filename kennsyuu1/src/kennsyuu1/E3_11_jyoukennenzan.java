package kennsyuu1;

import java.util.Scanner;

/*
 * 右に示すように、二つの整数値を読み込んで、それらの値の差が10以下であれば「それらの差は10以下です。」と表示し、
 * そうでなければ「それらの差は11以上です。」と表示するプログラムを作成せよ。
 *　目的：二つの整数値の差を比較し、その差によって別の文言が表示するようにする
 *　解き方： ひとつ目とふたつ目の差を出して、その値が10以下であれば相応の文言が表示されるようにし、
 *　11以上であれば相応の文言が表示されるようにする
 * 
 */

public class E3_11_jyoukennenzan {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"Integer1:"と表示させる。Integer1にキーボードから読み込んだ値を代入する。
		System.out.print("Integer1:");
		int Integer1 = stdIn.nextInt();

		// 画面に"Integer2:"と表示させる。Integer2にキーボードから読み込んだ値を代入する。
		System.out.print("Integer2:");
		int Integer2 = stdIn.nextInt();

		// Integer1がInteger2より小さい場合はInteger2-Integer1を実行した値がdifferenceに入り、Integer2がInteger1より大きければInteger1-Integer2を実行した値がdifferenceに入る。
		int difference = Integer1 < Integer2 ? (Integer2 - Integer1) : (Integer1 - Integer2);

		// もしdiffereceが10より小さい場合は、画面に"それらの差は10以下です。"と表示し、そうでなければ画面に"それらの差は11以上です。"と表示させる。
		if (difference <= 10) {
			System.out.print("それらの差は10以下です。");
		} else {
			System.out.print("それらの差は11以上です。");
		}
	}
}
