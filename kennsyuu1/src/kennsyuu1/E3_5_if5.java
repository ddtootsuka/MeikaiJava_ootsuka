package kennsyuu1;

import java.util.Scanner;

/*
 * 正の整数値を読み込んで、それが5で割り切れれば「その値は5で割り切れます。」と表示し、
 * そうでなければ「その値は5で割り切れません。」と表示するプログラムを作成せよ。
 * ※正でない値を読み込んだ場合は、「正でない値が入力されました。」と表示すること。
 * 目的：読み込んだ整数が5で割り切れる場合、割り切れない場合に文言を表示させる。
 * また、読み込んだ整数が正の数でない場合、適した文言を表示させること
 * 解き方：整数が5で割れるか割れないかを判断させ、さらに読み込んだ数が正の数でない場合、
 * 適した文言が表示されるようにすること
 */

public class E3_5_if5 {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 画面に"整数：" と表示させる
		System.out.println("整数：");
		// キーボードから読み込ませた値をvariable（整数）に宣言する
		int Variable = stdIn.nextInt();

		// 整数と0を比較し整数の方が大きい場合は、次の処理を実行します
		if (Variable > 0)
			// 整数を5で割り、そのあまりが0であれば画面に"その値は5で割り切れます"と表示させる
			if (Variable % 5 == 0) {
				System.out.println("その値は5で割り切れます");
			}
			// そうでなければ、画面に"その値は5で割り切れません"と表示させる
			else {
				System.out.println("その値は5で割り切れません");
			}
		else {
			// また、割り切れる・割り切れないのどちらの場合にも当てはまらない場合で、０より小さい数が入力されたときは画面に"正でない値が入力されました"と表示させる
			System.out.println("正でない値が入力されました");
		}
	}
}
