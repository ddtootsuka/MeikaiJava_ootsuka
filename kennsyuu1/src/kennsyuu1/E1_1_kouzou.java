package kennsyuu1;

/*
 *プログラムの中の終端を示すセミコロン；が欠如しているとどうなるか。プログラムをコンパイルして検証せよ。 
 */

public class E1_1_kouzou {
	// メインメソッドの宣言をします
	public static void main(String[] args) {
		//画面に"初めてのJavaプログラム。"と表示させる。
		System.out.println("初めてのJavaプログラム。");
		//画面に"画面に出力しています。"と表示させる。
		System.out.println("画面に出力しています。")
	}
}

// 結果は、セミコロンが欠如すると、構文エラーとして下記文章が表示されました。
「Exception in thread"main"java.lang.Error:
Unresolved compilation problem:構文エラーがあります。";"
を挿入して Statement　
を完了してください at kennsyuu1.E1_1_kouzou.main(E1_1_kouzou.java:13)」
