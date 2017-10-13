package
kennsyuu1;

/*
 *右に示すように、キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ。
 * */

//Javaファイルをインポートします
import java.util.Scanner;
// キーボードから読み込んだ整数値を反復して表示するプログラムを作成するクラス
public class E2_3_Hensuu {


	    //キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成します
	    public static void main(String[] args) {
		Scanner numScanner = new Scanner(System.in);
		
		// 整数値を表示させる出力コードを入力します
		System.out.println("整数値：");
		
		 //number1にスキャナーから出力した値を入れます
		int number1 = numScanner.nextInt();
		
		
		
		// 整数値と指定した文を横に表示させる文字を表示させます　
		System.out.println( number1 + "と入力しましたね");

	}
}

 