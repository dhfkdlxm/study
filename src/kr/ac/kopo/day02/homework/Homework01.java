package kr.ac.kopo.day02.homework;

import java.util.Iterator;
import java.util.Scanner;

/*
 * - ���� : 2���� ������ �Է¹޾� ������ ���� ����ϴ� �ڵ带 �ۼ�
   - ù��° ���� : 12
   - �ι�° ���� : 6
   - 12 +5 = 17
   - 12- 5 = 7
   - 12*5 = 60
   - 12/5 = 2.40 // �Ҽ��� ��°¥�� ���� ���
   - 12 % 5 = 2
*/

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù���� ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι��� ���� : ");
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
