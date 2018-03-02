package kennsyuu1;

import java.util.Scanner;

/*
 * キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ。
 * ※たとえば2,3,1の中央値は2で、1,2,1の中央値は1で、3,3,3の中央値は3である。
 */

public class E_3_13_sanntinosaidaiti {

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

		// 画面に"整数値C:"と表示させる
		System.out.print("整数値C:");
		// 整数値Cにデータを入力する
		int IntegerC = stdIn.nextInt();

		// 中央値には整数値Aを入れます
		int median = IntegerA;

		// 整数値Bと中央値を比較し、整数値Bの方が大きければそのまま値を代入する
		if (IntegerB > median)
			median = IntegerB;
		{

			// 整数値Cと中央値を比較し、整数値Cの方が大きければそのまま値を代入する
		}
		if (IntegerC < median) {
			median = IntegerC;
		}
		// 画面に"中央値は〇です。"と表示させる
		System.out.println("中央値は" + median + "です。");
	}
}
