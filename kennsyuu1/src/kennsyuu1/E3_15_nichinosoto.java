package kennsyuu1;

import java.util.Scanner;

/*
 * 二つの整数値を読み込んで降順（大きい順）にソートするプログラムを作成せよ。
 */

public class E3_15_nichinosoto {

	public static void main(String[] args) {
		// キーボードに打ち込んだ文字を入力する
		Scanner stdIn = new Scanner(System.in);

		// 画面に"整数値A:"と表示させる
		System.out.print("整数値A:");
		// 整数値Aにデータを入力する
		int IntegerA = stdIn.nextInt();

		// 画面に"整数値B:"と表示させる
		System.out.print("整数値B:");
		// 整数値Bにデータを入力する
		int IntegerB = stdIn.nextInt();

		// 整数Aが整数Bより大きい場合、
		if (IntegerA < IntegerB) {
			// 整数Aの値を整数交換用に保存しておく
			int save = IntegerA;
			// 整数Bを整数Aに代入する。
			IntegerA = IntegerB;
			// 整数交換用を整数Bに代入する。
			IntegerB = save;
		}

		// 画面に"A≧Bとなるようにソートしました。"と表示させる。
		System.out.println("A≧Bとなるようにソートしました。");
		// 画面に"整数値Aは"○"です。"と表示させる。
		System.out.println("整数値Aは" + IntegerA + "です。");
		// 画面に"整数値Bは"○"です。"と表示させる。
		System.out.println("整数値Bは" + IntegerB + "です。");
	}
}
