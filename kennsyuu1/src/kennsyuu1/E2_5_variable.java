package kennsyuu1;


/*
 * 二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 * 目的：二つの実数値の合計と平均を求める
 * 解き方：実数値を読み込ませ、和と平均を画面に表示させる
 */
import java.util.Scanner;

public class E2_5_variable {
	
	// メインメソッドを宣言する
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			// "number1の値"と画面に表示させる
			System.out.print("number1の値：");
			//number1にキーボードから入力した数値を読み込ませる
			double number1 = stdIn.nextDouble();
			
			// "number2"の値を画面に表示させる
			System.out.print("number2の値：");
			//number2にキーボードから入力した数値を読み込ませる
			double number2 = stdIn.nextDouble();
			
			//number1とnumber2の合計を計算し、そのまま画面に表示させる
			System.out.println("合計は" + (number1 + number2) );
			//number1とnumber2の平均を計算し、そのまま画面に表示させる
			System.out.println("平均は" + (number1 + number2) / 2);
			
		}
}
          