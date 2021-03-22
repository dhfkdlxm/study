package kr.ac.kopo.day10.homework;

import java.util.Random;
import java.util.Scanner;

public class AreaCal {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	private int a = ran.nextInt(8) + 2;
	private int b = ran.nextInt(8) + 2;

	public AreaCal() {

	}
	/**
	 *  직사각형 면적 출력
	 */
	public void recArea() {
		System.out.println("가로 "+a+", 세로 "+b+"의 직사각형 면적은"+ (a*b)+" 입니다." );

	}
	/**
	 *  정사각형 면적 출력
	 */
	public void squArea() {
		System.out.println("가로 "+a+"의 정사각형 면적은"+ (a*a)+" 입니다." );
	}
	/**
	 *  삼각형 면적 출력
	 */
	public void triArea() {
		System.out.println("가로 "+a+", 세로 "+b+"의 삼각형 면적은"+ (a*b/2)+" 입니다." );
	}
	/**
	 *  원 면적 출력
	 */
	public void cirArea() {
		System.out.println("반지름 "+a+"의 원 면적은"+ ((int)Math.PI * 2 ^ 2)+" 입니다." );
	}
	/**
	 *  사용자가 어떤 도형의 넓이를 원하는지 입력받는 메소드
	 */
	public int choice() {
		System.out.println("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원");
		return sc.nextInt();
	}

	
	/**
	 *  사용자가 원하는 도형을 입력받아
	 *  도형의 넓이를 출력해주는 메소드!
	 */
	
	public void operator() {
		
		switch (choice()) {
		case 1:
			recArea();
			break;
		case 2:
			squArea();
			break;
		case 3:
			triArea();
			break;
		case 4:
			cirArea();
			break;
		default:
			System.out.println("4가지중 한가지만 입력하세요!");
			break;
		}
	}

}
