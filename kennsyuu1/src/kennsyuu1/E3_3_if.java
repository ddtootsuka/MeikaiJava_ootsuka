package kennsyuu1;

import java.util.Scanner;

/*
 * List3-5の最後のelseを、else if(n==0)に変更したらどうなるか検討せよ。
 * */


public class E3_3_if {

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);

			System.out.print("整数値:");

			int n = stdIn.nextInt();

			if( n > 0 )
			System.out.println("その値は正です。");

			else if ( n < 0)
				System.out.println("その値は負です。");
			//
			else if ( n==0 )
				System.out.println("その値は0です。");


			/*
			 * そのまま０は表示される。falseの生成はされるはずだが、何もコードを入力していないので表示されないままである。
			 * */



	}

}
