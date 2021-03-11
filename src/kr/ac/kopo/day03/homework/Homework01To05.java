package kr.ac.kopo.day03.homework;

public class Homework01To05 {

	public static void main(String[] args) {
//		문제1
		System.out.println("문제1");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + j + 1);
			}
			System.out.println();
		}
		System.out.println();

//		문제2
		System.out.println("문제2");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + j);
			}
			System.out.println();
		}
		System.out.println();

//		문제3
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("문제4");
//		문제4

		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < 9 - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("문제 4번 for2 if1");
//		문제 4번 for2 if1

		for (int i = 0; i < 9; i++) {
			int k = (i >= 5 ? 8 - i : i);
			for (int j = 0; j < k + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("문제 4번 for2 if1");
//		문제 4번 for2 if1
		
		
		
		

		System.out.println("문제 5번 for5 if1");
//		문제 5번 for5 if1
		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < i ; j++) {
					System.out.print(' ');
				}
				for (int j = 0; j < 5 - i; j++) {
					System.out.print("*");
				}

			} else {
				for (int j = 0; j < 8 - i; j++) {
					System.out.print(' ');
				}
				for (int j = 0; j < i - 3; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("문제 5번 for3 if2");
//	문제 5번 for3 if2

		for (int i = 0; i < 9; i++) {
			int k = (i >= 5 ? 8 - i : i);
			for (int j = 0; j < k; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < 5 - k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
