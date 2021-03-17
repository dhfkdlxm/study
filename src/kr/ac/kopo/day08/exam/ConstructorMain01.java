package kr.ac.kopo.day08.exam;

class Car2 {
	//JVM이 만들어주는 디폴트 생성자 
	Car2(){
		System.out.println("Car() 생성자 호출");
	}
	
	Car2(String s){
		System.out.println("Car(String) 생성자 호출");
	}
	
	Car2(int i , String s){
		System.out.println("Car(int, String) 생성자 호출");
	}

	void Car2() {
		//일반 Method와 동일하게 취금
		System.out.println("생성자가 아닌 일반 메소드  Car() 호출!!>>>!!!>>>>!!!!");
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {
		
		Car2 c = new Car2();
		Car2 c2 = new Car2("소나타");
		Car2 c3 = new Car2(1000, "모닝");
		
		c.Car2();
		c2.Car2();
		c3.Car2();
		
	}
}
