package kr.ac.kopo.day06;


public class CellphoneMain02 {

	public static void main(String[] args) {
	
//		Cellphone[] hpArr = new Cellphone[3];
		Cellphone[] hpArr = new Cellphone[]{new Cellphone(),new Cellphone(),new Cellphone()};
		
		
		hpArr[0].name = "홍길동";
		hpArr[0].phone = "010-1111-2222";
		hpArr[0].company = "삼성";
		
		hpArr[1].name = "윤길동";
		hpArr[1].phone = "010-3333-4444";
		hpArr[1].company = "애플";
		
		hpArr[2].name = "한길동";
		hpArr[2].phone = "010-5555-6666";
		hpArr[2].company = "엘지";
		
		for (Cellphone h : hpArr) {
			System.out.println("소유주명 : " + h.name +", 전화번호 : "+ h.phone + ", 제조사 : "+ 	h.company);
		}
		
		for (int i = 0; i < hpArr.length; i++) {
			hpArr[i] = new Cellphone();
		}
		
	}

}
