package kennsyuu1;

import java.util.Scanner;

/*
 * 右に示すように、名前の姓と名とを個別にキーボード読み込んで、挨拶を行うプログラムを作成せよ。
 * 目的：右と同じようにキーボードから読み込んだ文字を表示させる
 * 解き方：姓と名を個別にキーボードから読み込んだ文字を表示する
 */

public class E2_10_variable {
	//メインメソッドを宣言します
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//画面に"姓： "を表示させる
		System.out.print("姓：");
		//キーボードから入力した文字を表示させる
		String Firstname = stdIn.next();
		
		//画面に"名： "を表示させる
		System.out.print("名：");
		//キーボードから入力した文字を表示させる
		String Name = stdIn.next();
		
		//画面に"こんにちは"+ Firstname + Name +"さん。"と表示させる
		System.out.println("こんにちは"+ Firstname + Name +"さん。");
		
	}
}
