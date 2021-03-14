package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain06 {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = {5,7,8,9,29, 23};
		// a와 b를 합치려면?
		// c = {10,20,30,5,7,8,9,29,23}
		// arraycopy 메소드 사용
		int[] c = new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println("a : "+Arrays.toString(a));
		System.out.println("b : "+Arrays.toString(b));
		System.out.println("c : "+Arrays.toString(c));
		// 반복문을 돌려 복사하는법		
		/*
		int loc = 0;
		for(int i = 0; i < a.length; i++) {
			c[loc++] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[loc++] = b[i];
		}
		 */
	}

}
