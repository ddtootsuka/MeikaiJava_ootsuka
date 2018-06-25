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
		// kosuu(個数)に値を代入する
		int kosuu = stdIn.nextInt();

		// 変数(variable)に1を代入する
		int variable = 1;
		// kosuu(個数)が1より大きければ、または同じ数であれば繰り返す
		while (variable <= kosuu) {
			// 画面に'*'を表示させる
			System.out.println('*');
			// 変数(variable)の値をインクリメントする
			variable++;
		}
		// 変数(variable)が0より小さい場合、
		if (variable > 0) {
			// 改行文字を出力しない
			System.out.println();
		}
	}
}
