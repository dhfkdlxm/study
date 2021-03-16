package kr.ac.kopo.day06;


//참조 클래스 : 눈에보이는 사물을 추상화 시킨것

public class Car {
//	추상화 : 멤버변수(CC. 모델명, 문짝개수, 차 색깔, 차 제조사, 전륜, 후룬 사륜구동?, 타이어 크기)
	//     메소드(시동을 켠다, 끈다) 
//	딜러입장에서의 차 : 차모델명, 차량가격, 차량 제조사(추상화)
	public String name;    // 차 모델명
	int price;      // 차량 가격
	String company; //차량 제조사
}
