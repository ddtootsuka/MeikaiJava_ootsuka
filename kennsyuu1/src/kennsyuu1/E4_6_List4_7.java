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
		// アスタリスクを表示させる個数に値を代入する
		int number = stdIn.nextInt();

		// 個数と比較させる値に1を代入する
		int variable = 1;
		// 読み込んだ値が1未満であれば改行文字を出力しないように、比較させる値が1より大きければ繰り返す
		while (variable < number) {
			// 画面に'*'を表示させる
			System.out.println('*');
			// 比較させる値をインクリメントする
			variable++;

			// （わかりやすくするために改行テストの文字を入力する）改行を表示する
			System.out.println("改行テスト\n改行テスト");
		}
		// 読み込んだ値が1未満であれば改行文字を出力しないように、もし比較させる値が1以上であれば改行をおこなう
		if (variable > 1) {
			// 改行文字を出力しない
			System.out.println("改行");
			if (number <= 1) {
				System.out.println("改行しない");
			}
		}
	}
}