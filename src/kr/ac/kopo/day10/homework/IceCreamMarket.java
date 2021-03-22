package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class IceCreamMarket {
	Scanner sc = new Scanner(System.in);
	private static IceCream[] ic;
	private static int iceCnt = 0;
	private static int cliCnt = 0;
	private static int totalP = 0;

	public IceCreamMarket() {

	}

	/**
	 * 정수값 입력받는 메소드
	 * @param msg 메세지를 넣으면 같이 출력
	 * @return 입력한 int값 리턴
	 */
	public int inputInt(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	/**
	 * 문자열 입력받는 메소드
	 * @param msg 메세지를 넣으면 출력
	 * @return 입력한 String값 리턴
	 */
	public String inputN(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}

	/** 
	 *  구매 전담해주는 계산원
	 * 	구매여부를 확인하고, 구매내역 출력해줌
	 *  최종적으로 총 구매결과를 출력해줌
	 */
	public void operator() {
		while (true) {
			sale();
			print();
			String check = inputN("계속 구매할래?(Y/N)");
			if (check.equalsIgnoreCase("n")) {
				break;
			}
		}
		totalPrint();

	}

	/**
	 *  고객 한명당 구매 정보를 출력해줌
	 * 
	 */
	public void print() {
		System.out.println("< 총" + ic.length + "개 구매정보 출력 >");
		System.out.println("번호 \t아이스크림명\t아이스크림가격\t고객번호");
		int no = 0;
		for (IceCream ice : ic) {
			System.out.println(++no + "\t\t" + ice.getName() + "\t\t" + ice.getPrice() + "\t\t" + cliCnt);
		}
	}
	/**
	 *  고객한명의 구매정보를 입력받음
	 *  
	 */
	public void sale() {
		System.out.println("아이스크림 몇개 구입할래?");
		int cnt = sc.nextInt();
		sc.nextLine();
		iceCnt += cnt;
		++cliCnt;
		ic = new IceCream[cnt];
		for (int i = 0; i < ic.length; i++) {
			System.out.println((i + 1) + "번");
			String name = inputN("아이스크림 명 : ");
			int price = inputInt("아이스크림 가격 : ");
			ic[i] = new IceCream(name, price);
			totalP += price;
		}

	}
	/**
	 * 
	 */
	public void totalPrint() {
		System.out.println("총" + cliCnt + "명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림 총 개수 : " + iceCnt + " 개");
		System.out.println("총 판매액 : " + totalP);

	}

}
