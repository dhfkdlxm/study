package kr.ac.kopo.day04.exam;

import java.util.Arrays;

public class Arraymain04 {

	public static void main(String[] args) {

		
		String[] strArr = { "폴리텍", "데이터분석", "자바" };

		System.out.println("strArr 주소 : " + strArr);
		System.out.println("배열의크기 : " + strArr.length);

		System.out.println("<방식 1>");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(i + 1 + "번째 문자열 : " + strArr[i]);
		}
		System.out.println("<방식 2>");
		for (String str : strArr) {
			System.out.println(str);
		}
		System.out.println("<방식 3>");
		System.out.println(Arrays.toString(strArr));
		
		
	}

}
