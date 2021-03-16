package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class IceCreamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IceCream ic = new IceCream();
		//키보드 입력 받으면서 문제가 생길거에요!!!
		//nextLine()의 문제
		System.out.print("아이스크림 몇 개 구입할거야? : ");
		int num = sc.nextInt();
		IceCream[] Ic = new IceCream[num];
		for (int i = 0; i < Ic.length; i++) {
			Ic[i] = new IceCream();
			System.out.println("***"+(i+1)+"번째 아이스크림 구매 정보 입력");
			System.out.print("아이스크림명 : ");
			sc.nextLine(); //nextLine()의 ln기능에 의한 넘어감(두 번 작성)
			Ic[i].name = sc.nextLine();  
			System.out.print("아이스크림 가격 : ");
			Ic[i].price = sc.nextInt();
		}
		System.out.println();
		System.out.println("< 총 4개의 아이스크림 구매정보 출력 >");
		System.out.println("번호\t"+"아이스크림\t"+"아이스크림 가격");
		int idx = 1;
		int result = 0;
		for (IceCream i : Ic) {
			System.out.println( idx++ +"\t"+i.name+"\t\t"+i.price);
			result += i.price;
		}
		System.out.println("총 계 : "+ result + "원");
		
		

	}

}
