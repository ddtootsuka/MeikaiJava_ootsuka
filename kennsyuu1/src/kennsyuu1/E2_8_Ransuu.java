package kennsyuu1;

/*
 * キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成して表示するプログラムを作成せよ。
 * */

import java.util.Random;
import java.util.Scanner;

public class 新規 {

	// キーボードから読み込んだ整数値を±5の範囲の整数値をランダムに生成する
	public static void main(String[] args) {
	    //　整数を表示させる

		// キーボードと結びつく入力ストリームを入力します
		Scanner stdIn = new Scanner(System.in);
		// 乱数の生成を行う
		Random rand = new Random();

		//整数値を表示させる文字を表示
		System.out.println("整数値：");
		// 整数の値を入力させる
		int x = rand.nextInt();

		// ±5の乱数値を入力させる
		int k = rand.nextInt(11)-5;

		//二つの数値を足して表示させる
		System.out.println("x + y ");





	}





}


