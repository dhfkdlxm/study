package kr.ac.kopo.day02;

import java.util.Scanner;

/* 
 * �����ϴ� ������ �Է� : Spring
 * ���� 3��~5������ �Դϴ�.
*/
public class SwitchMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϴ� ������ �Է� : ");
		String season = sc.nextLine();

		switch (season) {
		case "Spring":
		case "spirng":
		case "��":
			System.out.println(season + "�� 3~5������ �Դϴ�.");
		
		}

	}

}
