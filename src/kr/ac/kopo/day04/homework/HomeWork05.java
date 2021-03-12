package kr.ac.kopo.day04.homework;

public class HomeWork05 {

	public static void main(String[] args) {
		/*
		 * 2~100사이의 소수를 출력 2 3 5 7 11 17 ...97
		 * 
		 * 2 3 5 7 11(한라인에 5개) 13 17 ...
		 * 
		 */
		int prime_num = 1;
		int line_count = 0;
		for (int i = 0; i < 100; i++) {
			int count = 0;
			prime_num = i + 1;
			for (int j = 0; j < prime_num; j++) {
				if (prime_num % (j + 1) == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(prime_num + "\t");
				line_count++;
				if (line_count == 5) {
					System.out.println();
					line_count = 0;
				}
			}

		}

	}

}
