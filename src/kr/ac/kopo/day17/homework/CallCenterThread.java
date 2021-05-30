package kr.ac.kopo.day17.homework;

import java.util.Iterator;
import java.util.Random;

public class CallCenterThread {
	public static int totalSum;
	
	
	public int getDonation() {
		Random ran = new Random();
		int don = (ran.nextInt(9)+1)*1000;
		return don;
	}
	
	public void getCall(int i) {
		int result = 0;
		int don = 0;
		for (int j = 0; j < 10; j++) {			
			don = getDonation();
			System.out.println(i+"번 콜센터 :" + don +"원을 받았습니다.");
			result += don;
		}
		System.out.println(i +"번 콜센터 총 성금액은 " + result +"원 입니다");
		totalSum += result;
		
	}
	
	
}
