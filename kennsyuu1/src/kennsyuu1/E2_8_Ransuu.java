package kennsyuu1;

/*
 * キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成して表示するプログラムを作成せよ。
 * */

import java.util.Random;

public class E2_8_Ransuu {

	// キーボードから読み込んだ整数値をそのまま反復してそのまま表示させます
	public static void main(String[] args) {

		//"整数"を表示させる出力コードを入力します
        System.out.println("整数値：100");


		//乱数の生成を行う
		Random number1 =new Random();

		//±5の乱数値を入力させる
		int randomNumbox = number1.nextInt(11)+95 ;



		//ランダムに出力される数字を表示させる
		System.out.println("その値の±5の乱数を生成しました。それは"+ randomNumbox +"です。");

	}
}

