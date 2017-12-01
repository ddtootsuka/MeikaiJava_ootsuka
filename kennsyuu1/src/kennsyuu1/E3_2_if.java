package kennsyuu1;

import java.util.Scanner;

/*
 * 二つの正の整数値を読み込んで、後者が前者の約数であれば「BはAの約数です」と表示し、
 * そうでなければ、「BはAの約数ではありません。」と表示するプログラムを作成せよ。
 * */

public class E3_2_if {

	public static void main(String[] args) {

		// 整数値を読み込ませるためにキーボードのスキャナーを入力します
		Scanner stdIn = new Scanner(System.in);

		// 整数Aという文字を表示させる
		System.out.print("整数A:");
		// 文字を代入します
		int integerA = stdIn.nextInt();

		// 整数Bという文字を表示させる
		System.out.print("整数B:");
		// 文字を代入します
		int integerB = stdIn.nextInt();

		// A÷Bを実行した際の余剰数を算出する
		int answer = (integerA % integerB);

		// 余剰が0になった場合ｓ、
		if (answer == 0)

			// 約数の場合、"BはAの約数です。"と表示させる
			System.out.println("BはAの約数です。");

		// そうでない場合、
		else
			// BはAの約数ではない場合、"BはAの約数ではありません。"と表示させる

			System.out.println("BはAの約数ではありません。");

	}
}
