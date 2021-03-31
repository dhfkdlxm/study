package kr.ac.kopo.day13;

import java.io.FileReader;


abstract class Parent{
	public abstract void print();
	public abstract void scan() throws Exception;
	//추상 메소드중 사용 시 문제가 농후할때 throws 사용
	//(ex 외부에서 값을 받아오는 scan()에 올바른 값이 아닐수도 있는 경우가 있음)
}

class Child extends Parent{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scan() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}







public class ExceptinMain05 {
	
	public static void main(String[] args) {
//		b();
//		try {
//		} catch (Exception e) {
//			System.out.println("main() 예외처리..");
//			e.printStackTrace();
//		}
//		a();
		Child obj = new Child();
		obj.print();
		a();
		try {
			obj.scan();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    //checked exception
	}
	
	
	public static void b() throws Exception{
		System.out.println("b() 메소드 호출....");
		String str = null;
		System.out.println(str.charAt(0));
		System.out.println(1/0);
	}
	
	public static void a() {
		System.out.println("\"\"a() 메소드 호출....");
		
		
		try {
			FileReader fr = new FileReader("a.txt") ;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
