package kr.ac.kopo.day08.exam;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String();
		char[] chars = {'A', 'B','C', 'D','E','F'};
		String str2 = new String(chars);
		String str3 = new String(chars,1,3);
		byte[] bytes = {97, 98,99,100,101};
		String str4 = new String(bytes);
		String str5 = new String("hello");
		String str6 = "hello";
		
		System.out.println("str : ["+ str +"]");
		System.out.println("str2 : ["+ str2 +"]");
		System.out.println("str3 : ["+ str3 +"]");
		System.out.println("str3 : ["+ str4 +"]");
		System.out.println("str3 : ["+ str5 +"]");
		System.out.println("str3 : ["+ str6 +"]");
		System.out.println("str5 == str6 ? : " + (str5==str6));
	}
}
