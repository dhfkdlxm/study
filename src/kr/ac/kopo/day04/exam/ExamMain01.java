package kr.ac.kopo.day04.exam;

import java.util.Scanner;

public class ExamMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_z = sc.nextInt();
		int star = input_z / 2;
		for (int i = 0; i < input_z; i++) {
			for (int j = 0; j < star+1; j++) {
				if (j < (input_z / 2) - star) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

			if (i < input_z / 2) {
				star--;
			} else {
				star++;
			}
		}

	}
}
