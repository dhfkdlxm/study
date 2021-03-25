package kr.ac.kopo.day13.selfexam;

import java.util.Scanner;

public class SumText {
	/* 숫자를 입력받아서 아래와 같은 실행 결과가 나타나도록 SumTest 클래스의 main 메소드를 완성하십시오
	 * a. 입력받은 숫자가 홀수인 경우에는, 0 부터 입력값 까지 홀수의 합을 출력합니다.
	 *  - 예제 : 입력ㅇ ㅣ7이면 16을 출력(1+3+5+7 = 16)
	 * b. 입력받은 숫자가 짝수인 겨웅에는, 0부터 입력 값까지 홀수의 합을 출력합니다.
	 *  - 예제 : 입력이 10이면 30을 출력(2+4+6+8+10 = 30)_
	*/	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("숫자를 입력하세요. : ");
		 int num = sc.nextInt();
		 sc.nextLine();
		 int result = 0;
		 if(num % 2 == 0) {
			 for (int i = 0; i <= num; i += 2) {
				result += i;
			}
		 }else {
			 for (int i = 1; i <= num; i += 2) {
					result += i;
				} 
		 }
		 System.out.println("결과값 : " + result);
	}

}
