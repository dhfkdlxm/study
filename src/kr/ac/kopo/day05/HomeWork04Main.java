package kr.ac.kopo.day05;

import java.util.Scanner;

public class HomeWork04Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input_num = sc.nextInt();
		boolean check = true;
		for (int i = 2; i <= input_num/2; i++) {
			if(input_num%i==0) {
				check = false;
				break;
			}
		}
		System.out.println(input_num+"은(는) "+ (check ? "소수입니다.":"소수가 아닙니다."));
		
		
		
	}

}
