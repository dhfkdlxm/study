package kr.ac.kopo.day04.exam;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][4];
		System.out.println("arr : " +arr);
		System.out.println("arr.lenght : " +arr.length);
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] :"+arr[i]);
			System.out.println("arr["+i+"].lenght :"+arr[i].length);
			
		}

	}

}
