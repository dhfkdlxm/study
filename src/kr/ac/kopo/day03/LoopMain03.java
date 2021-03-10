package kr.ac.kopo.day03;

/* 12345
 * 1234
 * 123
 * 12
 * 1
*/
public class LoopMain03 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
