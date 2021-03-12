package kr.ac.kopo.day03.homework;


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
		
	}

}
