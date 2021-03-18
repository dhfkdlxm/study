package kr.ac.kopo.day08;



import java.util.Scanner;

//아이스크림 가게 객체
public class IcecreamMarket {
  Icecream[] iceArr; //아이스크림 정보를 받는 배열 멤버변수 생성
  Scanner sc = new Scanner(System.in);
  // 정수입력받는 Method 하나, 
  
  int inputInt(String msg) {
	  System.out.print(msg);
	  int num = sc.nextInt();
	  sc.nextLine();
	 return num;
  }
  
  /**
   * 
   * @param msg
   * @return
   */
  
  String inputString(String msg) {
	  System.out.print(msg);
	  String str = sc.nextLine();
	  return str;
  }
  
  void doSomething() {
	  //손님이 아이스크림을 구매하면 구매정보 출력
	  buy();
  }
  
  void info() {
	  System.out.println("< 총"+ iceArr.length + "개 구매정보 출력 >");
	 System.out.println("번호 \t아이스크림명\t아이스크림가격");
	 int no = 1;
	for(Icecream ice : iceArr) {
		//객체.멤버변수 : 썩 좋은 방법은 아님! 멤버변수가 변경될 수 있기 때문에 메소드를 호출하는 것이 효율적!
		//객체 멤버변수로 다른 클래스에서 호출하는 경우 멤버변수 변경시 유지보수가 어려움!!!
		/* System.out.println(no++ + "\t" + ice.name + "\t" + ice.price); */
		System.out.println(no++ + "\t" + ice.getName() + "\t" + ice.getPrice());
	}
  }
  
  
  void buy() {
	  //아이스크림 몇개 구매 하실거에요?
	  int cnt = inputInt("아이스크림 몇개 구입할래? : ");
	  iceArr = new Icecream[cnt];
	  
	  for (int i = 0; i < iceArr.length; i++) {
		System.out.println("***" + (i+1) + "번째 아이스크림 구매정보 입력 ***");
		String name = inputString("아이스크림명 : ");
		int price = inputInt("아이스크림 가격 : ");
		iceArr[i] = new Icecream(name, price); 		
	}
  }
  
}
