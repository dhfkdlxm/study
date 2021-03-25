package kr.ac.kopo.day13;

public class ExceptionMain03 {

	public static void main(String[] args) {
		System.out.println("main start...");
		for(int i = -2; i < 3 ; i++) {
			System.out.println(i + "번째 반복문 수행중");
			try {
				System.out.println(10/i); 
			}catch(Exception e){
				System.out.println("예외 발생");
				break;
			}finally {
				System.out.println("반복문 수행중");
			}
		}
		System.out.println("main end...");
	}

}
