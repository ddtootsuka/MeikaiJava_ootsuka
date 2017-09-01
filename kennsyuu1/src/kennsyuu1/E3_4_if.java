package kennsyuu1;

import java.util.Scanner;

/*
 * 二つの変数a, bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。
 * 『ａのほうが大きいです。』『bのほうが大きいです。』『aとbは同じ値です。』
 * */

public class E3_4_if {

	// 二つの変数に値を読み込んで、3種類の大小関係を表示さするプリグラムを作成する
	public static void main(String[] args) {
		// キーボードのスキャナーを入力します
		Scanner stdIn = new Scanner(System.in);

		// 変数aに値を入れて、画面に変数aと表示させます
		System.out.print("変数a:"); int a = stdIn.nextInt();
		// 変数bに値を入れて、画面に変数bと表示させます
		System.out.print("変数b:"); int b = stdIn.nextInt();


		if ( a > b )
		// aの方が大きい場合、"aのほうが大きいです。"と表示させます
		System.out.println("aのほうが大きいです。");
		// bの方が大きい場合、"bのほうが大きいです。"と表示させます
		else if ( a < b )
		System.out.println("bのほうが大きいです。");
		// 値が同じ場合は、"aとbは同じ値です"と表示させます
		else
		System.out.println("aとbは同じ値です");


	}
}
