package kennsyuu1;

import java.util.Scanner;

/*
 * 読み込んだ整数値の符号を判定するList3-5のプログラムを、好きなだけ何度でも
 * 繰り返して入力・表示できるようにしらプログラムを作成せよ。
 */

public class E4_1_do {

	public static void main(String[] args) {
		// キーボードに打ち込んだ文字を入力する
		java.util.Scanner stdIn = new Scanner(System.in);

		// もう一度？を宣言します
		int retry;

		// do文を実行せよ
		do {
			// 画面に"整数値の符号を判定します。 \n符号は？："と表示させる
			System.out.print("整数値の符号を判定します。 \n符号は？：");
			// hugouに値を入力します
			int hugou = stdIn.nextInt();

			// 1より大きければ、"それは正の符号です"と表示させる
			if (hugou > 1)
				System.out.println("それは正の符号です");

			// 0より小さければ、"それは負の符号です"と表示させる
			else if (hugou < 0)
				System.out.println("それは負の符号です");

			// 画面に、"もう一度? 1･･はい/2・・いいえ"と表示させる
			System.out.print("もう一度?　1･･はい/2・・いいえ");

			// retryに文字を入力させます
			retry = stdIn.nextInt();
			// 1が入力される間、繰り返し頭から表示させる
		} while (retry == 1);

	}
}
