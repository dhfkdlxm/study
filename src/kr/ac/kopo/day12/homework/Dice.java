package kr.ac.kopo.day12.homework;

import java.util.Scanner;

public class Dice implements Game {
	Scanner sc = new Scanner(System.in);
	private int me = (int) (Math.random() * 6 + 1);
	private int input;
	@Override
	public int startGame(int you) {
		if (me == you) {
			System.out.println("You win");
			return 1;
		} else {
			System.out.println("You lose");
			return 0;
		}
	}

	@Override
	public void pntExplanation() {
		System.out.println("주사위 값 맞추기 게입니다.");
		System.out.println("주사위를 선택하세요(1~6값 중 하나)");

	}
	@Override
	public int inputYou() {

		while(true) {
			pntExplanation();
			input = sc.nextInt();
			sc.nextLine();
			if(input>=1 && input<=6) {
				break;
			}else {
				System.out.println("1~6숫자 중 다시 입력하세요");
			}
		}
		return input;
	}

}
