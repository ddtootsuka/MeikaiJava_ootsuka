package kennsyuu1;

import java.util.Scanner;

/*
 * List3-5の最後のelseを、else if(n==0)に変更したらどうなるか検討せよ。
 * */

public class E3_3_case1if {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 指定された整数値という文字を表示させます
		System.out.print("整数値:");

		// number1に文字を読み込ませます
		int number1 = stdIn.nextInt();

		// 0とnumber1がtrueであるか判別させる
		if (number1 > 0)

			// trueであれば指定された文字を表示させる
			System.out.println("その値は正です。");

		// 0と入力した数値がfaiseであるか判別させる
		else if (number1 < 0)

			// falseであれば指定された文字を表示させる
			System.out.println("その値は負です。");

		// 0と入力した数値が等しい値か判別させる
		else if (number1 == 0)

			// 0とイコールの値であれば指定された文字を表示する
			System.out.println("その値は0です。");

		/*
		 * 結果としては、そのまま０は表示される。 elseの場合も結果は０になりますし、0が対象となっている限り if ( n == 0
		 * )があっても同じ結果となる。
		 */

	}
}
