package kennsyuu1;
/*
 * 右に示すように、キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するプログラムを作成せよ
 *
 * */


import java.util.Scanner;

// 読み込んだ整数値に加算値と減算値を出力するプログラムを作成するクラス
public class E2_4_Hensuu {
	// 整数値に加算値と減算値を出力させる
	public static void main(String[] args) {
		// キーボードのスキャナーを入力します
		Scanner inputScanner = new Scanner(System.in);
		// 整数値の出力コードを出力します
		System.out.println("整数値：");
		// 手入力する値がインプットされます
        int x  = inputScanner.nextInt();
        // 整数値に+10の計算をします
		System.out.println(x + 10);
		// 整数値に-10の計算をします
		System.out.println(x - 10);

	}


}
