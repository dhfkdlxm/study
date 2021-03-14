package kr.ac.kopo.day05.homework;

import java.util.Random;
import java.util.Scanner;

//숫자맞추기

public class HomeWork06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int ques = ran.nextInt(99) + 1;
		int chan = 5;
		int min = 1;
		int max = 100;
		while (chan > 0) {
			System.out.print(min + "-" + max + " : ");
			int ans = sc.nextInt();
			chan--;
			if (ans == ques) {
				System.out.println("축하합니다. 정답입니다.");
				break;
			} else if (ans < ques) {
				min = ans+1;
				System.out.println(ans + "보다 큰값입니다.");
			} else if (ans > ques) {
				System.out.println(ans + "보다 작은값입니다.");
				max = ans-1;
			}
			System.out.println("기회는" + chan + "번 남았습니다.");
			if (chan == 0) {
				System.out.println("아쉽습니다. 기회를 다 소진하셨습니다.");
				System.out.println("정답은" + ques + "입니다.");
			}
		}
	}
}
