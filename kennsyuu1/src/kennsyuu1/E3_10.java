package kennsyuu1;

import java.util.Scanner;

/*
 *2つの実数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。
 */

public class E3_10 {

	public static void main(String[]args){
		// キーボードのスキャナーを入力します
		Scanner stdIn = new Scanner(System.in);


		//"実数値A"と画面に表示させる
		System.out.print("実数値A:");
		//データを入力する
		int RealValueA = stdIn.nextInt();

		//"実数値B"と画面に表示させる
		System.out.print("実数値B:");
		//データを入力する
		int RealValueB = stdIn.nextInt();

		//実数値Aから実数値Bを減算し、また実数値Bから実数値Aを減算した二つの値を比較し、実数値Aの方が大きければその値をそのまま代入する
		int difference = (RealValueA > RealValueB ? RealValueA -RealValueB : RealValueB - RealValueA );

		//実数値Aと実数値Bを差を判別させ、その値を"2つの実数値の差は"、"です"の間に表示させる
		System.out.print("二つの実数値の差は" +  difference + "です。");

	}
}