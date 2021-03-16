package kr.ac.kopo.day07;

import java.util.Scanner;

public class BufferMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수입력 : ");
		int num = Integer      .parseInt(sc.nextLine());
		System.out.print("문자열을 입력 : ");
		String str = sc.nextLine();
		System.out.println("str : "+ str + ", num : "+num);

	}

}
