package kr.ac.kopo.day03.homework;

import java.util.Iterator;

//*  8번
//*   *_______*
//*   **_____**
//*   ***___***
//*   ****_****
//*   *********
//*   ****_****
//*   ***___***
//*   **_____**
//*   *_______*
//*  


public class Homework08 {

	public static void main(String[] args) {
		System.out.println("문제 8번");
		int x = 0;
		int y = 9;
		int z = 9;
		for (int i = 0; i < z; i++) {
			for (int j = 0; j < z; j++) {
				if(j<=x) {
					System.out.print("*");
				}else if(j>=y-1) {
					System.out.print("*");
				}else {
					System.out.print("_");
				}
			}System.out.println();
			if(i<=3) {
				++x;
				--y;
			}else {
				--x;
				++y;
			}
		}
		System.out.println();
		

		
		
	}

}
