package kr.ac.kopo.day08;
//아이스크림 정보 객체
public class Icecream {
	
	String name;
	int price;
	
	Icecream() {
	
	}
	
	Icecream(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	 String getName() {
		return name;
	}
	 int getPrice() {
			return price;
		}
	
}
