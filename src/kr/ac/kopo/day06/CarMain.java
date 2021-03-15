package kr.ac.kopo.day06;


//실행 클래스
//

public class CarMain {

	public static void main(String[] args) {
		//참조변수를 이용하여 변수값을 초기화하는 것임!!!  (참조변수.~~~)
		Car c = new Car(); // 눈에 보이는 자동차 한대를 만듬(Heap 영역에)
		
		c.name = "쏘나타";
		c.price = 3200;
		c.company = "현대";		
		Car c2 = new Car();
		c2.name = "K5";
		c2.price = 3000;
		c2.company = "기아"; 
		
		//c = c2; //Shallow Copy
		
		System.out.println("모델명 : "+c.name +", 가격 : "+c.price +"만원, 제조사 : "+ c.company);
		System.out.println("모델명 : "+c2.name +", 가격 : "+c2.price +"만원, 제조사 : "+ c2.company);
		
		
		
		
	}

}
