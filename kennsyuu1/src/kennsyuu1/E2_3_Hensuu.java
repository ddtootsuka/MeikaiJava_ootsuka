package kennsyuu1;

/*
 *右に示すように、キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ。
 * */

//Javaファイルをインポートします
import java.util.Scanner;
// キーボードから読み込んだ整数値を反復して表示するプログラムを作成するクラス
public class E2_3_Hensuu {
	//整数値をそのまま反復して表示させる
	private static Scanner NUM1;
	//キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成します
	public static void main(String[] args) {
		// 整数値を表示させる出力コードを入力します
		System.out.println("整数値：");
		// 整数値を横に表示させる文字を表示させます　
		System.out.println("と入力しましたね");
		// キーボードと結びつく入力ストリームを入力します
		NUM1 = new Scanner(System.in);
		// 文字を代入します
		NUM1.nextInt();

	}
}