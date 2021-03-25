package kr.ac.kopo.day14.homework.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LottoNumListArray implements LottoNumUtil{
	Random ran = new Random();
	
	
	//1~45까지 리스트를 만들고 난수를 인덱스로 활용해 번호추출
	// 난수는 리스트 크기에 따라 가변적으로 변동됨!
	// getNum() List/배열 사용!
	@Override
	public void getNum() {
		List<String> ranNum = new ArrayList<>();
		int listIdx;//리스트 인덱스 변수
		for (int i = 1; i <= 45; i++) {
			ranNum.add(i+"");			//리스트에다가 1~45까지 숫자 삽입!
		}
		String[] arr = new String[6];
		for (int i = 0; i < arr.length; i++) {
			listIdx = ran.nextInt(ranNum.size());  
			arr[i] = ranNum.remove(listIdx);  // 리스트.remove(index)하여 삭제와 동시에 숫자 출력!
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
