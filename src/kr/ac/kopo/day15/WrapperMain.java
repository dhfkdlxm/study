package kr.ac.kopo.day15;

import java.util.ArrayList;
import java.util.List;

/*
 * 기본자료형              Wrapper 
 * boolean             Boolean
 * char				   Character
 * byte					Byte
 * short				Short
 * int				    Integer
 * long					Long
 * float				Float
 * double				Double
 * 
 * 
*/

public class WrapperMain {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		int i = 123;
		Integer i2 = new Integer(123);
		Integer i3 = 123; // auto boxing
		int i4 = new Integer(123); // auto unboxing
		

		System.out.println("i : " + i);
		System.out.println("i2 : " + i2);
		System.out.println("i3 : " + i3);
		System.out.println("i4 : " + i4);
		
		String str = "10234";
		
		//리턴 값이 다름
		int num = Integer.parseInt(str);	//기본 자료형 int형
		System.out.println(100+num);
		num = Integer.valueOf(str);         //참조 자료형 Integer(참조자료형)
		System.out.println(100+num);
	}

}
