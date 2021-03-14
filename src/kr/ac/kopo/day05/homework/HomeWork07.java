package kr.ac.kopo.day05.homework;

import java.util.Random;
import java.util.Scanner;

//7. 사용자가 생각하는 숫자를 컴퓨터가 맞추는 프로그램을 작성하세요. 
//* 기회는 5번!
//사용자가 생각하는 숫자가 [88] 입니까?(맞으면 0, 작으면 1, 큰수면 2)==>
//...
public class HomeWork07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int count = 5;
		int min = 1;
		int max = 100;
		System.out.println("1~100사이 숫자를 생각해주세요!");
		while(count > 0) {
			int com = ran.nextInt(max-min)+min;
			System.out.print("사용자가 생각하는 숫자가 [" + com + "] 입니까?(맞으면 0, 작으면1, 큰수면 2)");
			int user = sc.nextInt();
			
			if (user == 0) {
				System.out.println("정답은 ["+com+"] 이군요!");
				break;
			}else if(user == 1) {
				max = com-1;
			}else if(user == 2) {
				min = com+1;
			}else{
				System.out.print("0,1,2 숫자만 입력해주세요");
			}
			--count;
			if (count == 0) {
				System.out.println("끝났네요");
			}
			
		}
		

	}

}
