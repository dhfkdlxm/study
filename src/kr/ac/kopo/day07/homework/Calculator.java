package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	
	/**
	 *  더하기
	 * @param a 입력 정수
	 * @param b 입력 정수
	 * @return 결과 출력
	 */
	int add(int a, int b) {

		return a + b;
	}
	/**
	 *  빼기
	 * @param a 입력 정수
	 * @param b 입력 정수
	 * @return 결과 출력
	 */
	int minus(int a, int b) {
		
		return a - b;
	}
	/**
	 *  곱하기
	 * @param a 입력 정수
	 * @param b 입력 정수
	 * @return 결과 출력
	 */
	int multi(int a, int b) {

		return a * b;
	}
	/**
	 *  나누기
	 * @param a 입력 정수
	 * @param b 입력 정수
	 * @return 결과 출력
	 */
	double div(double a, double b) {

		return a / b;
	}
/**
 * 소수 구하기
 * @param a 입력 정수
 * @return 소수 여부 반환(Boolean)
 */
	boolean prime(int a) {
		boolean isprime = true;
		for (int i = 2; i < a / 2; i++) {
			if (a % (i) == 0) {
				isprime = false;
			}
		}
		return isprime;
	}

	/**
	 * 
	 * @param string 입력 멘트
	 * @return 입력값 반환
	 */
	int getNum(String string) {
		System.out.print(string);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	/**
	 * 사칙연산 결과 출력
	 * @param a 입력 정수
	 * @param b 입력 정수
	 */
	
	void printCal(int a, int b) {
		System.out.println(a+" + "+b+" = "+add(a,b));
		System.out.println(a+" - "+b+" = "+minus(a,b));
		System.out.println(a+" * "+b+" = "+multi(a,b));
		System.out.println(a+" / "+b+" = "+div(a,b));
	}
	
	/**
	 * 소수 판단 결과 출력
	 * @param a 입력 정수
	 */
	
	void prime_print(int a) {
		System.out.println(a+" 소수체크 : " + prime(a));
	}
	
	
}
