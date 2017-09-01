package kennsyuu1;
/*
 * 0.0以上1.0未満の実数値をランダムに生成して表示。
 * 0.0以上10.0未満の実数値をランダムに生成して表示。
 * -1.0以上1.0未満の実数値をランダムに生成して表示
 *
 * */
import java.util.Random;

//3つの実数値をランダムに生成するクラス
public class E2_9_keyboard {
// 実数値をランダムに生成させる
public static void main(String[] args) {Random rand = new Random();

    // 0.0以上1.0未満の実数値をランダムに表示させる
	double x = rand.nextDouble();
	// 0.0以上10.0未満の実数値をランダムに表示させる
	double y = rand.nextDouble()*10.0;
	// -1.0以上1.0未満の実数値をランダムに表示させる
	double z = rand.nextDouble()*2.0-1.0;

	// ランダムに生成される数字を表示させる
	System.out.println(x);
	// ランダムに生成される数字を表示させる
	System.out.println(y);
	// ランダムに生成される数字を表示させる
    System.out.println(z);

}



}
