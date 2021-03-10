package kr.ac.kopo.day03.exam;

import java.util.Iterator;

/*  12345
 *  23456
 *  34567
 *  45678
 *  56789
 *  
 *  56789
/*  45678 
 *  34567
 *  23456
 *  12345
 *  
 *  
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 *  
 *  
 *  4번
 *  
 *  
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 *  for 2 if 1
 *  
 *  
 *  
 *  5번
 *  *****
 *   ****
 *    ***
 *     **
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 *  
 *  6번
 *  *********
 *   *******
 *    *****
 *     ***
 *      *
 *  
 *  
 *  7번
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 *       
 *  8번
 *   *_______*
 *   **_____**
 *   ***___***
 *   ****_****
 *   *********
 *   ****_****
 *   ***___***
 *   **_____**
 *   *_______*
 *  
 *  
 *  
 *  
 */

public class ExamMain01 {

	public static void main(String[] args) {
//		문제 1번
		System.out.println("문제1");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + j + 1);
			}
			System.out.println();
		}
		System.out.println();

//		문제 2번
		System.out.println("문제2");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + j);
			}
			System.out.println();
		}
		System.out.println();

//		문제3번
		System.out.println("문제3");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("문제4번");
//		문제 4번

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
//		 문제5번 for3+if2

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

		System.out.println("문제 6번");
//		문제 6번
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j < 9 - (2 * i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("문제 7번");
//		문제7번
		for (int i = 0; i < 9 ; i++) {
			if (i<5) {
				for (int j = 0; j <4-i; j++) {
					System.out.print(' ');
				}
				for (int j = 0; j < 2*i+1; j++) {
					System.out.print("*");
				}				
			}else {
				for (int j = 0; j <i-4; j++) {
					System.out.print(' ');
				}
				for (int j = 0; j < 17-(2*i); j++) {
					System.out.print("*");
				}				
				
			}
			System.out.println();
		}
		
		System.out.println("문제 8번");
//		8번
		for (int i = 0; i < 9; i++) {
			if (i<5) {
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < 7-(2*i); j++) {
					System.out.print("_");
				}
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}				
			}else {
				
				for (int j = 0; j < 9-i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < (2*i)-9; j++) {
					System.out.print("_");
				}
				for (int j = 0; j < 9-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
		
		
		
	}

}
