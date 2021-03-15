package kr.ac.kopo.day06;

public class HomeworkMain02 {

	public static void main(String[] args) {
//		숙제 3번!
//		소수만 기억할 수 있는 배열 작성

		int[] prime = new int[30];       //소수는 자기 숫자의 30개가 넘어가지 않음
		int loc = 0;
		
		for (int num = 2; num <= 100; num++) {
			boolean flag = true; //소수판별 변수
			for(int i = 0; i < loc ; i++) {
				if(num % prime[i] == 0) { //소수로 나누었을때 나누어 떨어진다면, 소수!
					flag = false;
					break;
				}
			}
			if(flag) {
				prime[loc++] = num;
			}
		}
		for (int i = 0; i < loc; i++) {
			System.out.print(prime[i] + " \t");
			if((i+1)%5 ==0){
				System.out.println();
			}
		}
		

	}

}
