package kr.ac.kopo.day07.homework;


public class IceCreamMain {

	public static void main(String[] args) {
		IceCream ic = new IceCream();
		int num = ic.getNum("아이스크림 몇 개 구입할거야? : ");
		IceCream[] iceInfo = ic.iceInfo(num); 
		ic.printInfo(iceInfo);
		
		
		

	}

}
