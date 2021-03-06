package kennsyuu1;

import java.util.Random;
import java.util.Scanner;

/*
 * キーボードから読み込んだ整数値プラスマイナス５の範囲の整数値をランダムに生成して表示するプログラムを作成せよ。
 * 目的：読み込んだ値のプラスマイナス５の範囲の整数値をランダムに生成し、表示させる
 * 解き方：整数値プラスマイナス5の範囲を表す乱数をまず作成する
 */

public class E2_8_ransu {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random randomnum2 = new Random();

		// 5～-5の範囲をランダムに表示させる
		int random = randomnum2.nextInt(11) - 5;

		// "整数値："と画面に表示させる
		System.out.print("整数値：");

		// randomnum にキーボードから読み込んだ整数値を読み込ませる
		int randomnum = stdIn.nextInt();

		// 画面に"その値の±５の乱数を生成しました。それは"randomとrandomnumを足した数を表示"と表示させる。
		System.out.println("その値の±５の乱数を生成しました。それは" + (randomnum + random) + "です");

	}

}
