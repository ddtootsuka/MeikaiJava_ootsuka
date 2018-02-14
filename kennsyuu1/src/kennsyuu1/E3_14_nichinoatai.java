package kennsyuu1;

import java.util.Scanner;

/*
 * LIST3-13と同様に、二つの整数値を読み込んで、小さいほうの値と大きいほうの値の両方を表示する
 * プログラムを作成せよ。ただし、二つの整数うちが等しい場合は、右に示すように『二つの値は同じです。』
 * と表示すること。
 */

public class E3_14_nichinoatai {

	public static void main(String[] args) {
		// キーボードに打ち込んだ文字を入力する
		Scanner stdIn = new Scanner(System.in);

		// 画面に"整数A:"と表示させる
		System.out.print("整数A:");
		// 整数Aにデータを入力する
		int IntegerA = stdIn.nextInt();

		// 画面に"整数B:"と表示させる
		System.out.print("整数B:");
		// 整数Bにデータを入力する
		int IntegerB = stdIn.nextInt();

		// 小さいほうの値と、大きいほうの値を導入する
		int min, max;

		// もし整数Aが整数Bより小さければ、小さいほうの値に整数Aをいれ、大きいほうの値に整数Bをいれる
		if (IntegerA < IntegerB) {
			min = IntegerA;
			max = IntegerB;
	
		// そうでなければ、小さいほうに整数Bをいれ、大きいほうに整数Aをいれる
		} else {
			min = IntegerB;
			max = IntegerA;
		}

		//整数Aと整数Bの値が同じであるか判別させる
		if (IntegerA == IntegerB) {
			// 画面に二つの値は同じですと表示させます。
			System.out.println("二つの値は同じです。");
		}

	}
}

	