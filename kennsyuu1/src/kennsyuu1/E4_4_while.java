package kennsyuu1;

import java.util.Scanner;

/*
 * List4-4のwhile文終了時にXの値が-1になることを確認するプログラムを作成せよ。
 */

public class E4_4_while {

	public static void main(String[] args) {
		//キーボードに打ち込んだ文字を入力する
		java.util.Scanner stdIn = new Scanner(System.in);

		//画面に"Xの値："と表示させます
		System.out.println("Xの値：");
		
		//打ち込む数字
		int countnumber;
		//do文を実行する
		do {
			//打ち込む数字に値を代入する
			countnumber = stdIn.nextInt();
			//打ち込む数字が0以下であれば繰り返す
		} while (countnumber <= 0);
		
		//打ち込んだ値を0までカウントダウンさせます
		while (countnumber >= -1) { 
			//打ち込んだ数を画面に表示させます
			System.out.println(countnumber);
			//打ち込んだ値をデクリメントする
			countnumber--;			
					}
	}
}
