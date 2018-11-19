package kennsyuu1;

import java.util.Scanner;

/*
 * List3-5の最後のelseを、else if(n==0)に変更したらどうなるか検討せよ
 * 目的：elseをelse ifにしたらどのような結果になるか検討する
 * 解き方：else ifと入力してまず結果を見る(結果は最下部に記載いたします）
 */

public class E3_3_if3 {
	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"整数値：" と表示させる
		System.out.println("整数値：");
		// キーボードから読み込ませた値をmustnumに宣言する
		int mustnum = stdIn.nextInt();

		// musutnumより０が大きければ、その値は正です。と画面に表示させる
		if (mustnum > 0) {
			System.out.println("その値は正です。");
		}
		// その値は負です。と画面に表示させる
		else if (mustnum < 0) {
			System.out.println("その値は負です。");
		}

		else if(mustnum == 0) {
			System.out.println("その値は0です。");
		}
	}
}



	/*
	 * 結果・・elseの場合も、else if(mustnum == 0) も結果は同じになりました。
	 * elseでは、どの条件にも当てはまらなず偽となる場合、最終的に"その値は0です。"
	 * となりますが、else if(mustnum == 0)は
	 */
	
	