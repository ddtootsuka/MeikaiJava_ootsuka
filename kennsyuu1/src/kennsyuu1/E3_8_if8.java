package kennsyuu1;

import java.util.Scanner;

/*
 *E3_8
 *キーボードから読み込んだ点数に応じて、優/良/可/不可を判定して表示するプログラムを作成せよ。
 *判定は以下のように行うこと。
 *0〜58▶︎不可、60~69▶︎可、70~79▶︎良、80~100▶︎優
 *目的：キーボードから読み込んだ値を判別させ、適応する文字を表示させる
 *解き方：4つの判定が行われるように、読み込んだ値を適応する判定範囲で判別させる
 */

public class E3_8_if8 {
	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 点数という変数を代入する
		int score = stdIn.nextInt();

		// 点数が０以上５９未満未満の場合、画面に不可と表示させる
		if (score >= 0 && score <= 59) {
			System.out.println("不可");
		}
		// そうでなければ、点数が６０以上６９未満の場合、画面に可と表示させる
		else if (score >= 60 && score <= 69) {
			System.out.println("可");
		}
		// そうでなければ、点数が７０以上７９未満の場合、画面に良と表示させる
		else if (score >= 70 && score <= 79) {
			System.out.println("良");
		}
		// そうでなければ、点数が８０以上１００未満の場合、画面に優と表示させる
		else if (score >= 80 && score <= 100) {
			System.out.println("優");
		}
	}
}