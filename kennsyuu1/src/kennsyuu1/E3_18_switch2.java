package kennsyuu1;

import java.util.Scanner;

/*
 * 月を1~12の整数値として読み込んで、それに対応する季節を表示するプログラムを作成せよ
 */

public class E3_18_switch2 {

	public static void main(String[] args) {
		// キーボードに打ち込んだ文字を入力する
		Scanner stdIn = new Scanner(System.in);

		// 画面に下記（）内の分を表示せよ
		System.out.print("季節を表示せよ:");
		int seasons = stdIn.nextInt();

		// 11~3の場合は冬、4~6の場合は春、7~9の場合は夏、10の場合は秋と表示させよう
		switch (seasons) {
		// seasonsに1が入力された場合、"冬"と表示される
		case 1:
			System.out.println("冬");
			// 1が入力された場合は、switch文が終了となる
			break;

		// seasonsに2が入力された場合、"冬"と表示される
		case 2:
			System.out.println("冬");
			// 2が入力された場合は、switch文が終了となる
			break;

		// seasonsに3が入力された場合、"冬"と表示される
		case 3:
			System.out.println("冬");
			// 3が入力された場合は、switch文が終了となる
			break;

		// seasonsに4が入力された場合、"春"と表示される
		case 4:
			System.out.println("春");
			// 4が入力された場合は、switch文が終了となる
			break;

		// seasonsに5が入力された場合、"春"と表示される
		case 5:
			System.out.println("春");
			// 5が入力された場合は、switch文が終了となる
			break;

		// seasonsに6が入力された場合、"春"と表示される
		case 6:
			System.out.println("春");
			// 6が入力された場合は、switch文が終了となる
			break;

		// seasonsに7が入力された場合、"夏"と表示される
		case 7:
			System.out.println("夏");
			// 7が入力された場合は、switch文が終了となる
			break;

		// seasonsに8が入力された場合、"夏"と表示される
		case 8:
			System.out.println("夏");
			// 8が入力された場合は、switch文が終了となる
			break;

		// seasonsに9が入力された場合、"夏"と表示される
		case 9:
			System.out.println("夏");
			// 9が入力された場合は、switch文が終了となる
			break;

		// seasonsに10が入力された場合、"秋"と表示される
		case 10:
			System.out.println("秋");
			// 10が入力された場合は、switch文が終了となる
			break;

		// seasonsに11が入力された場合、"冬"と表示される
		case 11:
			System.out.println("冬");
			// 11が入力された場合は、switch文が終了となる
			break;

		// seasonsに12が入力された場合、"冬"と表示される
		case 12:
			System.out.println("冬");
			// 12が入力された場合は、switch文が終了となる
			break;

		}
	}

}
