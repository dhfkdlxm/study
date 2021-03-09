package kr.ac.kopo.day02;

import java.util.Scanner;

public class SwichMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~3사이의 정수 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Error");

		}

		/*
		 * if (num == 1) { System.out.println("One"); } else if (num == 2) {
		 * System.out.println("Two"); } else if (num == 3) {
		 * System.out.println("Three"); } else { System.out.println("Error"); }
		 */

	}

}
