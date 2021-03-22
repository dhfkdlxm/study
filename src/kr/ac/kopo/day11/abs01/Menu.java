package kr.ac.kopo.day11.abs01;

import java.util.Scanner;
// 프린터를 삼성으로 바꾸던, LG로 바꾸던 Hp로 바꾸면, samprint, lgprint등으로 이름을 다 바꿔줘야함
// 프린터를 사용하면, print()라는 메소드를 사용하게 만들어주면 됨!
public class Menu {

	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("LV1프린터를 선택하세요(1.LG 2.삼성) => ");
		int no = sc.nextInt();
		sc.nextLine();
		return no;
	}

	public void choice() {
		int type = selectMenu();
		print(type);

	}

	public void print(int no) {
		switch (no) {
		case 1:
			LGPrinter lg = new LGPrinter();
			lg.lgPrint();
			lg.print();
			System.out.println("LG 선택");
			break;
		case 2:
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrint();
			System.out.println("삼성1 선택");
			break;
		default:
			break;

		}

	}

}
