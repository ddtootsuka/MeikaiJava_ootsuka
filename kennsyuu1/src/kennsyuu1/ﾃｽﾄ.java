package kennsyuu1;

/*
 *
 * 読み込んだ値が1未満であれば改行文字を出力しないように
 * List4-7およびList4-8を書きかえたプログラムをそれぞれ作成せよ。
 */
 
import java.util.Scanner;

// 整数から絶対値を求めて表示させるクラス
public class ﾃｽﾄ {

	public static void main(String[] args) {
		//キーボードのスキャナーを入力します
		Scanner stdIn = new Scanner(System.in);

		//何個表示させますかと画面上に表示させる
		System.out.print("何個*を表示させますか");

		//アスタリスクに表示させる数字を打ち込む
		int driveinnumber = stdIn.nextInt();
		
		//読み込んだ数字に1を代入する
		int variable = 1;
		//読み込んだ値が表示させる文字と比較して1未満であれば、改行文字を入力しない。
		while(variable<driveinnumber) {
		System.out.print('*');
		variable++;
		}
		
		
		
		
		
	}

}
