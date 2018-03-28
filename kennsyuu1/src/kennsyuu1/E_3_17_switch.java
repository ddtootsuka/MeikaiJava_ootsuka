package kennsyuu1;

import java.util.Random;

/*
 * 0,1,2のいずれかの値の乱数を生成し、0であれば"グー"を、1であれば"チョキ"を、2であれば”パー"を表示するプログラムを作成せよ
 */

public class E_3_17_switch {

	public static void main(String[] args) {
		Random rand = new Random();

		// 0~3の乱数を生成します
		int Ransuu = rand.nextInt(4);

		// 画面に下記、文を表示させます
		System.out.print("手を表示せよ(0・・グー/1・・チョキ/2・・パー)" + Ransuu + "：");

		
		switch (Ransuu) {
		case 0:
			System.out.println("グー");
			break;
		case 1:
			System.out.println("チョキ");
			break;
		case 2:
			System.out.println("パー");
			break;
		}
	}

}
