package kr.ac.kopo.day02.exam;

import java.util.Scanner;

/* 
 * ������ ����� �ð� 8�� ���� : �ɾ
 *               8�� 15�� ���� : ����Ÿ��
 *               8�� 15�� ���� : �ý�Ÿ��
 *               
 * ������ ����� �ð� �Է�(8�� 5���� 805�Է�) :756
 * �ɾ ����� �´�
*/

public class ExamMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ����� �ð� �Է�(8��5���� 805�Է�) : " );
		int time = sc.nextInt();
		
		if(time <= 800) {
			System.out.println("�ɾ ����� �´�");
		}else if(time <= 815){
			System.out.println("����Ÿ�� ����� �´�");
		}else {
			System.out.println("�ý�Ÿ�� ������´�");
		};
		

	}

}
