package kr.ac.kopo.day11.homework;

import java.util.Random;
import java.util.Scanner;

public class AreaCal {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	private int ranNum;
	private int choice;
	
	
	public AreaCal() {

	}
	
	/**
	 * 랜덤 값 출력 메소드
	 * @return 랜덤한 값을 출력
	 */
	
	
	public int ranNum() {
		ranNum = ran.nextInt(8) + 2;
		return ranNum;
	}
	
	public void pntResult() {
		
	}

	/**
	 *  사용자가 어떤 도형의 넓이를 원하는지 입력받는 메소드
	 */
	public int choice() {
		System.out.println("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원)");
		choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}
	
	/**
	 *  사용자가 원하는 도형을 입력받아
	 *  도형의 넓이를 출력해주는 메소드!
	 *  도형별 객체생성하여 프린트!
	 */

	public void operator() {
		
		switch (choice()) {
		case 1:
			new RecArea();
			break;
		case 2:
			new SquArea();
			break;
		case 3:
			new TriArea();
			break;
		case 4:
			new CirArea();
			break;
		default:
			System.out.println("4가지중 한가지만 입력하세요!");
			break;
		}
	}
	

}
