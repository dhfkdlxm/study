package kr.ac.kopo.day14.homework;

import java.util.Scanner;

public class CalendarView {
	Scanner sc = new Scanner(System.in);

	public int getInt(String msg) {
		System.out.println(msg);
		int no = sc.nextInt();
		sc.nextLine();
		return no;
	}

	public void process() {
		CalendarUtil util = new CalendarUtil();
		while (true) {
			int command = getInt("항목을 선택하세요(1.특정연도 2.특정월 3.종료) : =>");
			int year, month;
			switch (command) {
			case 1:
				year = getInt("년도를 입력하세요 : ");
				util.showDayByYear(year);
				System.out.println("1번 선택");
				
				util.showDayByYear(year);
				break;
			case 2:
				year = getInt("년도를 입력하세요 : ");
				month = getInt("월을 입력하세요 : ");
				util.showDayByMonth(year, month);
				System.out.println("2번 선택");
				break;
			case 3:
				System.out.println("프로그램을 종료합니다!");
				System.exit(0);
//				break loop;
				
			}
		}
	}
}
