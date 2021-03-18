package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class IceCream {
	Scanner sc = new Scanner(System.in);
	String name;
	int price;
	
	/**
	 * 아이스크림 구매정보 입력 메소드
	 * 
	 * @param num 아이스크림 개수 입력
	 * @return 아이스크림 구매정도 배열 반환
	 */
	
	IceCream[] iceInfo(int num) {
		IceCream[] ic = new IceCream[num];
		for (int i = 0; i < ic.length; i++) {
			ic[i] = new IceCream();
			System.out.println("***"+(i+1)+"번째 아이스크림 구매 정보 입력");
			ic[i].name = getStr("아이스크림명 : ");  
			ic[i].price = getNum("아이스크림 가격 : ");
		}
		return ic;
	}
	
	/**
	 * 아이스크림 가격 입력 메소드
	 * @param IceCount 아이스크림 가격 입력 멘트
	 * @return 아이스크림 가격 반환
	 */
	
	int getNum(String IceCount) {
		System.out.println(IceCount);
		int num = sc.nextInt();
		sc.nextLine(); 
		return num;
	}

	/**
	 * 아이스크림 이름 입력
	 * @param IceCount 
	 * @return 아이스크림 이름 출력
	 */
	
	String getStr(String IceCount) {
		System.out.println(IceCount);
		String str = sc.nextLine();
		return str;
	}
	
	
	/**
	 * 아이스크림 배열을 받아 구매정보를 출력
	 * @param ic 아이스크림 배열
	 */
	void printInfo(IceCream[] ic) {
		System.out.println();
		System.out.println("< 총 4개의 아이스크림 구매정보 출력 >");
		System.out.println("번호\t"+"아이스크림\t"+"아이스크림 가격");
		int idx = 1;
		int result = 0;
		for (IceCream i : ic) {
			System.out.println( idx++ +"\t"+i.name+"\t\t"+i.price);
		result += i.price;
		}
		iceCount(result);
	}
	
	/**
	 * 아이스크림 총합 출력 받는 메소드
	 * @param result 가격 총합 출력
	 */
	void iceCount(int result) {
		System.out.println("총 계 : "+ result + "원");
	}
	
	void iceCount(Double result) {
		
	}
	
}
