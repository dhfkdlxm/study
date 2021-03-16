package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);

	int add(int a, int b) {
		
		return a + b;
	}

	int minus(int a, int b) {
		
		return a - b;
	}

	int multi(int a, int b) {

		return a * b;
	}

	double div(double a, double b) {

		return a / b;
	}

	boolean prime(int a) {
		boolean isprime = true;
		for (int i = 2; i < a / 2; i++) {
			if (a % (i) == 0) {
				isprime = false;
			}
		}
		return isprime;
	}

	int getNum(String string) {
		System.out.print(string);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	void print(int a, int b, char c, double d) {
		System.out.println(a+ ""+c+ b+ "="+d);
	}
	void print(int a, boolean bool) {
		System.out.println(a+" 소수체크 : " + bool );
	}
	
	
}
