package kr.ac.kopo.day02;

import java.util.Scanner;

/* 
 * 좋아하는 계절을 입력 : Spring
 * 봄은 3월~5월까지 입니다.
*/
public class SwitchMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 계절을 입력 : ");
		String season = sc.nextLine();

		switch (season) {
		case "Spring":
		case "spirng":
		case "봄":
			System.out.println(season + "은 3~5월까지 입니다.");
		
		}

	}

}
