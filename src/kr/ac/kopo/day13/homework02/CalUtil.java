package kr.ac.kopo.day13.homework02;

import java.util.Calendar;
import java.util.Iterator;

public class CalUtil {
	private int year, month;
	private String[] dayArr = { "일", "월", "화", "수", "목", "금", "토" };
	private String[][] monthArr;
	Calendar c = Calendar.getInstance();

	public CalUtil() {
		// TODO Auto-generated constructor stub
	}

	public CalUtil(int year, int month) {
		this.year = year;
		this.month = month;
		setMonth();
	}

	public CalUtil(int year) {
		this.year = year;
		setYear();
	}

	public void setMonth() {
		System.out.println("<<" + year + "년 " + month + "월" + ">>");
		c.set(year, month - 1, 1);
		int day = 0;
		int firstday = c.get(Calendar.DAY_OF_WEEK) - 1;
		int lastdate = c.getActualMaximum(Calendar.DAY_OF_MONTH)-1;
		monthArr = new String[6][dayArr.length];
		for (int i = 0; i < dayArr.length; i++) {
			System.out.print(dayArr[i] + "\t");
		}
		
		for (int i = 0; i < monthArr.length; i++) {
			for (int j = 0; j < monthArr[i].length; j++) {
				if (i == 0 && j < firstday) {
					monthArr[i][j] = " ";
				} else if (day > lastdate) {
					monthArr[i][j] = " ";
				} else {
					monthArr[i][j] = Integer.toString(++day);
				}
			}
		}
		System.out.println();
		printMonth();
	}

	public void setYear() {
		for (month = 1; month <= 12; month++) {
			setMonth();
			System.out.println();
		}

	}

	public void printMonth() {
		for (
				int i = 0; i < monthArr.length; i++) {
			for (int j = 0; j < monthArr[i].length; j++) {
				System.out.print(monthArr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
