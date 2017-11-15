package kennsyuu1;

/*
 * 整数値を読み込んで、その絶対値を求めて表示するプログラムを生成せよ
 * */

import java.util.Scanner;

// 整数から絶対値を求めて表示させるクラス
public class E3_1_if {

	public static void main(String[] args) {
		//キーボードのスキャナーを入力します
		Scanner stdIn = new Scanner(System.in);

        //指定した文字、整数値：を表示させる
		System.out.print("整数値：");

		//文字を読み込む
		int num = stdIn.nextInt();
		//負の整数値が入力された場合、減算される
        int num2 = -num;

        //0と入力した数値がtrueであるか判別させる
		if ( num > 0 ) {
		//画面に指定した文字と数字を入力させる
		System.out.println("その絶対値は" + num + "です。");


		//0と入力した数値がfalseであるか判別させる
		} else if ( num < 0 ){
		//画面に指定した文字と数字を入力させる
		System.out.println("その絶対値は" + num2 + "です。");
		}


	}

}