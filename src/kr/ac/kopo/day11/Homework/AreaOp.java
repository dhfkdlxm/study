package kr.ac.kopo.day11.Homework;

import java.util.Scanner;

public class AreaOp {
	Scanner sc = new Scanner(System.in);
	private int choice;

	public int choice() {
		System.out.println("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원)");
		choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}

	public void operator() {
		Figure fg = null;
		switch (choice()) {
		case 1:
			fg = new Rectangular();
			break;
		case 2:

			break;
		case 3:
			fg = new Triangle();
			break;
		case 4:
			fg = new Circle();
			break;
		}
		if (fg != null) {
			fg.CalArea();
		} else {
			System.out.println("4개의 숫자중 하나만 입력하세요");
		}
	}

}
