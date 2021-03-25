package kr.ac.kopo.day14.homework.lotto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoNumUtil {
	Random ran = new Random();

	public void getNum1() {
		int[] arr = new int[6];
		int i = 0;
		boolean bool = true;
		while (bool) {
			int inputNum = ran.nextInt(45) + 1;
			for (int j : arr) {
				if (j != inputNum) {
					arr[i++] = inputNum;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	public void getNum2() {
		Set<String> ranNum = new HashSet<>();

		while (ranNum.size() <= 6) {
			ranNum.add("" + (ran.nextInt(45) + 1));
		}
		Object[] arr = ranNum.toArray();
		System.out.println(Arrays.toString(arr));

	}

	public void getNum3() {

	}

	public void getNum4() {

	}

}
