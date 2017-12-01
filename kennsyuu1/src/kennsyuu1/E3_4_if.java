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
		System.out.print("変数a:");

		// 変数Aに文字を読み込みます
		int variableA = stdIn.nextInt();
		// 変数bに値を入れて、画面に変数bと表示させます
		System.out.print("変数b:");

		// 変数Bに文字を読み込ませます
		int variableB = stdIn.nextInt();

		// 変数A>変数Bはtrueであるか判別させます
		if (variableA > variableB)

			// Aの方が大きい場合、"Aのほうが大きいです。"と表示させます
			System.out.println("Aのほうが大きいです。");

		// 変数A>変数Bはfalseであるか判別させます
		else if (variableA < variableB)
			// Bの方が大きい場合、"Bのほうが大きいです。"と表示させます
			System.out.println("Bのほうが大きいです。");

		// そうでもない場合
		else
			// 値が同じ場合は、"AとBは同じ値です"と表示させます
			System.out.println("AとBは同じ値です");

	}
}
