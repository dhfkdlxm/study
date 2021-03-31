package kr.ac.kopo.day05.homework;

//3. 소수는 1~(판단정수) 사이의 소수로만 나누어 약수가 존재하지 않는다는 규칙성을 이용함
//  2~100사이의 소수를 구분 및 출력하는 코드를 작성(배열)
public class HomeWork03 {

	public static void main(String[] args) {
		int[] array = new int[99];
		for (int i = 0; i < array.length; i++) {
			array[i] = i+2; 
			// 0 2
			// 1
			//2
			
			for (int j = 2; j <= array[i] / 2; j++) {
				// i 0 array[i] 2  j 2 ~ 1까지   0회
				// i 1 array[i] 3  j 2 ~ 1.5까지 0회 
				// i 2 array[i] 4  j 2 ~ 2      1회 4%2 array[i] = 0
				// i 3 array[i] 5  j 2 ~ 2.5    1회 5%2 array[i] = 5
				// i 4 array[i] 6  j 2 ~ 3      2회 6&2 array[i] = 0
				// i 5 array[i] 7  j 2 ~ 3.5    2회 7%2 array[i] = 7;
				// i 6 array[i] 8  j 2 ~ 4      3회 8&2 array[i] = 0;
				if(array[i]==0) {
					break;
				}else if (array[i]%j == 0) {
					array[i] = 0;
					
					break;
				}
				
			}

		}
		for (int i : array) {
			System.out.print(i+" ");
		}

	}

}
