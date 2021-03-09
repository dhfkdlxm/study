package kr.ac.kopo.day02;

public class IFMain01 {

	public static void main(String[] args) {
		int a = 10, b = 10;
		/* a 가 b보다 크다면  a출력
		 * a가 b보다 작다면 b출력
		 * a와 b가 같다면 0출력
		*/
//		System.out.println(a>b ? a : (a<b ? b :0));
		
		if(a>b) {
			System.out.println(a);
		}else if(a<b){
			System.out.println(b);
		}else {
			System.out.println(0);
		}
		
		
		
		
	/*	int a = 10, b = 5;
//		System.out.println("Max : " + ( a>b ? a : b));
		if (a > b) {
			System.out.println("Max : " + a);
		} else {
			System.out.println("Max : " + b);
		}*/
	}

}
