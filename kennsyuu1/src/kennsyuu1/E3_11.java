package kennsyuu1;

import java.util.Scanner;

/*
 * 右に示すように、二つの整数値を読み込んで、それらの値の差が10以下であれば、
 * 『それらの差は10以下です。』と表示し、そうでなければ『それらの値は11以上です。』と表示するプログラムを作成せよ。
 */


public class E3_11 {

	public static void main(String[]args){
		// キーボードに打ち込んだ文字を入力する
		Scanner stdIn = new Scanner(System.in);

		//画面に"整数値A:"と表示させる
		System.out.print("整数値A:");
		//整数値Aにデータを入力させる
		int IntegerA = stdIn.nextInt();

		//画面に"整数値B:"と表示させる
		System.out.print("整数値B:");
		//整数値Aにデータを入力させる
		int IntegerB = stdIn.nextInt();

		//整数値Aから整数値Bを、また整数値Bから整数値Aを減算し、整数値Aより大きい値をvalue（値）に入力する
		int value = (IntegerA > IntegerB ? IntegerA - IntegerB :IntegerB - IntegerA);

		//整数値Aが10以下の場合、"それらの差は10以下です。"と表示させる。
		if(IntegerA < 10) {
		System.out.println("それらの差は10以下です。");
		}
		//差が10以上の場合、"それらの差は11以上です。"と表示させる。
		else
		System.out.println("それらの差は11以上です。");


	}
}
