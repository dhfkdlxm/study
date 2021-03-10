package kr.ac.kopo.day02.homework;

import java.util.Scanner;

/* 
 * 2960원 어치 물건을 사고 5000원 을 입력했을때 거스름돈과
 * 1000, 500, 100, 50, 10원의 개수를 출력하는 코드를 작성
 * 
 * 물건값을 입력 : 2960
 * 지불한 액수를 입력 : 5000
 * <방식1>
 * 거스름돈 : 2040원
 * 1000원 : 2개
 * 500원 : 0개
 * 100원 : 0개
 * 50원 : 0개
 * 10원 : 4개
 * <방식2> - 거스름돈이 있는 것만  출력
 * 거스름돈 : 2040원
 * 1000원 : 2개
 * 10원 : 4개
 * -----------
 * 물건값을 입력 : 2960
 * 지불한 액수를 입력 : 2000
 * 
 * 960원이 부족합니다.
 
*/

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값을 입력 :");
		int price = sc.nextInt();
		System.out.print("지불한 액수를 입력 : ");
		int pay = sc.nextInt();
		int change = pay - price;
		int change1000 = change / 1000;
		int change500 = change % 1000 / 500;
		int change100 = change % 1000 % 500 / 100;
		int change50 = change % 1000 % 500 % 100 / 50;
		int change10 = change % 1000 % 500 % 100 % 50 / 10;

		/*
		 * [방식1] 전체 나타내기
		 */
		System.out.println("[방식1]");
		if (price > pay) {
			System.out.println((price - pay) + "원이 부족합니다.");
		} else {
			System.out.println("1000원 :" + change1000);
			System.out.println("500원 :" + change500);
			System.out.println("100원 :" + change100);
			System.out.println("50원 :" + change50);
			System.out.println("10원 :" + change10);
		}

		/*
		 * [방식2] 0단위 없애기 궁금증. 좀더 짧은 코드가 있을까 1) change 1000~10까지 변수줄이기 2) 이중 if문
		 * 줄이기(3항연산자?고민해보기)
		 */
		System.out.println("[방식2]");
		if (price > pay) {
			System.out.println((price - pay) + "원이 부족합니다.");
		} else {
			if (change1000 > 0)
				System.out.println("1000원 :" + change1000);
			if (change500 > 0)
				System.out.println("500원 :" + change500);
			if (change100 > 0)
				System.out.println("100원 :" + change100);
			if (change50 > 0)
				System.out.println("50원 :" + change50);
			if (change10 > 0)
				System.out.println("10원 :" + change10);
		}

	}

}
