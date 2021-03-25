package kr.ac.kopo.day13.homework;

import java.util.Scanner;

public class LottoNumberMain {
	public static void main(String[] args) {
		while (true) {
			try {
				lottoNumInput();
				break;
			} catch (LottoNumException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public static void lottoNumInput() throws LottoNumException {
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();

		if (num > 0 && num < 46) {
			System.out.println(num + "를 포함해서 로또번호들을 추출하겠습니다.");
			
		} else {
			throw new LottoNumException("1 - 45사이만 가능합니다." + num + "은 올바르지 않습니다");
		}

	}
}
