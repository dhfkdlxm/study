package kr.ac.kopo.day12.homework;

import java.util.Scanner;

public class ScissorsRockPaper implements Game {
	final static int SISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	private int input;
	private int me = (int) (Math.random() * 3 + 1);
	Scanner sc = new Scanner(System.in);


	@Override
	public int startGame(int you) {
		if (me == you) {
			System.out.println("비겼습니다.");
			return -1;
		} else if ((me == 1 && you == 3) || (me == 2 && you == 1) || (me == 3 && you == 2)) {
			System.out.println("졌습니다.");
			return 0;
		} else if ((me == 1 && you == 2) || (me == 2 && you == 3) || (me == 3 && you == 1))
			System.out.println("이겼습니다.");
		return 1;

	}

	@Override
	public void pntExplanation() {
		System.out.println("가위바위보 게입니다.");
		System.out.println("가위바위보중 하나를 선택하세요.");
		System.out.println("1:가위, 2:바위, 3:보");
	}

	@Override
	public int inputYou() {
		while (true) {
			pntExplanation();
			input = sc.nextInt();
			sc.nextLine();
			if (input >= 1 && input <= 3) {
				break;
			} else {
				System.out.println("1~3 숫자 중 다시 입력하세요");
			}
		}
		return input;
	}

}
