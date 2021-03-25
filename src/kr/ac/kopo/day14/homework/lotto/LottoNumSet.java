package kr.ac.kopo.day14.homework.lotto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoNumSet implements LottoNumUtil{
	Random ran = new Random();
	// getNum() Set사용!
	@Override
	public void getNum() {
		Set<String> ranNum = new HashSet<>(); //객체 타입이 String인 HashSet 객체 생성

		while (ranNum.size() <= 6) {
			ranNum.add("" + (ran.nextInt(45) + 1)); // 랜덤값 String으로 형변환
		}
		Object[] arr = ranNum.toArray(); // 출력
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
