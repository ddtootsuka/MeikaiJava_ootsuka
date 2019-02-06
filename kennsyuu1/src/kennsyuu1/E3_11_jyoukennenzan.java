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

		// 画面に"整数a:"と表示させる。aにキーボードから読み込んだ値を代入する。
		System.out.print("整数a:");
		int a = stdIn.nextInt();

		// 画面に"整数b:"と表示させる。bにキーボードから読み込んだ値を代入する。
		System.out.print("整数b:");
		int b = stdIn.nextInt();

		// aがｂより小さい場合はb-aを実行した値がdifferenceに入り、bがａより大きければa-bを実行した値がdifferenceに入る。
		int difference = a < b ? (b - a) : (a - b);

		// differeceが11より小さい場合、画面に"それらの差は10以下です。"と表示し、そうでなければ画面に"それらの差は11以上です。"と表示させる。
		if (difference < 11) {
			System.out.print("それらの差は10以下です。");
		} else
			System.out.print("それらの差は11以上です。");
	}

}
