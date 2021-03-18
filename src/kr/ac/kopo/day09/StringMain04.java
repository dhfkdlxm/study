package kr.ac.kopo.day09;

import java.util.Arrays;

//주의사항 : 해당 메소드를 사용한다고 기존 str의 문자열이 바뀌지 않음!
public class StringMain04 {

	public static void main(String[] args) {
		String str = "hello world";
		
		System.out.println("str : "+ str);
		
		
		System.out.println("< 문자열. substring() Method >");
		// substring(a, b) : a~(b-1)까지의 문자열을 반환
		String subStr = str.substring(1, 5);
		System.out.println("substring(1,5) : [" + subStr+"]");
		subStr = str.substring(6);
//		==> subStr = str.substring(6, str.length());
		System.out.println("substring(6) : [" + subStr+"]");
		
		
		
		System.out.println("< 문자열. concat() Method >");
		// concat() : 해당 문자를 합쳐줌!!! 
		String str1 = "hello";
		String str2 = "!!!!";
		
		str = str1 + str2;
		str = str1.concat(str2);
		System.out.println("str1+str2 : "+ str);
		System.out.println("concat(str1,str2) : "+ str);
		
		System.out.println("< 문자열. replace() Method >");
		
		//replace("a","b") : 문자열의 해당 a문자를 b문자로 치환 
		str = "hello world";
		System.out.println("replace() 전  "+ str);
		str = str.replace("l", "rrrrrrr");
		System.out.println("replace() 후  "+ str);
		
		
		System.out.println("< 문자열. trim() Method >");
		////trim() 문자열 중 공백 제거해줌!
		str = "       hello        ";
		System.out.println("trim() 전 ["+ str +"] 길이 : " + str.length());
		str = str.trim();
		System.out.println("trim() 전 ["+ str +"] 길이 : " + str.length());
	
		System.out.println("< 문자열. toLowerCase(), toUpperCase() Method >");
		// toLowerCase() 소문자 , toUpperCase() 대문자로 반환해줌 
		str = "Hello World";
		System.out.println("str : " + str);
		System.out.println("toLowerCase() : " + str.toLowerCase());
		System.out.println("toUpperCase() : " + str.toUpperCase());
		
		//split("a") a문자를 기준으로 문자열을 나눠줌
		System.out.println("< 문자열. Split() Method >");
		str = "홍길동전:허균:조선시대";
		String[] strArr = str.split(":");
		System.out.println(Arrays.toString(strArr));
		
		String ip = "192.168.5.203";
		String[] ipArr = ip.split("\\.");
		System.out.println(Arrays.toString(ipArr));
		
		
		System.out.println("< 문자열. String.valueOf(int, double, ...) Method >");
		int num = 123;
		String strNum = num + "";
		System.out.println(strNum + 100);
		strNum = String.valueOf(num);
		System.out.println(strNum + 10);
		System.out.println(String.valueOf(true)+false);
		
	}
}
