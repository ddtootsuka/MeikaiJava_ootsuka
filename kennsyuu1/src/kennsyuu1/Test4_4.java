package kennsyuu1;

import java.util.Scanner;

/*
 * List4-4のwhile文終了時にXの値が-1になることを確認するプログラムを作成せよ。
 *※do文とwhile文を二回使う 
 */

public class Test4_4 {

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
		do {
			// 打ち込んだ数を画面に表示させます
			System.out.println(x);
			// 打ち込んだ値をデクリメント(-1)する
			x--;
		} while (x >= 0);
		// 画面に"xの値は-1である"と表示させる
		System.out.println("xの値は-1である");
	}
}
