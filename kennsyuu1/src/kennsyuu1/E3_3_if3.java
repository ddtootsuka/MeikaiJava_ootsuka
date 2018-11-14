package kennsyuu1;

import java.util.Scanner;

/*
 * List3-5の最後のelseを、else if(n==0)に変更したらどうなるか検討せよ
 * 目的：elseをelse ifにしたらどのような結果になるか検討する
 * 解き方：else ifと入力してまず結果を見る
 */

public class E3_3_if3 {
	// メインメソッドを宣言する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// 画面に"整数値：" と表示させる
		System.out.println("整数値：");
		// キーボードから読み込ませた値をmustnumに宣言する
		int mustnum = stdIn.nextInt();
		
		
		if(mustnum > 0) {
			System.out.println("その値は正です。");
		}
		else if(mustnum < 0);
	       System.out.println("その値は負です。");
	       else
	    System.out.println("その値は0です。")
	    	   
	
	}
