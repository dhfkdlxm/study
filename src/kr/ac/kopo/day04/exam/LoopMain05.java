package kr.ac.kopo.day04.exam;

public class LoopMain05 {

	public static void main(String[] args) {
		
		loop01 : for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if(j==2) {
					break loop01;
				}
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
