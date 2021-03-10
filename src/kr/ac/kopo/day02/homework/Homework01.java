package kr.ac.kopo.day02.homework;

import java.util.Iterator;
import java.util.Scanner;

/*
 * - 과제 : 2개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성
   - 첫번째 정수 : 12
   - 두번째 정수 : 6
   - 12 +5 = 17
   - 12- 5 = 7
   - 12*5 = 60
   - 12/5 = 2.40 // 소수점 둘째짜리 까지 출력
   - 12 % 5 = 2
*/

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번재 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번재 정수 : ");
		int num2 = sc.nextInt();
		int plus = num1+num2;
		int minus = num1-num2;
		int multi = num1*num2;
		double devide = (double)num1/num2;
		int rest = num1%num2;
		
		
		System.out.println(num1+"+"+num2+"=" + plus);
		System.out.println(num1+"-"+num2+"=" + minus);
		System.out.println(num1+"*"+num2+"=" + multi);
		System.out.printf("%d / %d = %.2f\n", num1, num2, devide);
		System.out.println(num1+"%"+num2+"=" + rest);
		
		

	}

}
