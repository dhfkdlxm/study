package kr.ac.kopo.day09.homework;

public class StringUtil {
	//8번
	public static int checkChar(String strData, char ch) {
		//문자열의 각 내용들을 비교하여 입력받는 char c값과 동일한 char의 개수를 리턴한다
		//대소문자 구별하여 비교한다
		// 처리결과
		// 입력스트링 : String strData = "Hello Word Java";
		// a. ch = 'o'인경우  2리턴 	
		// b. ch = 'W'인경우  1리턴
		int cnt = 0;
		for (int i = 0; i < strData.length(); i++) {
			if(ch == strData.charAt(i)) {
				cnt++;
			}
		}
		return cnt;
	}
	//9번
	public static String removeChar(String oriStr, char delChar) {
		//문자열(oriStr)의 내용 중 주어진 문자(delChar)를 삭제한다.
		// 삭제된 내용으로 문자열의 내용을 변경한다. 
		
		// 입력 스트링 : String oriStr = "hello World Java";
		// a. delchar = 'l'인경우 Heo Word Java 리턴
		// b. delchar = 'o'인 경우 Hell Wrld Java 리턴
		StringBuffer strBuf = new StringBuffer();
		for (int i = 0; i < oriStr.length(); i++) {
			if(delChar != oriStr.charAt(i)) {
				strBuf.append(oriStr.charAt(i));
			}
		}
		return strBuf.toString();
	}
	//1번
	public boolean isUpperChar(char c) {
		return c>= 65 && c<=90;
	}
	//2번
	public boolean isLowerChar(char c) {
		return c>=97 && c<=122;
	}
	//3번
	public int max(int i, int j) {
		return i>j ? i : j;
	}
	//4번
	public int min(int i, int j) {
		return i<j ? i : j;
	}
	//5번
	public String reverseString(String str) {
		StringBuffer strBf = new StringBuffer();
		for (int i = str.length()-1; i >= 0 ; i--) {
			strBf.append(str.charAt(i));
		}
		str = strBf.toString();
		return str;
	}
	//6번
	public String toUpperString(String str) {
		char[] chars = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			chars[i]=str.charAt(i);
			if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				chars[i] -= 32;
			}			
		}
		return new String(chars);
	}
	//7번
	public String toLowerString(String str) {
		char[] chars = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			chars[i]=str.charAt(i);
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				chars[i] += 32;
			}			
		}
		return new String(chars);
	}
	
	
}
