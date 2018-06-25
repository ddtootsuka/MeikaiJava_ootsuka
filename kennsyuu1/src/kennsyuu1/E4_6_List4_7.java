package kennsyuu1;

import java.util.Scanner;

/*
 * 読み込んだ値が1未満であれば改行文字を出力しないように
 * List4-7およびList4-8を書きかえたプログラムをそれぞれ作成せよ。
 */

public class E4_6_List4_7 {

	// まずList4-7の修正をいたします

	// 処理を行うメインメソッド
	public static void main(String[] args) {
		// キーボードに打ち込んだ文字を入力する
		Scanner stdIn = new Scanner(System.in);

		// 画面に"何個*を表示しますか？："と表示させる
		System.out.print("何個*を表示しますか？：");
		// ｎに打ち込んだ値を代入する
		int n = stdIn.nextInt();

		// 変数iに０を代入する
		int i = 0;
		// ｎが０より大きければ繰り返す
		while (i < n) {
			// 画面に'*'を表示させる
			System.out.println('*');
			// iの値をインクリメントする
			i++;

			// （わかりやすくするために改行テストの文字を入力する）改行を表示する
			System.out.println("改行テスト\n改行テスト");
		}
		// iが0より小さい場合、
		if (i > 0) {
			// 改行文字を出力しない
			System.out.println("改行");
		}
	}
}