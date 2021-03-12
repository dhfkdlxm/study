package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		/*
		 * 4) 소수 : 1과 자기자신 외에는 약수가 존재하지 않는 양의 정수
		 * 정수를 입력하세요 : 23
		 * 
		 * 23은 소수 입니다. 
		 * 
		 * 정수를 입력하세요 : 12
		 * 12는 소수가 아닙니다.
		 * 
		 * 
		*/
		Scanner sc= new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input_num = sc.nextInt();
		int count=0;
		for (int i = 0; i < input_num; i++) {
			if(input_num%(i+1)==0) {
				count++;
			}
		}
		System.out.println(input_num+"은 "+ (count==2 ? "소수입니다.":"소수가 아닙니다."));
	}
	
}
