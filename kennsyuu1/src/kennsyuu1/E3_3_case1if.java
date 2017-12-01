package kennsyuu1;


	import java.util.Scanner;

	/*
	 * List3-5の最後のelseを、else if(n==0)に変更したらどうなるか検討せよ。
	 * */


		public class E3_3_case1if {

			public static void main(String[] args) {
				Scanner stdIn = new Scanner(System.in);

				System.out.print("整数値:");

				int number1 = stdIn.nextInt();

				if( number1 > 0 )
				System.out.println("その値は正です。");

				else if ( number1 < 0)
					System.out.println("その値は負です。");
				else if(number1 == 0)
					System.out.println("その値は0です。");




			}
	}



