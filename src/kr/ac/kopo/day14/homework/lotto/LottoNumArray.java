package kr.ac.kopo.day14.homework.lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoNumArray implements LottoNumUtil {
	Random ran = new Random();


	// getNum : 배열 사용!
	@Override
	public void getNum() {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int ranNum = ran.nextInt(45) + 1;
			arr[i] = ranNum;
			for (int j = 0; j < i; j++) { // 이때까지 넣은 숫자들 중에서, 중복이 있는지 판단
				if (arr[i] == arr[j]) {
					i--; // 중복이 있으면 다시 재생성!
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	@Override
	public void showLottoNums(int times) {
		for (int i = 0; i < times; i++) {
			System.out.print("게임" + (i + 1) + " : ");
			getNum();
		}
	}

}
