package kennsyuu1;

import java.util.Random;
import java.util.Scanner;

/*
 * 二桁の整数値を（10~99）を当てさせる《数当てゲーム》を作成せよ
 */

public class E4_2_do2 {

	public static void main(String[] args) {
		Random rand = new Random();
		// キーボードに打ち込んだ文字を入力する
		Scanner stdIn = new Scanner(System.in);

		// 当てさせる数字を10~99の乱数として生成する
		int gameNumber = rand.nextInt(90) + 10;

		// 画面に"数当てゲーム開始☆”と表示させる
		System.out.println("数当てゲーム開始☆");
		// 画面に"10~99の数を当ててください"と表示させる
		System.out.println("10~99の数を当ててください");

		// プレイヤーが入力した数値
		int playerNumber;

		//do文を実行
		do {
			// 画面に"いくつかな？"と表示させる
			System.out.print("いくつかな？");
			// playerに値を読み込む
			playerNumber = stdIn.nextInt();

			// もしplayerNumberがgameNumberより大きければ、画面に"もっと小さな数字です!"と表示させる
			if (playerNumber > gameNumber)
				System.out.println("もっと小さな数字です!");
			// また、gameNumberがplayerNumberよりも小さければ、画面に"もっと大きな数です!"と表示させる
			else if (playerNumber < gameNumber)
				System.out.println("もっと大きな数です!");
		}
		// playerNumberとgameNumberが等しくなければ繰り返す
		while (playerNumber != gameNumber);

		// 画面に"正解です!"と表示させる
		System.out.println("正解です!");

	}
}
