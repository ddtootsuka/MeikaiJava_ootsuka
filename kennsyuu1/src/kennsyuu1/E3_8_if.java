package kennsyuu1;

import java.util.Scanner;

/* キーボードから読み込んだ点数に応じて、優/良/可/不可/を判定して表示させるプログラムを作成せよ。
 * 判定は以下のように行うこと。
 * 0～59→不可/60～69→可/70～79→良/80～100→優　
 */

public class E3_8_if {

	public static void main(String[] args) {
		// キーボードのスキャナーを入力します
		Scanner stdIn = new Scanner(System.in);
		//点数：と表示させる
		System.out.print("点数：");


		//判定される点数に値を入力します
		int PointsToBeJudgement = stdIn.nextInt();

		//0より大きく、59より小さい値かを判別させる
		if (PointsToBeJudgement >= 0 && PointsToBeJudgement<= 59 ) {
			//0～59の数値の場合、不可と表示させる
			System.out.println("不可");

			//60より大きく、69より小さい値かを判別させる
		}else if (PointsToBeJudgement >= 60 && PointsToBeJudgement <=69) {
			//60～69の数値の場合、可と表示させる
			System.out.println("可");

			//70より大きく、79より小さい値かを判別させる
		}else if(PointsToBeJudgement >= 70 && PointsToBeJudgement <=79) {
			//70～79の数値の場合、良と表示させる
			System.out.println("良");

			//80より大きく、100より小さい値かを判別させる
		}else if (PointsToBeJudgement >= 80 && PointsToBeJudgement <=100) {
			//80～100の数値の場合、優と表示させる
			System.out.println("優");
		}
	}
}


