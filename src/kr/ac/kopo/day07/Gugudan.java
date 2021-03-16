package kr.ac.kopo.day07;

import java.util.Scanner;

/* 객체 지향 스럽게?
*/
public class Gugudan {
	Scanner sc = new Scanner(System.in);
	void print(int dan) {
		System.out.println("***" + dan + "단 ***");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
		System.out.println();
	}

	void print() {
		print(2,9);
	}
	/**
	 * 시작단~종료단 구구단 출력
	 * @param sDan 시작단
	 * @param eDan 종료단
	 */
	void print(int sDan, int eDan) {
		for (int j2 = sDan; j2 <= eDan; j2++) {
			print(j2);
		}
	}
	
	int getDan() {
		int dan= sc.nextInt();
		sc.nextLine();
		return dan;
	}
	
	int getDan(String msg) {
		System.out.println(msg);
		return getDan();
	}

}
