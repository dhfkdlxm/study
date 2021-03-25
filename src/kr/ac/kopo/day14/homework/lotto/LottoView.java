package kr.ac.kopo.day14.homework.lotto;

import java.util.Scanner;

public class LottoView {
	Scanner sc = new Scanner(System.in);
	private int times;

	public int inputNum(String msg) {
		System.out.print(msg);
		int inputNum = sc.nextInt();
		sc.nextLine();
		return inputNum;
	}

	public void timesGame() {
		LottoNumUtil lnt = null;
		while (true) {
			int select = inputNum("어떤 알고리즘으로 추출할건지 선택하세요\n 1. 배열과 조건문 활용 2. Set활용 3. ArrayList활용  4. List와 배열 혼합활용 ");
			switch (select) {
			case 1:
				times = inputNum("게임수를 입력하세요 :");
				lnt = new LottoNumArray();
				break;
			case 2:
				times = inputNum("게임수를 입력하세요 :");
				lnt = new LottoNumSet();
				break;
			case 3:
				times = inputNum("게임수를 입력하세요 :");
				lnt = new LottoNumList();
				break;
			case 4:
				times = inputNum("게임수를 입력하세요 :");
				lnt = new LottoNumArray();
				break;
			}
			if (lnt != null) {
				lnt.showLottoNums(times);
				System.out.println("게임이 종료됩니다.");
				System.exit(0);
			} else {
				System.out.println("1~4숫자를 입력하세요!");
			}
		}
	}

}
