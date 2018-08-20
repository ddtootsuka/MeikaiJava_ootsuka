package kennsyuu21;

/*
 * List2-6の２の箇所を小数部をもつ実値をXとYに代入するよう変更して、
 * その結果を考察せよ
 * 目的：指摘箇所に少数部をもつ実数地を代入するとどうなるのか考察する
 * 解き方：実数値を入れてみる、が変数が扱えるには整数のみなのでエラーが出ると想定する
 */
public class E2_1_variable {

	// メインメソッドを宣言する
	public static void main(String[] args) {
		// 整数1をいれるための箱を作成します
		int variable1;
		// 整数2をいれるための箱を作成します
		int variable2;

		// variable1に小数点を含んだ数値、63.1を代入する
		variable1 = 63.1;
		// variable2に小数点を含んだ数値、18.1を代入する
		variable2 = 18.1;

		// variable1を表示させるために、variable1の値を画面に表示させる
		System.out.println("variable1の値は" + variable1 + "です。");
		
		// variable2を表示させるために、variable2の値を画面に表示させる
		System.out.println("variable2の値は" + variable2 + "です。");
		
		// 合計を表示させるために、variable1とvariable2を足した数を画面に表示させる
		System.out.println("合計は" + (variable1 + variable2) + "です。");
		
		//　平均を表示させるために、variable1とvariable2を足し、2で割った数値を画面に表示させる
		System.out.println("平均は" + (variable1 + variable2) / 2 + "です。");
	}

}
