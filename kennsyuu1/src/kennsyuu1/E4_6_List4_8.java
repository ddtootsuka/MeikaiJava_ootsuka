package kennsyuu1;

import java.util.Scanner;

/*
 * 読み込んだ値が1未満であれば改行文字を出力しないように
 * List4-7およびList4-8を書きかえたプログラムをそれぞれ作成せよ。
 */

public class E4_6_List4_8 {// 処理を行うメインメソッド
	public static void main(String[] args) {
		// キーボードに打ち込んだ文字を入力する
		Scanner stdIn = new Scanner(System.in);

		// 画面に"何個*を表示しますか？："と表示させる
		System.out.print("何個*を表示しますか？：");
		// ｎに値を代入する
		int n = stdIn.nextInt();

		// 変数iに1を代入する
		int i = 1;
		// ｎが1より大きければ、または同じ数であれば繰り返す
		while (i <= n) {
			// 画面に'*'を表示させる
			System.out.println('*');
			// iの値をインクリメントする
			i++;
		}
		// iが0より小さい場合、
		if (1 > 0) {
			//改行文字を出力しない
			System.out.println();
	}
}
}
