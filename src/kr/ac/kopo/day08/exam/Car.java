package kr.ac.kopo.day08.exam;

/*
 * 생성자의 특징
 * 1. 클래스명 동일
 * 2. 반환형이 존재하지 않음
 * 3. 디폴트 생성자 지원(클래스 내부에 생성자가 하나도 없는 경우)
 * 4. 생성자 오버로딩 지원
 * 5. 객체의 초기화 담당
 * 생성자는 무조건 New를 통해서만 호출이 됨!
 * 
*/
public class Car {
	//JVM이 만들어주는 디폴트 생성자 
	Car(){
		System.out.println("Car() 생성자 호출");
	}
	
	Car(String s){
		System.out.println("Car(String) 생성자 호출");
	}
	
	Car(int i , String s){
		System.out.println("Car(int, String) 생성자 호출");
	}

	void Car() {
		//일반 Method와 동일하게 취금
		System.out.println("생성자가 아닌 일반 메소드  Car() 호출!!>>>!!!>>>>!!!!");
	}
	
	
	
}
