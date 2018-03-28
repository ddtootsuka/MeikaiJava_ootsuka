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
		case 1:
			System.out.println("冬");
			break;
		case 2:
			System.out.println("冬");
			break;
		case 3:
			System.out.println("冬");
			break;
		case 4:
			System.out.println("春");
			break;
		case 5:
			System.out.println("春");
			break;
		case 6:
			System.out.println("春");
			break;
		case 7:
			System.out.println("夏");
			break;
		case 8:
			System.out.println("夏");
			break;
		case 9:
			System.out.println("夏");
			break;
		case 10:
			System.out.println("秋");
			break;
		case 11:
			System.out.println("冬");
			break;
		case 12:
			System.out.println("冬");

		}
	}

}
