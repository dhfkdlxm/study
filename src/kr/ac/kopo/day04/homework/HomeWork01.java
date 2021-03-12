package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		/*
		 * 1) 3개의 정수를 입력받아 큰 수에서 작은 수순으로 출력 - 입력 : 3개의 정수를 입력하세요 : 12 7 39 - 출력 : 39 12
		 * 7
		 */
		System.out.println("<문제1>");
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 < num2) {
			num1 += num2;
			num2 = num1 - num2;
			num1 -= num2;
		}
		if (num1 < num3) {
			num1 += num3;
			num3 = num1 - num3;
			num1 -= num3;
		}
		if (num2 < num3) {
			num2 += num3;
			num3 = num2 - num3;
			num2 -= num3;
		}
		System.out.println(num1 + " " + num2 + " " + num3);	
	}

}
