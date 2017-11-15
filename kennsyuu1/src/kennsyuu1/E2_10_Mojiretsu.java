package kennsyuu1;

import java.util.Scanner;

/*
 * 名前の姓と名とを個別にキーボード読み込んで、挨拶を行うプログラムを作成せよ。
 * */
public class E2_10_Mojiretsu {

	// 名前を個別に読んで挨拶を行うプログラムを作成するクラス
	public static void main(String[] args) {

		// キーボードのスキャナーを入力します
		Scanner stdIn = new Scanner(System.in);

		//指定した文字、姓を表示させる
		System.out.println("姓：");
		//一行に指定した文字列を表示させる
		String name1 =stdIn.next();

		// 指定した文字、名を入力させる
		System.out.println("名：");
		//一行に指定した文字列を表示させる
		String name2 =stdIn.next();

		//画面に挨拶を行うプログラムを表示させる
		System.out.println("こんにちは" + name1 + name2 + "さん。");

	}
}

