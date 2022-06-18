package hello.kazuate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * キーボードからの入力を練習するクラス
 *
 */
// ↓KeyBoardInputという名前のクラスを宣言．大文字で始める．単語のつなぎ目は大文字に

public class KeyBoardInput {

	// public KeyBoardInput(){
// eyBoardInputクラスのmainメソッド．
	public int input()  {
		/*-------- 入力の準備 --------*/
		// キーボード（標準入力）の読み取り機（リーダー）
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line; // 読み取り用の文字列バッファ

		/*-------- 整数の入力の練習 --------*/

        int input = 0;
		try {
			System.out.print("●予想を入力してください：");
			line = br.readLine(); // 1行読み込む
			input = Integer.parseInt(line);// 文字列を整数に変換する．
			System.out.println("あなたの予想は"+input+"ですね。");
		} catch (NumberFormatException e) { // parseInt()からの例外を拾う．
			System.err.println("フォーマット例外：予想をを10で進めます．");
			input = 10;
		} catch (IOException e) { // readLine()からの例外を拾う．
			System.err.println("入出力例外：予想を10で進めます．");
			input = 10;
		}




        return input;
	}

}
