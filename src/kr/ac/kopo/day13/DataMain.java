package kr.ac.kopo.day13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Dog {
	private String name;
	private int age;

	Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name : " + name + ", age : " + age;
	}

}

public class DataMain {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
//		System.out.println("c : "+ c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;   // 0~11
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK)-1; // 일(1) ~토(7)
		
		
		 String[] dayArr = {"일","월","화","수","목","금","토"};
		
		
		System.out.println(year+"년"+month+"월"+date+"일(" +dayArr[day]+"요일)");
	
		
		// 2021년 5월 5일 무슨요일?
		c.set(2021, 4, 5);
		day = c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("2021년 5월 5일은 " + dayArr[day]+ "요일입니다.");
		
//		5월의 마지막 날은 몇일???
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("5월은"+lastday +"일로 구성되어 있습니다!");
		
		//2월의 마지막 몇일?
		c.set(c.MONTH, 2-1);    // 2021년 2월 24일로 변경
		lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("2월은"+lastday +"일로 구성되어 있습니다!");
		
		Date d = c.getTime(); //calendar객체를 Date객체로 나오게 하고 싶을대 
		
		String pattern = "yyyy년 MM월 dd일(E)  HH시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String data = sdf.format(new Date());
		System.out.println(data);
		
		data = sdf.format(d);
		System.out.println(data);
		
//		Dog dog = new Dog("멍이", 3);
//		System.out.println("Dog : " + dog); // 주소값이 나옴 출력문에 객체 명을 쓰면 dog == dog.toString()과 같은 결과 값이 나옴

		// 오늘은 2021년 3월 24일 입니다!
//		Date d = new Date();
//		System.out.println("d : " + d); // data의 toString은 object에서 오버라이딩하여 날짜값이 나옴!
//		
//		int year = d.getYear()+1900;
//		int month = d.getMonth()+1;
//		int date = d.getDate();
//		System.out.println("오늘은 : " +year +"년 " +month +"월 " + date +"일");
		
//		Calendar Cd = new Calendar(); //  추상 클래스이므로! 객체 생성 불가!
		
	}

}
