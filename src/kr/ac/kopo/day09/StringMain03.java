package kr.ac.kopo.day09;

public class StringMain03 {

	public static void main(String[] args) {

		String str = "hello";
		String str2 = "HELLO";
		/*
		 * String str3 = new String("hello"); String str4 = new String("hello");
		 * 
		 * //주소 비교하는 것 if (str == str2) { System.out.println("str == str2"); }else {
		 * System.out.println("str != str2"); } // 실행 결과 : str == str2
		 * 
		 * if (str3 == str4) { System.out.println("str == str2"); }else {
		 * System.out.println("str != str2"); } // 실행 결과 : str3 != str4
		 */

		System.out.println("str : [" + str + "]");
		System.out.println("str2 : [" + str2 + "]");

		// 문자열 비교 .equals
		str.equals("hello");
		"hello".equals(str); // 상수를 두고 변수를 쓰는게 권고사항!
		boolean bool = str.equals(str2);
		boolean bool2 = str.equalsIgnoreCase(str2);
		if (bool) {
			System.out.println("equals() : str == str2");
		} else {
			System.out.println("equals() : str != str2");
		}

		// 문자열 대/소문자 무시 .equalsIgnoreCase()
		if (bool2) {
			System.out.println("equalsIgnoreCase() : str == str2");
		} else {
			System.out.println("equalsIgnoreCase() : str != str2");
		}

		// equals Method는 무조건 가지고 있음
		// Object로부터 무조건 상속받는 Method임!

		// startsWith: hello로 시작되는 지 비교하기 위해 확인하는 Method
		str = "hello!!";
		str2 = "hello world";

		String sub = "hello";
		bool = str.startsWith(sub);
		if (bool) {
			System.out.println("[" + str + "]은 [" + sub + "] 문자열로 시작합니다.");

		} else {
			System.out.println("[" + str + "]은 [" + sub + "] 문자열로 시작하지 않습니다.");
		}

		// endswith : 문자열의 끝부분을 비교할때 쓰는 메소드 (뒤에 확장자 확인을 할때 주로 사용)
		str = "hello.jpg";
		bool = str.endsWith(".txt");
		if (bool) {
			System.out.println("[" + str + "]은 텍스트 파일입니다.");
		} else {
			System.out.println("[" + str + "]은 텍스트 파일이 아닙니다.");
		}

		// compareTo : 유니코드 값을 비교하여 문자열의 사전적 순서를 결정(길이와는 상관x)
		str = "boat";
		str2 = "board";

		int compare = str.compareTo(str2);
		System.out.println(compare);
		if (compare == 0) {
			System.out.println(str + "==" + str2);
		} else if (compare < 0) {
			System.out.println(str + "<" + str2);

		} else { // compare > 0
			System.out.println(str + ">" + str2);
		}

		String[] names = { "강길동", "홍길동", "홍길순", "김길동", "윤길동", "박홍철", "홍길동" };

		System.out.println("< 이름이 홍길동인 사람 검색 >");
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("홍길동")) {
				System.out.println( (i+1)+ "번째, "+names[i]);
			}
		}
		System.out.println("< 홍씨성을 가진 사람 검색 >");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름이 길동인 사람 검색 >");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		//.contains("a") : "a"가 포함되었는지 판별
		System.out.println("< 홍이 포함된 사람 검색 >");
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		
		//indexOf("문자") : '문자'의 시작 위치를 알 수 있음
		str = "hello world";
		
		int searchIdx = str.indexOf("o");
		System.out.println("문자열 : "+ str);
		System.out.println("\"o\" indexOf 위치 : " + searchIdx);
		
		//indexOf("문자",시작위치) 시작위치 이후부터의 "문자"의 위치를 알수 있음
		searchIdx = str.indexOf("o", 5);
		System.out.println("\"o\" indexOf(5) 위치 : " + searchIdx);
		searchIdx = str.lastIndexOf("o");
		System.out.println("\"o\" lastIndxOf 위치 : " + searchIdx);

		str = "hello world";
		char ch = 'l';
		System.out.println("<"+str +"에서 ["+ch+"] 위치 >");
		searchIdx = str.indexOf(ch);
		while(searchIdx != -1) {
			System.out.println("검색된 위치"+searchIdx);
			searchIdx = str.indexOf(ch, searchIdx+1);
		}
		//=================================================
		System.out.println("<"+str +"에서 ["+ch+"] 위치 >");
		searchIdx = -1;
		while((searchIdx=str.indexOf(ch, searchIdx+1)) != -1) {
			System.out.println("검색된 위치"+searchIdx);
		}

		System.out.println("<"+str +"에서 ["+ ch + "] lastIndexOf 위치 >");
		searchIdx = str.length();
		while((searchIdx = str.lastIndexOf(ch, searchIdx-1)) != -1) {
			System.out.println("검색된 위치"+searchIdx);
		}
		
	}

}
