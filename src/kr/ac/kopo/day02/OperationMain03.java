package kr.ac.kopo.day02;

import java.util.Scanner;

/* 짝수 찾아내기
 * 
 * 정수를 입력하세요 : 12
 * 12의 짝수유무
 * 정수를 입력하세요 : 5
 * 5의 짝수유무 : false
 * 단, 0이나 음수인 경우는 False 출력
*/

public class OperationMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		"정수를 입력하세요 : " 문장을 출력
		System.out.print("정수를 입력하세요 : ");
//		사용자로 부터 정수 입력 받음
		int InputNum = sc.nextInt();
		boolean result = (InputNum >0 && InputNum%2 ==0);
//		착수유무 파악 메소드 활용 홀짝 판별(결과출력)
		System.out.println(InputNum +"의 짝수유무 : " +  result);
		

	}
}
