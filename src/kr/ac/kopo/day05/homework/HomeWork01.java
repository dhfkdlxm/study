package kr.ac.kopo.day05.homework;

import java.util.Scanner;

//1. 0~99사이 정수를 5개 입력받아 다음과 같이 출력하는 코드를 작성
//<입력>
//  1's 정수 : 36
//  2's 정수 : 1000
//  // 0~99사이의 정수만 입력하세요 
//  2's 정수 : 92
//  3's 정수 : 20
//  4's 정수 : 8
//  5's 정수 : -2
//  // 0~99사이의 정수만 입력하세요
//  5's 정수 : 200
//  // 0~99사이의 정수만 입력하세요
//  5's 정수 : 62
//  
//  <Print>
//  36 92 20 8 62
//  
//  <Reverse>
//  62 8 20 29 63
public class HomeWork01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int []array = new int[5];
		int []r_array = new int[array.length];
		System.out.println("0~99사이 정수를 5개 입력받아 다음과 같이 출력하는 코드 작성");
		
		while(count <5) {
			System.out.print(count+1 + "'s 정수 : ");
			array[count] = sc.nextInt();
			if (array[count] < 0 || array[count]>100) {
				System.out.println("0~99사이의 정수만 입력하세요");
			}else {
				count++;
			}
		}
		System.out.println("<PRINT>");
		for (int i=0 ;  i <array.length ; i++) {
			System.out.print(array[i] + " ");
			r_array[4-i] = array[i]; 
		}
		System.out.println();
		System.out.println("<REVERSE>");
		for (int i : r_array) {
			System.out.print(i + " ");
		}
		
	}

}
