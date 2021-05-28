package kr.ac.kopo.day17.homework;

import java.util.Random;

public class DonationThreadMain {

	public static void main(String[] args) {
		Random ran = new Random();
		int num = (ran.nextInt(9000)+1000)/1000*1000;
		System.out.println(num);
		

	}

}
