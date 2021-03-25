package kr.ac.kopo.day14.homework.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LottoNumList implements LottoNumUtil{
	Random ran = new Random();
	// getNum() List/ArrayList사용!
	// List중 remove(index)를 사용해 삭제되는 값이 있으면, 그 값을 삭제 후 다시입력!
	@Override
	public void getNum() {
		List<String> ranNum = new ArrayList<>();
		while (ranNum.size() <= 6) {
			String inputNum = "" + (ran.nextInt(45) + 1);
			if (ranNum.remove(inputNum)) { // 삭제되는 값이 있으면 다시 반복문 처음으로!
				continue;
			} else {
				ranNum.add(inputNum); // 없으면 값을 넣어라!
			}
		}
		Object[] arr = ranNum.toArray();
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
