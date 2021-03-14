package kr.ac.kopo.day05.homework;
import java.util.Scanner;

//5. 별그리기 관련 문제를 라인수를 입력받아 출력하는 코드 작성
//   3~20사이의 라인수를 입력받고, 짝수 입력시 하나 작은 홀수로 구성
//   20라인을 입력받으면 19줄의 모양으로 구성
//   
//   ----*
//   ---**
//   --***
//   -****
//   *****
//   
//   
//    *****            *********
//    ****              *******          
//    ***	             *****
//    **                  ***
//    *                    *
//	  **                  ***
//	  ***                ***** 
//	  ****              *******
//	  *****            *********

/*
 * 
 * 
 * 
*/
public class HomeWork05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("라인 수를 입력하세요 : ");
		int line = sc.nextInt(); // 라인수 입력
		if (line % 2 == 0) { // 짝수입력시 -1
			line -= 1;
		}
//		별찍기 문제 5-1 
		System.out.println("모형 1");
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//      별찍기 문제 5-2 
		System.out.println("모형 2");
		int line2 = line / 2 + 1;
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line2; j++) {
				System.out.print("*");
			}
			line2 = i < line / 2 ? --line2 : ++line2;
//			line2 = i<line/2 ? line2-- : line2++;  //후위연산자 증감 반영이 안되는 이유????!?!?
			System.out.println();
		}

//		별찍기 문제 5-3
		System.out.println("모형 3");
		for (int i = 0; i < line; i++) {
			if (i < line / 2 + 1) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < line - 2 * i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < line - i-1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2*i-line+2; j++) {
					System.out.print("*");
				}

			}
			System.out.println();
		}
//		별찍기 문제 5-3.2번째 풀이
		System.out.println("모형 3_2");
		int space=0;
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				if(space>j) {
					System.out.print(" ");
				}else if(line-space>j){
					System.out.print("*");
				}
			}
			System.out.println();
			if (i<line/2) {
				space++;
			}else {
				space--;
			}
		}
	}

}
