package kr.ac.kopo.day05.homework;

import java.util.Arrays;

public class HomeWork04_2 {

	public static void main(String[] args) {
		int[] array = new int[99]; 
		// 배열에 2~100까지 넣어!
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 2;
		}
		// 순차적으로 배수를 지워!
		int cnt = 0; // 성능확인용!
		/*
		 * for (int i = 0; i < array.length; i++) {
		 * }
		 */
		int i = 0;
		while (array[i]  < 50) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == 0 || array[j] == 0) { // 0으로 나누지 못하게 하고, 나누려는 수가 0이면 넘어가라!
					continue; // continue와 break의 차이???
				} else if (array[j] % array[i] == 0) { // 배수일때 0을 넣어라!
					array[j] = 0;
				}
				cnt++; // 성능 확인용 반복횟수 카운트!
			}
			i++;
		}
		System.out.println(cnt);
		System.out.println(Arrays.toString(array));
	}

}
