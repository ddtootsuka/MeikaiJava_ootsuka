package kennsyuu1;

import java.util.Scanner;

/*
 * 二つの実数値を読み込んで、大きいほうの値を表示するプログラムを表示せよ
 */

public class E3_9_if {

	public static void main(String[] args) {
		// キーボードのスキャナーを入力します
		Scanner stdIn = new Scanner(System.in);

		// 一つめの実数値を読み込んで、実数値Aと表示させる
		System.out.print("実数値A：");
		int RealValueA = stdIn.nextInt();

		// 二つめの実数値を読み込んで、実数値Bと表示させる
		System.out.print("実数値B：");
		int RealValueB = stdIn.nextInt();

		// 実数値Aと実数値Bを比較し、大きい方の値を判別する
		int max;
		if (RealValueA > RealValueB) {
			max = RealValueA;
		} else {
			max = RealValueB;
		}
		// 実数値Aと実数値Bを比較し大きい値を表示させ、その値を"大きい方の値は"、"です"の間に表示させる
		System.out.print("大きい方の値は" + max + "です。");

	}
}
