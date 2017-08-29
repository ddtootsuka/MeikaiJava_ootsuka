package kennsyuu1;
/*
 * 三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
 * */

import java.util.Scanner;

//三角形の底辺と高さからその面積を表示するプログラムを表示させるクラス
public class E2_6_hensuu {


			public static void main(String[] args) {
				// キーボードのスキャナーを入力します
				Scanner putinKey = new Scanner(System.in);

				// 底辺を表示させる文字を出力する
				System.out.println("底辺:");
				// xに底辺の値をインプットさせる
				double x = putinKey.nextDouble();
				// 高さを表示させる文字を出力する
				System.out.println("高さ");
				// yに高さの値をインプットさせる
				double y = putinKey.nextDouble();

				// xとyを足して２割る計算式を表示させる
				System.out.println("面積は" + (x * y) /2 );


}
}


