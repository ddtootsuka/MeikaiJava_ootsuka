package kennsyuu1;

import java.util.Scanner;

/*
 * キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラムを作成せよ。
 * （※三大地を求めるアルゴリズムを使用する）
 */

public class E3_12 {

	public static void main(String[] args) {
		// キーボードに打ち込んだ文字を入力する
		Scanner stdIn = new Scanner(System.in);

		//画面に"整数値A："と表示させる
		System.out.print("整数値A：");
		//データを入力する
		int IntegerA = stdIn.nextInt();

		//画面に"整数値B："と表示させる
		System.out.print("整数値B：");
		//データを入力する
		int IntegerB = stdIn.nextInt();

		//画面に"整数値C："と表示させる
		System.out.print("整数値C：");
		//データを入力する
		int IntegerC = stdIn.nextInt();
		
		//最小値Aを最小値として入力する
		int min = IntegerA;
		
		//最小値Bと最小値を比較し、最小値より値が小さければ最小値に値を入れる
		if(IntegerB < min) min = IntegerB;
		//最小値Cと最小値を比較し、最小値より値が小さければ最小値に値を入れる
		if(IntegerC < min) min = IntegerC;

		System.out.println("最小値は" + min + "です");

	}
}
