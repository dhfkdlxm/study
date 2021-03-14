package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class HomeWork06 {

	public static void main(String[] args) {
		/*
		 * 10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성 [입력] 1's 정수 : 12 2's 정수 : 3 3's 정수 : 45 4's
		 * 정수 : 7 5's 정수 : 23 6's 정수 : 56 7's 정수 : 10 8's 정수 : 8 9's 정수 : 3 10's 정수 : 55
		 * 
		 * <짝수> 12 56 10 8 짝수의 총합 : xxxx <홀수> 3 45 7 23 3 55 홀수의 총합 : xxxx
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int sum = 0;
		int[] input_arr = new int[10];
		for (int i = 0; i < input_arr.length; i++) {
			System.out.print(i + 1 + "'s 정수 : ");
			input_arr[i] = sc.nextInt();
		}
		//
		System.out.println("<짝수>");
		//짝수 판별
		for (int i = 0; i < input_arr.length; i++) {
			if (input_arr[i] % 2 == 0) {
				result = input_arr[i];
				System.out.print(result + " ");
			}
			// 합계 누적
			sum += result;
		}
		System.out.println();
		//짝수의 합계
		System.out.print("짝수의 총합 : " + sum);
		
		/////홀수
		System.out.println();
		System.out.println("<홀수>");
		
		// 합계 초기화
		sum = 0;
		//홀수 판별
		for (int i = 0; i < input_arr.length; i++) {
			if (input_arr[i] % 2 != 0) {
				result = input_arr[i];
				System.out.print(result + " ");
			}
			// 합계 누적
			sum += result;
		}
		System.out.println();
		//홀수의 합계
		System.out.print("홀수의 총합 : " + sum);
	}

}
