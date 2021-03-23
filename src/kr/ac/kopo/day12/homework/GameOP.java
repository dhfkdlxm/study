package kr.ac.kopo.day12.homework;

import java.util.Scanner;

public class GameOP {
	Scanner sc = new Scanner(System.in);
	private boolean checkGame = true;
	private String select;
	private static int cntWin = 0;
	private static int cntLose = 0;
	private static int cntDraw = 0;
	private int input;
	

	public String selectGame() {
		System.out.println("게임을 선택하세요 \n A. 가위바위보 \n B. 주사위 값 맞추기 \n C. 종료");
		select = sc.nextLine();
		return select;
	}
	
	public void operator() {
		Game g = null;
		while (checkGame) {
			int result = 2;
			select = selectGame();
			if (select.equalsIgnoreCase("A")) {
				g= new ScissorsRockPaper();
				input=g.inputYou();
				result = g.startGame(input);
			} else if (select.equalsIgnoreCase("B")) {
				g = new Dice();
				input=g.inputYou();
				result = g.startGame(input);
			} else if (select.equalsIgnoreCase("C")) {
				System.out.println("게임을 종료합니다.");
				pntResult();
				checkGame = false;
			} else {
				System.out.println("다시 입력하세요!");
			}
			checkResult(result);
		}
		
		
	}
	public void checkResult(int result) {
		if(result == 1) {
			cntWin++;
		}else if(result ==0) {
			cntLose++;
		}else if(result == -1) {
			cntDraw++;
		}
	}
	
	
	public void pntResult() {
		System.out.println("당신의 게임 전적은 "+cntWin+"승"+cntLose+"패"+cntDraw+"무입니다.");
	}

}
