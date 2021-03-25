package kr.ac.kopo.day13.homework02;

import java.util.Scanner;

public class CalendarOP {
	Scanner sc = new Scanner(System.in);
	private int inputSel = 0;
	private int year;
	private int month;
	private boolean bool = true;

	public int inputSel() {
		inputSel = sc.nextInt();
		sc.nextLine();
		return inputSel;
	}

	public int select() {
		while (true) {
			System.out.print("선택하세요(1. 특정년도 2. 특정월 3. 종료) =>");
			inputSel = inputSel();
			if (inputSel <= 3 && inputSel > 0) {
				break;
			} else {
				System.out.println("1~3사이 값을 입력해주세요");
			}

		}
		return inputSel;
	}

	public void CalOp() {
		while (bool) {
			switch (select()) {
			case 1:
				System.out.print("년도를 입력하세요 : ");
				year = inputSel();
				new CalUtil(year);

				break;
			case 2:
				System.out.print("년도를 입력하세요 : ");
				year = inputSel();
				System.out.print("월를 입력하세요 : ");
				month = inputSel();
				new CalUtil(year, month);

				break;
			case 3:
				System.out.println("종료됩니다.");
				bool = false;
				break;
			}
		}
	}

}
