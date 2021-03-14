package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 
 *  *  7번
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
*/
public class Homework07 {

	public static void main(String[] args) {
		System.out.println("문제 7번");
//		문제 7
		for (int i = 0; i < 9; i++) {

			if (i < 5) {
				for (int j = 0; j < 4 - i; j++) {
					System.out.print(' ');
				}
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < i - 4; j++) {
					System.out.print(' ');
				}
				for (int j = 0; j < 17 - (2 * i); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
//		문제 7 다른 풀이
			System.out.println("7번 다른풀이");
			int n = 1;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 5 - n; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * n - 1; j++) {
					System.out.print("*");
				}

				System.out.println();
				if (i < 4) {
					n++;
				} else {
					n--;
				}
			}
		
		System.out.println("7번 3번째풀이");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int space = height / 2;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				if (j <= space - 1 || j >= height - space) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			if (i < 4) {
				space--;
			} else {
				space++;
			}

		}
	}

}
