package kennsyuu1;

import java.util.Scanner;

/*
 * 二つの変数a,bに値を読み込んで、
 * その大小関係を以下のいずれかで表示するプログラムを作成せよ。
 * 目的：変数a,bを比較し、大小関係を求める
 * 解き方：変数a,bを比較し、さらにどちらでもない場合の結果も表示させるよう分岐させる
 *  * 
 */

public class E3_4_if4 {
	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"変数a：" と表示させる
		System.out.print("変数a：");
		// キーボードから読み込ませた値をVariableAに宣言する
		int VariableA = stdIn.nextInt();

		// 画面に"変数b：" と表示させる
		System.out.print("変数b：");
		// キーボードから読み込ませた値をVariableBに宣言する
		int VariableB = stdIn.nextInt();

		// VariableAとVariableBを比較して、大きい場合は画面に"aのほうが大きいです。"と表示させる
		if (VariableA > VariableB) {
			System.out.println("aのほうが大きいです。");
		}

		// VariableAよりVariableBが大きければ、画面に"bのほうが大きいです。"と表示させる
		else if (VariableA < VariableB) {
			System.out.println("bのほうが大きいです。");
		}

		// どちらでもない場合、画面に"aとbは同じ値です。"と表示させる
		else {
			System.out.println("aとbは同じ値です。");
		}
	}
}
