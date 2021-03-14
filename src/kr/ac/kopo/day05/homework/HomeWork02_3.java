package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeWork02_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//2번
		System.out.println("2 >>>");
		int even, odd;
		System.out.println("짝수 몇개 입력  : ");
		even = sc.nextInt();

		System.out.println("홀수 몇개 입력  : ");
		odd = sc.nextInt();
		
		int idx = 1;
		int[] num = new int[even+odd];
		int count = 0;
		int count2 = num.length-1;
		while(even > 0 || odd > 0) {
			System.out.println("num"+idx+" : ");
			int n = sc.nextInt();
			
			if(n % 2 == 0 && even > 0) {
				num[count] = n; 
				even--;
				count++;
			}else if(n % 2 == 1 && odd > 0) {
				num[count2] = n;
				count2--;
				odd--;
			}else {
				continue;
			}
			
			idx++;
		}
		
		System.out.println("< PRINT >");
		for(int i = 0; i < idx-1; i++) {
			System.out.print(num[i]+" ");
		}

	}

}
