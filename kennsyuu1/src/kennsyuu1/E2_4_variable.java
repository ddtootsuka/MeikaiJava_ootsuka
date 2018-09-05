package kennsyuu1;

/*
 * 右に示すように、キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するプログラムを作成せよ
 * 目的：整数値に10を加えた数、10を引いた数を表示させる
 * 解き方：キーボードから読みこんだ数値に加算、減算行い、画面に表示させる
 */
import java.util.Scanner;

public class E2_4_variable {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に整数値を表示する
		System.out.println("整数値：");

		// キーボードから読み込んだ整数値に、10を加えた数と10を減算した数を表示させるために、variableに整数値を読み込む
		int variable = stdIn.nextInt();
		// 画面に"10を加えた値は" + variable + "です"と表示させる。
		System.out.println("10を加えた値は" + (variable + 10) +"です");
		// 画面に"10を減じた値は" + variable + "です"と表示させる。
		System.out.println("10を減じた値は" + (variable - 10) + "です");
	
	}
}
