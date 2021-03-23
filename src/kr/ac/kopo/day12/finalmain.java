package kr.ac.kopo.day12;

import java.util.Random;

/*final*/ class Super {
	private /* final */ int MAX = 100;

	public /* final */ void info() {
		System.out.println("Super클래스에서 정의된 메소드");
	    MAX = 50; 
	}
}

class Sub extends Super {
	@Override
	public void info() {
		System.out.println("Sub클래스에서 재정의된 메소드");
	}
}
//1부터 나오게 만드는 랜덤클래스 제작
class MyRandom extends Random{
	/**
	 * bound가 10일때 1~10사이의 난수 추출
	 * @param bound 추출 정수 범위
	 * @return 1~bound 사이의 난수
	 */
	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1;
	}
}




public class finalmain {
	public static void main(String[] args) {
		/*
		 * 파이널을 쓰는 경우?
		 * 1~100사이의 난수를 발생시켜 출력하는 코드 작성
		 */
		Random r = new MyRandom();
		int rnd = r.nextInt(100);
		System.out.println("추출된 정수  :" + rnd);

	}

}
