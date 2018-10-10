package kennsyuu1;

import java.util.Scanner;

/*
 * キーボードから読み込んだ整数値プラスマイナス５の範囲の整数値をランダムに生成して表示するプログラムを作成せよ。
 * 目的：読み込んだ値のプラスマイナス５の範囲の整数値をランダムに生成し、表示させる
 * 解き方：整数値プラスマイナス5の範囲を表す乱数をまず作成する
 */

public class E2_8_ransu {

	//メインメソッドを宣言する
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			//適当二世数値をうちこむ
			System.out.print("整数値：");
	
			int randomnum = stdIn.nextInt(5)-5;
	
			//画面に"その値の"
			System.out.println("その値の±５の乱数を生成しました。それは" + randomnum + "です");
			
			
		}
		
}
