package kr.ac.kopo.day03.homework;

public class Homework06 {
	
// 6번
//	*   *********
//	 *   *******
//	 *    *****
//	 *     ***
//	 *      *
	public static void main(String[] args) {
		System.out.println("문제 6번");
		
//		���� 6��
		for (int i = 0; i < 5; i++) {
//			빈칸찍는 부분 0~5 증가
			for (int j = 0; j < i + 1; j++) {
				System.out.print(' ');
			}
//			별찍는 부분 9~1 2씩감소
			for (int j = 0; j < 9 - (2 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
