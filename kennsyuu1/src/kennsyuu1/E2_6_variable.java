package kennsyuu1;

/*
 * 三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
 * 目的：三角形の底辺と高さを読み込み、面積を表示する
 * 解き方：まず三角形の底辺と高さを出し、合計を求める式を画面に表示させる
 */

import java.util.Scanner;

public class E2_6_variable {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//三角形の面積を求めますと画面に表示させる
		System.out.println("三角形の面積を求めます");
	
		//底辺を画面に表示させる
		System.out.print("底辺：");
		//baseに底辺となる実数地を読み込ませる
		double base = stdIn.nextDouble();
		//高さを画面に表示させる
		System.out.print("高さ：");
		//hightに高さとなる実数地を読み込ませる
		double hight = stdIn.nextDouble();		
		
		//(base×hight)÷2を実行し、三角形の面積を求め、そのまま画面に面積を表示させる
		System.out.println("面積は" + ((base * hight)/2) + "です。");
		
	}		
}
