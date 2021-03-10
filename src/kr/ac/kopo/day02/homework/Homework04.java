package kr.ac.kopo.day02.homework;

import java.util.Scanner;

/* 두개의 정수를 입력받아 첫번재 정수가 두번재 정수의 배수인지 판단하는 프로개름 작성
 * (조건연산자, if문을 이용하여 작성)
 * 첫번째 정수 입력 : 12
 * 두번째 정수 입력 : 4
 * 
 * 12가 4의 배수인지 판단결과 ; 참
 * 12가 4의 배수인지 판단결과 ; true
 * -------------------------
 * 첫번째 정수 입력 : 12
 * 두번째 정수 입력 : 5
 * 
 * 12가 4의 배수인지 판단결과 ; 거짓
 * 12가 4의 배수인지 판단결과 ; flase
 * ------------------------------
 * 첫번째 정수 입력 : 12
 * 두번째 정수 입력 : 0
 * 
 * 12가 4의 배수인지 판단결과 ; 거짓
 * 12가 4의 배수인지 판단결과 ; flase
*/

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
//If문
		System.out.println("[IF문]");
		if (num2 <= 0) {
			System.out.println(num1 + "가 " + num2 + "의 배수인지 판단결과 : " + false);
		} else {
			System.out.println(num1 + "가 " + num2 + "의 배수인지 판단결과 : " + times(num1, num2));
		}
//조건식
		System.out.println("[조건식]");
		System.out.println(num1 + "가 " + num2 + "의 배수인지 판단결과 : " + (num2<=0 ? false : times(num1, num2)));
	}

	static boolean times(int num1, int num2) {
		return num1 % num2 == 0;
	}

}
