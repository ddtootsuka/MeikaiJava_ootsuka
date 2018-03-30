package kennsyuu1;

import java.util.Random;

/*
 * 0,1,2のいずれかの値の乱数を生成し、0であれば"グー"を、1であれば"チョキ"を、2であれば”パー"を表示するプログラムを作成せよ
 */

public class E_3_17_switch {

	public static void main(String[] args) {
		Random rand = new Random();

		// 0~2の乱数を生成します
		int Ransuu = rand.nextInt(3);

		// 画面に下記、文を表示させます
		System.out.print("手を表示せよ(0・・グー/1・・チョキ/2・・パー)" + Ransuu + "：");

		// ０の時はグー、１の時はチョキ、２の時はパーを出すように表示します
		switch (Ransuu) {
		// Ransuuに0が入る場合、"グー"と表示される
		case 0:
			System.out.println("グー");
			// 0が入力された場合、ｓｗｉｔｃｈ文が終了となる
			break;

		// Ransuuに1が入る場合、"チョキ"と表示される
		case 1:
			System.out.println("チョキ");
			// 1が入力された場合、ｓｗｉｔｃｈ文が終了となる
			break;

		// Ransuuに2が入る場合、"パー"と表示される
		case 2:
			System.out.println("パー");
			// 2が入力された場合、ｓｗｉｔｃｈ文が終了となる
			break;
		}
	}

}
