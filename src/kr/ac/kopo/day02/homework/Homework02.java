package kr.ac.kopo.day02.homework;

import java.util.Scanner;

/* 반지름을 입력받아 원둘레와 원넓이를 출력하는 코드를 작성(단, 원주울을 상수변수를 사용해서 작성)
 * 반지름을 입력 : 1
 * 반지름이 1일때, 원둘레는 xxxx이고, 원넓이는 xxxx이다.
*/

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력 : ");
		int radius = sc.nextInt();
		double CirCum = 2 * radius * Math.PI;
		double CirArea = Math.PI * Math.pow(radius, 2);
		System.out.println("반지름이 " + radius + "일때 원둘레는 " + CirCum + "이고" + "원넓이는 " + CirArea + "이다.");

	}

}
