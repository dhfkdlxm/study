package kr.ac.kopo.day05.homework;

import java.util.Scanner;

// 2> 다음과 같은 결과를 보이는 프로그램 작성

//짝수 몇개 입력 : 5
//홀수 몇개 입력 : 4

//num1 : 12
//num2 : 9
//num3 : 67
//num4 : 20
//num5 : 9
//num6 : 31
//num7 : 24
//num8 : 5
//// 홀수가 다 찼습니다. 짝수를 입력하세요
//num8 : 11
//num8 : 10
//num9 : 6
//
//< Print>
//12 20 24 10 6(입력 순서) 31 9 67 9(입력 역순)
//
public class HomeWork02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수 개수 입력 : ");
		int even_number = sc.nextInt();
		System.out.print("홀수 개수 입력 : ");
		int odd_number = sc.nextInt();
		int[] print = new int[odd_number + even_number];
		int count = 0;
		int odd_count = 0;
		int even_count = 0;
		while (count < print.length) {
			System.out.print("num" + (count + 1) + " : ");
			int input = sc.nextInt();
			if (input % 2 == 0 && even_count < even_number) {
				print[even_count] = input;
				even_count++;
			} else if(input%2 != 0 && odd_count < odd_number){
				print[print.length - odd_count - 1] = input;
				odd_count++;
			}else {
				System.out.println("다른 수를 입력하세요");
				continue;
			}
			count = even_count + odd_count;
		}
		System.out.println();
		System.out.println("<PRINT>");
		for (int i : print) {
			System.out.print(i + " ");
		}

	}

}
