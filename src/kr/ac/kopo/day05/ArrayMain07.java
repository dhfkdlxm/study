package kr.ac.kopo.day05;

public class ArrayMain07 {
	
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		
		
		for(int num : a) {
			num += 100;
			System.out.println(num);
		}
	
		
		
		// a배열의 모든 요소에 100을 더하자
		/*
		 * for(int i = 0; i < a.length ; i++) { a[i] += 100; }
		 */
		
		for(int num : a) {
			System.out.println(num);
		}
		
		
		/*
		 * for (int i = 0; i < a.length; i++) { System.out.println(a[i]); }
		 */
		
	}

}
