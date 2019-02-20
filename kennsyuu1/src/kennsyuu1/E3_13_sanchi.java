package kennsyuu1;

import java.util.Scanner;

/*
 * キーボードから読み込んだ三つの整数値の中央値求めて表示するプログラムを作成せよ。
 * ※たとえば2.3.1の中央値は2で、1.2.1の中央値は1で、3.3.3の中央値は3である。
 * 目的：三つの値の真ん中の値を求める
 * 解き方：整数1から3までを比較し、どの値が入っても中央値が求められるようにする
 */

public class E3_13_sanchi {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"integer1:"を表示させ、integer1にキーボードから打ち込んだ値を代入
		System.out.print("integer1:");
		int integer1 = stdIn.nextInt();
		// 画面に"integer2:"を表示させ、integer2にキーボードから打ち込んだ値を代入
		System.out.print("integer2:");
		int integer2 = stdIn.nextInt();
		// 画面に"integer3:"を表示させ、integer3にキーボードから打ち込んだ値を代入
		System.out.print("integer3:");
		int integer3 = stdIn.nextInt();

		// centerにinteger1を代入
		int center = integer1;
		// integer2とcenterを比較して、integer2の方が小さければcenterにその値を入れる
		if (integer2 < center) {
			center = integer2;
		}
		// そうでなければ、integer2とcenterを比較し、integer2の方が大きければcenterにその値を入れる
		else if (integer2 > center) {
			center = integer2;
		}
		// そうでなければ、integer3とcenterを比較し、integer3の方が大きければcenterにその値を入れる
		else if (integer3 > center) {
			center = integer3;
		}

		// 画面に"中央値は（center）に入る値です。"と表示させる
		System.out.println("中央値は" + center + "です。");
	}
}