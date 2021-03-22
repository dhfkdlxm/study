package kr.ac.kopo.day11.abs02;

import java.util.Scanner;
// 프린터를 삼성으로 바꾸던, LG로 바꾸던 Hp로 바꾸면, samprint, lgprint등으로 이름을 다 바꿔줘야함
// 프린터를 사용하면, print()라는 메소드를 사용하게 만들어주면 됨!
public class Menu {

	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("LV2프린터를 선택하세요(1.LG 2.삼성 3.HP) => ");
		int no = sc.nextInt();
		sc.nextLine();
		return no;
	}

	public void choice() {
		int type = selectMenu();
		print(type);

	}

	public void print(int no) {
		Printer p=null;
		switch (no) {
		case 1:
			p = new LGPrinter();
			break;
		case 2:
			p = new SamsungPrinter();
			break;
		case 3:
//			p = new HPInkjetPrinter();
			p = new HPLaserPrinter();
			break;
		}
		if(p != null) {
			p.print();
		}else {
			System.out.println("잘못 선택하셨습니다!");
		}
	}

}
