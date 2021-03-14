package kr.ac.kopo.day04.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		/*
		 * 2) 4개의 정수를 입력받아 가장 큰 수를 출력
		 * - 입력 : 4개의 정수를 입력하세요 : 12 6 2 54
		 * - 출력 : 가장 큰수 : 54
		 * 
		*/
		
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		int num4= sc.nextInt();
		int max = 0;
		
		if (max<num1) {
			max = num1;
		}if(max<num2) {
			max =num2;
		}if(max<num3) {
			max =num3;
		}if(max<num4) {
			max =num4;
		}
		System.out.println("가장 큰수 : "+ max);
		
//		<교수님 코드>
		System.out.println("<교수님 코드>");
//		4강전
		Random r = new Random(); //임의의 값을 추출할때 쓰는 코드
		//1~100사이의 정수를 4개 추출
		int r_num1 = r.nextInt(100)+1; //양의 값 (0~99) + 1 → (1~100)	 나타나게 해주기위해;
		int r_num2 = r.nextInt(100)+1;
		int r_num3 = r.nextInt(100)+1;
		int r_num4 = r.nextInt(100)+1;
		
		max = r_num1>r_num2 ? r_num1 : r_num2;
		if(max < r_num3) {
			max = r_num3;
		}
		if(max < r_num4) {
			max = r_num4;
		}
		 System.out.println(max);
		
		
		int max1 = r_num1 > r_num2? r_num1 : r_num2;
		int max2 = r_num3;
		if(r_num4 >r_num3) {
			max2 = r_num4;
		}
		
		System.out.println("가장 큰 수 : "+(max1>max2 ? max1 : max2)); //음의 값을 추출할땐 "-" 추가
		
		
		
		
//		<배열 활용 코드>
//		Scanner sc = new Scanner(System.in);
//		int[] input = new int[4];
//		int max = 0;
//		System.out.print("4개의 정수를 입력하세요 : ");
//		for (int i = 0; i < input.length; i++) {
//			input[i] = sc.nextInt();
//			if(max < input[i]) {
//				max = input[i];
//			}				
//		}
//		System.out.println("가장 큰수 : "+ max);
	}

}
