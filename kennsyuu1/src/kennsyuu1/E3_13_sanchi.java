package kennsyuu1;

import java.util.Scanner;

/*
 * キーボードから読み込んだ三つの整数値の中央値求めて表示するプログラムを作成せよ。
 * ※たとえば2.3.1の中央値は2で、1.2.1の中央値は1で、3.3.3の中央値は3である。
 * 目的：三つの値の真ん中の値を求める
 * 解き方：整数1から3までを比較し、どの値が入っても中央値が求められるようにする
 */

public class E3_13_sanchi {
	
	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//画面に"Variable1:"を表示させ、Variable1にキーボードから打ち込んだ値を代入
		System.out.print("Variable1:"); int Variable1 = stdIn.nextInt();
		//画面に"Variable2:"を表示させ、Variable2にキーボードから打ち込んだ値を代入
		System.out.print("Variable2:"); int Variable2 = stdIn.nextInt();
		//画面に"Variable3:"を表示させ、Variable3にキーボードから打ち込んだ値を代入
		System.out.print("Variable3:"); int Variable3 = stdIn.nextInt();
		
		//centerにVariable1を代入
		int center = Variable1;
		//Variable2とcenterを比較して、Variable2の方が小さければcenterにその値を入れる
		if(Variable2 < center) center = Variable2;
		//そうでなければ、Variable2とcenterを比較し、Variable2の方が大きければcenterにその値を入れる
		else if(Variable2 > center) center = Variable2;
		//そうでなければ、Variable3とcenterを比較し、Variable3の方が大きければcenterにその値を入れる
		else if(Variable3 > center) center = Variable3;
		
	   //画面に"中央値は（center）に入る値です。"と表示させる
		System.out.println("中央値は" + center + "です。");
}
}