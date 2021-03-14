package kr.ac.kopo.day05.homework;

//4. 2~100사이의 소수 출력(교수가 설명한 규칙으로 코드를 작성할것)

public class HomeWork04 {

	public static void main(String[] args) {
		// 2~100까지 크기의 배열 작성?
//		2~100까지 숫자 저장
		// 소수의 순서대로 확인
		int[] array = new int[99];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 2;
		}
		int i =0;
		while(array[i]*2<100) {
			boolean bool = true;
			for (int j = 2; j <= array[i]/2; j++) { //소수인지 판별해
				if(array[i]%j == 0) {
					bool = false;
					break;
				}
			}
			//소수의 배수를 다 0으로 만들어!
			if(bool && array[i] !=0) {  
				for (int j = i+1; j < array.length; j++) {
					if(array[j] ==0) {     //나누려고하는 수가 0이면 넘어가자!
						continue;
					}else if(array[j]%array[i] ==0) { 
						array[j]=0;
					}
				}
			}
			i++;
			System.out.println();
			for (int k : array) {
				System.out.print(k + " ");
		}

		}
		
		

	}
}
