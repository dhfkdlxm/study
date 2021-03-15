package kr.ac.kopo.day06;

public class CellphoneMain {

	public static void main(String[] args) {
		
		Cellphone cell = new Cellphone(); 
		cell.name = "홍길동";
		cell.phone = "010-1111-2222";
		cell.company = "삼성";
		
		//"윤길동", "010-3333-4444", "애플" 가지는 객체 cell2
		Cellphone cell2 = new Cellphone();
		cell2.name = "윤길동";
		cell2.phone = "010-3333-4444";
		cell2.company = "애플";
		//"한길동", "010-5555-6666", "엘지" 가지는 객체 cell3
		Cellphone cell3 = new Cellphone();
		cell3.name = "한길동";
		cell3.phone = "010-5555-6666";
		cell3.company = "엘지";
		
		System.out.println("소유주명 : " + cell.name +", 전화번호 : "+ cell.phone + ", 제조사 : "+ cell.company);
		
		System.out.println("소유주명 : " + cell2.name +", 전화번호 : "+ cell2.phone + ", 제조사 : "+ cell2.company);
		System.out.println("소유주명 : " + cell3.name +", 전화번호 : "+ cell3.phone + ", 제조사 : "+ cell3.company);
		System.out.println("===============================================================================");
		Cellphone[] cell_Arr= {cell, cell2, cell3};
		for(int i = 0; i < cell_Arr.length; i++) {
			System.out.println("소유주명 : " + cell_Arr[i].name +", 전화번호 : "+ cell_Arr[i].phone + ", 제조사 : "+ cell_Arr[i].company);
		}
		for (Cellphone h : cell_Arr) {
			System.out.println("소유주명 : " + h.name +", 전화번호 : "+ h.phone + ", 제조사 : "+ 	h.company);
		}
		
		
		
	}

}
