package com.example.kita_software_studio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KitaSoftwareSample_3_8Test {

	/**
	 * テストケースNo1.
	 * <p>
	 * 1つ目のif文に入るパターン
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_001() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =60;
		int score2 = 60;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("合格", result);
	}
	
	/**
	 * テストケースNo2.
	 * <p>
	 * else(不合格)に入るパターン
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_002() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =59;
		int score2 = 59;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("不合格", result);
	}

}
