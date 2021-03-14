package kr.ac.kopo.day05.homework;

//3. 소수는 1~(판단정수) 사이의 소수로만 나누어 약수가 존재하지 않는다는 규칙성을 이용함
//  2~100사이의 소수를 구분 및 출력하는 코드를 작성(배열)
public class HomeWork03 {

	public static void main(String[] args) {
		int[] array = new int[99];
		for (int i = 0; i < array.length; i++) {
			array[i] = i+2; 
			for (int j = 2; j <= array[i] / 2; j++) {
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
