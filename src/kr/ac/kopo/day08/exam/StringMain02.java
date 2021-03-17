package kr.ac.kopo.day08.exam;

import java.util.Arrays;
import java.util.Scanner;

public class StringMain02 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		char[] chars = new char[str.length()];
		
		str.getChars(0, str.length(), chars, 0);
		for (int i = 0; i < chars.length; i++) {
			chars[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(chars));
		System.out.println("["+str + "]의 길이 : "+str.length());
		System.out.println("0번째 위치한 문자 : "+ str.charAt(0));
		System.out.println("7번째 위치한 문자 : "+ str.charAt(7));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력 : ");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);

	}

}
