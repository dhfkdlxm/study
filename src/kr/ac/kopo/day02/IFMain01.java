package kr.ac.kopo.day02;

public class IFMain01 {

	public static void main(String[] args) {
		int a = 10, b = 10;
		/* a �� b���� ũ�ٸ�  a���
		 * a�� b���� �۴ٸ� b���
		 * a�� b�� ���ٸ� 0���
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
