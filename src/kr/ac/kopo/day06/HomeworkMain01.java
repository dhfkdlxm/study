package kr.ac.kopo.day06;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수 몇개 입력 : ");
		int even = sc.nextInt();
		System.out.println("홀수 몇개 입력 : ");
		int odd = sc.nextInt();
		
		
		/* 
		 * 짝수 : nums[0] ~ nums[even-1]		
		 * 홀수 : nums[even] ~ nums[nums.length-1]
				
		*/		
		int[] nums = new int[even+odd];
		int evenIdx = 0, oddIdx = nums.length -1;
		for (int i = 0; i < nums.length; i++) {
			System.out.print("num "+(i+1)+" : ");
			int num = sc.nextInt();
			
			if(num%2 ==0 && evenIdx < even) {
				nums[evenIdx++] = num;
				
			}else if(num%2 == 1 && oddIdx >= even){
				nums[oddIdx--] = num;
			}else {
				i--;
			}
		}
		System.out.println("< 총" + nums.length +"개 정수 출력 >");
		for (int i : nums) {
			System.out.print(i+" ");
		}
		
		
	}
	
	
}
