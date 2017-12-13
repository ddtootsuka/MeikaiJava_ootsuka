package kennsyuu1;

import java.util.Scanner;

/*
 * 正の整数値を読み込んで、それが5で割り切れれば『その値は5で割り切れます。』と表示し、そうでなければ『その値は
 * 5で割り切れません』と表示するプログラムを作成せよ。※正でない値を読み込んだ場合は、『正ではない値が入力されました。』
 * と表示すること
 * */

public class E3_5_if {

	public static void main(String[] args) {
		// キーボードを入力させます
		Scanner stdIn = new Scanner(System.in);
		// 画面に整数値:と表示させます
		System.out.print("整数値:");
		// 変数aに値を入力させます
		int IntegerA = stdIn.nextInt();

		// trueであるか判別させる
		if (IntegerA % 5 == 0)
			// 5で割り切れた際に、"その値は5で割り切れます。"と表示させます
			System.out.println("その値は5で割り切れます。");
		else
			// 5で割り切れなかった際に、"その値は5で割り切れません。"と表示させます
			System.out.println("その値は5で割り切れません。");
		if (IntegerA < 0)
			// 0以下の値が入った際に、"正でない値が入力されました。"と表示させます
			System.out.println("正でない値が入力されました。");
	}
}
