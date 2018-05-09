package kennsyuu1;

import java.util.Scanner;

/*
 * List4_5のx--が--xとなっていたら、どのような出力が得られるかを検討せよ。
 * プログラムを作成して実行結果を確認すること。
 */

public class E4_5_while {

	// キーボードに打ち込んだ文字を入力する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"カウントダウンをします"と表示させます。
		System.out.println("カウントダウンをします");

		// 打ち込む数字をXとします
		int x;

		// do文を実行します
		do {
			// 画面に"正の整数値"と表示させます
			System.out.print("正の整数値");

			// 打ち込む数字をXに代入します
			x = stdIn.nextInt();

			// Xが０以下であれば繰り返す
		} while (x <= 0);

		// Xが０以上であればカウントダウンを行う
		while (x >= 0)
			// Xの値を表示してデクリメントを行う
			System.out.println(x--);
		// x--の場合、デクリメント前の値を生成するため入力した数が表示後にｰ1となる
		// --xの場合、デクリメント後の値を生成するため、入力した数から-1された値となる。
		//よって違いはデクリメントされるタイミングが異なる
	}
}
