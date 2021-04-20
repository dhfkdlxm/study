package kr.ac.kopo.util;

class One{
	int num = 0;
	String name = "name";
	
	public void count() {
		System.out.println("숫자세자");
	}
	
	
}
class Two extends One{
	int num_ex = 0;
	String name = "subclass";
	
	@Override
	public void count() {
		System.out.println("자식세자");
	}
	
	
}



public class Main1 {

	public static void main(String[] args) {
		
		
		One one = new Two();
		
		//부모 멤버변수가 나옴
		System.out.println(one.name);
		System.out.println(one.num);
		one.count(); //자식이 나올거임
		
		Two two = (Two)one;
		
		System.out.println(two.name);
		System.out.println(two.num);
		System.out.println(two.num_ex);
		
		two.count();
		
		
		
		
		
	}

}
