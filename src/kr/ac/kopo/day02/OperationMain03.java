package kr.ac.kopo.day02;

import java.util.Scanner;

/* ¦�� ã�Ƴ���
 * 
 * ������ �Է��ϼ��� : 12
 * 12�� ¦������
 * ������ �Է��ϼ��� : 5
 * 5�� ¦������ : false
 * ��, 0�̳� ������ ���� False ���
*/

public class OperationMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		"������ �Է��ϼ��� : " ������ ���
		System.out.print("������ �Է��ϼ��� : ");
//		����ڷ� ���� ���� �Է� ����
		int InputNum = sc.nextInt();
		boolean result = (InputNum >0 && InputNum%2 ==0);
//		�������� �ľ� �޼ҵ� Ȱ�� Ȧ¦ �Ǻ�(������)
		System.out.println(InputNum +"�� ¦������ : " +  result);
		

	}
}
