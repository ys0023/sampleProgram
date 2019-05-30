package com.example.kita_software_studio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KitaSoftwareSample_3_8 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			int score1 = Integer.parseInt(br.readLine());
			int score2 = Integer.parseInt(br.readLine());

			String result = judgment(score1, score2);
			System.out.println(result);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String judgment(int score1, int score2) {

		String result = null;

		if (score1 >= 60 && score2 >= 60) {
			result = "合格1";

		} else if ((score1 + score2) >= 130) {
			result = "合格2";

		} else if ((score1 + score2) >= 100 && (score1 >= 90 || score2 >= 90)) {
			result = "合格3";

		} else {
			result = "不合格";
		}

		return result;
	}

}
