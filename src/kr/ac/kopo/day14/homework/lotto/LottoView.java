package kr.ac.kopo.day14.homework.lotto;

import java.util.Scanner;

public class LottoView {
	Scanner sc = new Scanner(System.in); 
	public int inputNum(String msg) {
		System.out.print(msg);
		int inputNum = sc.nextInt();
		sc.nextLine();
		return inputNum;
	}

	
	
	public int timesGame() {
		int times = inputNum("게임수를 입력하세요 :");
		LottoNumUtil lnt = new LottoNumUtil(); 
		for (int i = 0; i < times; i++) {
			System.out.print("게임" + (i+1) + " : ");
			lnt.getNum1();
		}

		return 0;
	}

}
