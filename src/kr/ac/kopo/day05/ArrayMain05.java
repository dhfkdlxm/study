package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		
		int[] a = {10,20,30};
		int[] b;
		
		// deep copy
		b = new int[a.length]; //shallow copy
		System.arraycopy(a, 0, b, 0, a.length);		
		
		
		/*
		 * for (int i = 0; i < b.length; i++) { b[i] = a[i]; }
		 */		
		System.out.println("a :"+ a);
		System.out.println("b :"+ b);

		
		System.out.println("a :"+ Arrays.toString(a));
		System.out.println("b :"+ Arrays.toString(b));
		
		
		  ++b[0];
		  
		  System.out.println("a :"+ Arrays.toString(a)); System.out.println("b :"+
		  Arrays.toString(b));
		 
	}

}
