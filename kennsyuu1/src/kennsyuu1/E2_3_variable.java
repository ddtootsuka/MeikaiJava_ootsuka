package kennsyuu1;

/*
 * 右に示すように、キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ。
 * 目的：示された数字をそのまま表示させる
 * 解き方：キーボードから打った整数値を読み込んで、指定の文と入力した数値を一緒に画面に反映させる
 */

	import java.util.Scanner;
	
public class E2_3_variable {

	//メインメソッドを宣言します
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			//画面に"整数値："と表示させます
			System.out.print("整数値：");
			
			//キーボードから読み込んだ数値をそのまま反復して表示させるために、integerに整数値を読み込む
			int integer = stdIn.nextInt();
			
			//"○と入力しましたね"と画面に表示させる
			System.out.println(integer + "と入力しましたね。");
		}
}
