package kr.ac.kopo.day09;

public class StringMain05 {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 100000; i++) {
			str += i;
//			str = str.concat(String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println(str);
		System.out.println("소요시간 : " + (end - start) / 1000.0 + "초");
		
		//소요시간 : 3.923초
		
		//==================================================================================
		//StringBuffer에서는 +연산자를 쓸수 없음!
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i<100000; i++ ) {
			sb.append(i);
			
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000.0 + "초");
		
		//소요시간 : 0.003초
		
		
		
		
	}
}
