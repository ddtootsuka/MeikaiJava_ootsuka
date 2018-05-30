package kennsyuu1;

import java.util.Scanner;

/*
 * 読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。表示は*と+を交互に行うこと。
 */

public class E4_7_while {

	// 処理を行うメインメソッド
	public static void main(String[] args) {
		// キーボードに入力した値を表示させる
		Scanner stdIn = new Scanner(System.in);

		// 画面に"何個表示しますか:"と表示させる
		System.out.print("何個表示しますか:");
		// ｎに打ち込んだ値を代入します
		int n = stdIn.nextInt();

		// 変数iに0を代入する
		int i = 0;
		// iが0より大きい場合、繰り返す
		while (i < n) {
			// 画面に'*'を表示
			// iをインクリメントする
			i++;
			// 画面に"*"を表示する
			System.out.print("*");
			// iをインクリメントする
			i++;
			// 画面に"*"を表示する
			System.out.print("+");
		}
	}
}
