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

		// 画面に"Variable1:"と表示させる。Variable1にキーボードから読み込んだ値を代入する。
		System.out.print("Variable1:");
		int Variable1 = stdIn.nextInt();

		// 画面に"Variable2:"と表示させる。Variable2にキーボードから読み込んだ値を代入する。
		System.out.print("Variable2:");
		int Variable2 = stdIn.nextInt();

		// Variable1がVariable2より小さい場合はVariable2-Variable1を実行した値がdifferenceに入り、Variable2がVariable1より大きければVariable1-Variable2を実行した値がdifferenceに入る。
		int difference = Variable1 < Variable2 ? (Variable2 - Variable1) : (Variable1 - Variable2);

		// もしdiffereceが10より小さい場合は、画面に"それらの差は10以下です。"と表示し、そうでなければ画面に"それらの差は11以上です。"と表示させる。
		if (difference <= 10) {
			System.out.print("それらの差は10以下です。");
		} else {
			System.out.print("それらの差は11以上です。");
		}
	}
}
