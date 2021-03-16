package kr.ac.kopo.day07;


public class MethodMain01 {
	/**
	 * 임의의 문자를 반복하여 출력하는 기능
	 * 
	 * @param c   : 출력할 문자 입력
	 * @param cnt : 출력 횟수 입력
	 */
	static int printStar(char c, int cnt) {
		System.out.println();
		for (int i = 0; i < cnt; i++) {
			System.out.print(c);
		}
		System.out.println();
		return 20;
	}

	static void hello() {
		System.out.println("Hello");
	}

	static void Hi() {
		System.out.println("Hi");
	}

	static void goodBye() {
		System.out.println("Good-bye");
	}

	public static void main(String[] args) {
		printStar('*', 10);
		hello();
		printStar('!', 20);
		Hi();
		printStar('#', 100);
		goodBye();
		printStar('-', 12);
		printStar('@', 30);
		
		
	}

}
