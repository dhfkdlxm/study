package kr.ac.kopo.day07;

public class MethodMain02 {

	public static void main(String[] args) {
		Method m = new Method();
		m.call();
		m.call(10);
		m.call(12.34);
		m.call("hello");
		m.call('A');   //묵시적 형변환 int
		int i = 'a';
		m.call("불린", true);
			
		
	}

}
