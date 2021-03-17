package kr.ac.kopo.day08;
//아이스크림 정보 객체
public class Icecream {
	
	String name;
	int price;
	
	
	void set(String n, int p) {
		name = n;
		price = p;
	}
	
	 String getName() {
		return name;
	}
	 int getPrice() {
			return price;
		}
	
}
