package kr.ac.kopo.day07;
//기능클래스 : method만 집합
public class Method {

	void call() {
		System.out.println("call()메소드 호출...");
	}
	void call(int i ) {//메소드 오버로딩
		System.out.println("call(int)메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double)메소드 호출...");
	}
	
	void call(String s) {
		System.out.println("call(String)메소드 호출...");
	}
	
//	void call(char a) {
//		System.out.println("call(Char)메소드 호출...");
//	}
	
	void call(String s, boolean b) {
		System.out.println("call(String, boolean)메소드 호출...");
	}
	
	
}
