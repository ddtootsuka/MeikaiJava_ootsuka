package kennsyuu1;

import java.util.Scanner;

/*
 * List4-4のwhile文終了時にXの値が-1になることを確認するプログラムを作成せよ。
 * 
 */

public class E4_4_while {

	public static void main(String[] args) {
		// キーボードに打ち込んだ文字を入力する
		Scanner stdIn = new Scanner(System.in);

		// 画面に"カウントダウンします"と表示させます
		System.out.println("カウントダウンします");

		// 打ち込む数字をxとします
		int x;
		// do文を実行する
		do {
			// 画面に"正の整数値"と表示させる
			System.out.print("正の整数値:");

			// 打ち込む数字に値を代入する
			x = stdIn.nextInt();
			// 打ち込む数字が0以下であれば繰り返す
		} while (x <= 0);

		// 打ち込んだ値を0までカウントダウンさせます
		while (x >= 0) {
			// 打ち込んだ数を画面に表示させます
			System.out.println(x);
			// 打ち込んだ値をデクリメント(-1)する
			x--;
		}
		// 画面に"xの値は-1である"と表示させる
		System.out.println("xの値は-1である");
	}
}

// （西脇さんへ）do文とwhile文の違いにつきまして・・・
// doは実行せよ、whileは～のあいだという意味で、両方条件が成立する間処理を繰り返す文だと思います（式を評価した値がｔｒｕｅである限りエンドレスループ）
// do文はWhileとセットで動きますが、ｗｈｉｌｅ文はｗｈｉｌｅ単品で繰り返し実行する文となっているかと思います。違いは左記だと思うのですが如何でしょうか？？
