package kr.ac.kopo.day11.Homework;

import java.util.Random;
import java.util.Scanner;

public class AreaOp {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	private int choice;
	private int ranNum = ran.nextInt(8)+2;
	private int ranNum2 =ran.nextInt(8)+2;

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
			fg = new Rectangular(ranNum, ranNum2);
			break;
		case 2:
			fg = new Square(ranNum);
			break;
		case 3:
			fg = new Triangle(ranNum, ranNum2);
			break;
		case 4:
			fg = new Circle(ranNum);
			break;
		}
		if (fg != null) {
			fg.CalArea();
		} else {
			System.out.println("4개의 숫자중 하나만 입력하세요");
		}
	}
	

}
