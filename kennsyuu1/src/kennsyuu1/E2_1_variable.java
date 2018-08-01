package kennsyuu1;

/*
 * List2-6の２の箇所を小数部をもつ実数地をXとYに代入するよう変更して、
 * その結果を考察せよ
 * 目的：指摘箇所に少数部をもつ実数地を代入するとどうなるのか考察する
 * 解き方：実数値を入れてみる、が変数が扱えるには整数のみなのでエラーが出ると想定する
 */
public class E2_1_variable {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		// 整数1という箱を作成します
		int variable1;
		// 整数2という箱を作成します
		int variable2;

		// variable1に63.1を代入する
		variable1 = 63.1;
		// variable2に18.1を代入する
		variable2 = 18.1;

		// 画面に"variable1の値は" + variable1 + "です。"と表示させる。
		System.out.println("variable1の値は" + variable1 + "です。");
		// 画面に"variable2の値は" + variable2 + "です。"と表示させる。
		System.out.println("variable2の値は" + variable2 + "です。");
		// 画面に"合計は" + (variable1 + variable2) + "です。"と表示させる
		System.out.println("合計は" + (variable1 + variable2) + "です。");
		// 画面に"平均は" + (variable1 + variable2) / 2 + "です。"と表示させる
		System.out.println("平均は" + (variable1 + variable2) / 2 + "です。");
	}

}
