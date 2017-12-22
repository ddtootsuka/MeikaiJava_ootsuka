package kennsyuu1;

import java.util.Scanner;

/*
 * 正の整数値を読み込んで。それが10の倍数であれば『その値は10の倍数です。』と表示し、
 * そうでなければ『その値は10の倍数ではありません。』と表示するプログラムを作成せよ。
 * ※正でない値を読み込んだ場合は、『正ではない値が入力されました。』
 * と表示すること
 * */

public class E3_6_if {

	// 正の整数を読み込んで、10の倍数であるかないかをそれぞれ表示させるクラス
	public static void main(String[] args) {
		// キーボードのスキャナーを入力します
		Scanner stdIn = new Scanner(System.in);
		// 画面に整数値:と表示させます
		System.out.print("整数値:");
		// 読み込んだ数値が10の倍数であるかを判別させるために変数Aに値を入力させます
		int IntegerA = stdIn.nextInt();

		// 変数Aが正数であるかをまず判別させる
		if (IntegerA > 0) {
			// 変数Aが10の倍数であるかを判別させる
			if (IntegerA % 10 == 0) {
				// 10の倍数になった際に、"その値は10の倍数です。"と表示させる
				System.out.println("その値は10の倍数です。");
				// 変数が10の倍数ではない場合
			} else {
				// "その値は10の倍数ではありません。"と表示させる
				System.out.println("その値は10の倍数ではありません。");
			}
			// 変数Aが1以下であるかを判別させる}
		} else if (IntegerA < 1) {
			// 1以下の値が入った際に、"正でない値が入力されました。"と表示させる
			System.out.println("正でない値が入力されました。");
		}
	}
}
