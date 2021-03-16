package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		int num1 = cal.getNum("정수입력 : ");
		int num2 = cal.getNum("정수입력 : ");
		cal.print(num1, num2, '+', cal.add(num1, num2));;
		cal.print(num1, num2, '-', cal.minus(num1, num2));;
		cal.print(num2, num2, '*', cal.multi(num1, num2));;
		cal.print(num1, num2, '/', cal.div(num1, num2));;
		cal.print(num1, cal.prime(num1));
		cal.print(num2, cal.prime(num1));
	}

}
