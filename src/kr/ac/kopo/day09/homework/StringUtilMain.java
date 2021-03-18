package kr.ac.kopo.day09.homework;

public class StringUtilMain {

	public static void main(String[] args) {
		StringUtil util = new StringUtil();
		// 1번
		System.out.println(util.isUpperChar('H'));
		System.out.println(util.isUpperChar('h'));
		// 2번
		System.out.println(util.isLowerChar('H'));
		System.out.println(util.isLowerChar('h'));
		//3번
		System.out.println(util.min(4, 8));
		//4번
		System.out.println(util.max(8, 4));
		//5번
		System.out.println(util.reverseString("Hello World"));
		//6번
		System.out.println(util.toUpperString("Hello World"));
		//7번
		System.out.println(util.toLowerString("Hello World"));
		//8번(checkChar)		
		System.out.println(StringUtil.checkChar("Hello World Java", 'W'));
		//9번(removeChar)		
		System.out.println(StringUtil.removeChar("Hello World Java", 'o'));

	}

}
