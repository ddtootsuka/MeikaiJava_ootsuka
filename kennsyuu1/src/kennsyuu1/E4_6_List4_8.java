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
		// アスタリスクを表示させる個数に値を代入する
		int kosuu = stdIn.nextInt();

		//　個数と比較する値に1を代入する
		int atai = 1;
		// 個数が1より大きければ、または同じ数であれば繰り返す
		while (atai <= kosuu) {
			// 画面に'*'を表示させる
			System.out.println('*');
			// 個数と比較する値をインクリメントする
			atai++;
		}
		// 個数と比較する値が0より小さい場合、
		if (atai > 0) {
			// 改行文字を出力しない
			System.out.println();
		}
	}
}
