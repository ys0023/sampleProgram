package com.example.kita_software_studio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KitaSoftwareSample_3_8Test {

	/**
	 * テストケースNo1.
	 * <p>
	 * 1つ目のif文テスト（条件がtrueになる）
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
		assertEquals("合格1", result);
	}
	
	/**
	 * テストケースNo2.
	 * <p>
	 * 1つ目のif文テスト（条件がfalseになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_002() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =60;
		int score2 = 59;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("不合格", result);
	}
	
	/**
	 * テストケースNo3.
	 * <p>
	 * 1つ目のif文テスト（条件がfalseになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_003() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =59;
		int score2 = 60;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("不合格", result);
	}
	
	/**
	 * テストケースNo4.
	 * <p>
	 * 1つ目のif文テスト（条件がfalseになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_004() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =59;
		int score2 = 59;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("不合格", result);
	}
	
	/**
	 * テストケースNo5.
	 * <p>
	 * 2つ目のif文テスト（条件がtrueになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_005() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =50;
		int score2 = 80;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("合格2", result);
	}
	
	/**
	 * テストケースNo6.
	 * <p>
	 * 2つ目のif文テスト（条件がtrueになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_006() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =80;
		int score2 = 50;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("合格2", result);
	}
	
	/**
	 * テストケースNo7.
	 * <p>
	 * 2つ目のif文テスト（条件がfalseになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_007() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =49;
		int score2 = 80;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("不合格", result);
	}
	
	/**
	 * テストケースNo8.
	 * <p>
	 * 2つ目のif文テスト（条件がfalseになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_008() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =80;
		int score2 = 49;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("不合格", result);
	}
	
	/**
	 * テストケースNo9.
	 * <p>
	 * 3つ目のif文テスト（条件がtrueになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_009() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =10;
		int score2 = 90;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("合格3", result);
	}
	
	/**
	 * テストケースNo10.
	 * <p>
	 * 3つ目のif文テスト（条件がtrueになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_010() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =90;
		int score2 = 10;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("合格3", result);
	}
	
	/**
	 * テストケースNo11.
	 * <p>
	 * 3つ目のif文テスト（条件がfalseになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_011() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =20;
		int score2 = 50;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("不合格", result);
	}
	
	/**
	 * テストケースNo12.
	 * <p>
	 * 3つ目のif文テスト（条件がfalseになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_012() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =40;
		int score2 = 89;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("不合格", result);
	}
	
	/**
	 * テストケースNo13.
	 * <p>
	 * 3つ目のif文テスト（条件がfalseになる）
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_013() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =89;
		int score2 = 40;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("不合格", result);
	}
	
	/**
	 * テストケースN14.
	 * <p>
	 * else(不合格)に入るパターン
	 * </p>
	 * 
	 */
	@Test
	public void judgmentTest_014() {
		
		// テスト対象メソッドの入力値(引数)
		int score1 =59;
		int score2 = 59;
		
		// テスト対象メソッドの実行
		String result = KitaSoftwareSample_3_8.judgment(score1, score2);
		
		// 結果比較
		assertEquals("不合格", result);
	}

}
