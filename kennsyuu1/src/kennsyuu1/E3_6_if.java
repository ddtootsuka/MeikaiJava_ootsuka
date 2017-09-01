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
		//画面に整数値:と表示させます
		System.out.print("整数値:");
		// 変数aに値を入力させます
		int a =stdIn.nextInt();

		if ( a%10==0 )
			// 10の倍数になった際に、"その値は10の倍数です。"と表示させる
			System.out.println("その値は10の倍数です。");
		else
			// 10の倍数にならなかった際に、"その値は10の倍数ではありません。"と表示させる
			System.out.println("その値は10の倍数ではありません。");
		if ( a < 0 )
			// 0以下の値が入った際に、"正でない値が入力されました。"と表示させます
			System.out.println("正でない値が入力されました。");
	}
}