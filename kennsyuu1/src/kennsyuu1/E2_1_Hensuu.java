package kennsyuu1;
// XとYに小数部を持つ実数値を入れ、結果を考察するクラス
public class E2_1_Hensuu {
	// XとYに小数部を持つ実数値を入れ、結果を考察する
	public static void main(String[] args) {

		// Xはint型の変数
		int x;

		// Yはint型の変数
		int y;

		// Xに10.44を代入
		x = 10.44;
		// Yに5.87を代入
		y = 5.87;

		// Xの値を表示させる
		System.out.println("xの値は" + x + "です。");
		// Yの値を表示させる
		System.out.println("yの値は" + y + "です。");
		// 合計を表示させる
		System.out.println("合計は" + (x + y) +  "です。");
		// 平均を表示させる
		System.out.println("平均は" + (x + y) / 2 +  "です。");

		//結果、小数部を含む数値を入力すると、変数を扱えるのは整数のみとなる為エラーとなる

	}

}
