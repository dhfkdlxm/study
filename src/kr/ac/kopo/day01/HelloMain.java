package kr.ac.kopo.day01;

/*  
 *  출력 메소드
 *  System.out.print(); 줄바꿈 기능 없음
    System.out.println(); 줄바꿈기능(ln : enter 기능)
    System.out.printf();
    %알파벳
    
*/
public class HelloMain {

	public static void main(String[] args) {
		
		System.out.printf("\"%s\"%d\n","이것은 문자열",1000);		
		
		System.out.printf("오늘 원달러 환율은 %f 원", 1019.8);
		System.out.println();
		System.out.printf("오늘 원달러 환율은 [%7.1f]원", 1019.8);
		System.out.println();
		
		
		
		System.out.println(10.0/3.0);
		System.out.printf("%.2f\n", 10.0 / 3.0 );
		
		System.out.println();
		System.out.printf("%-10s\t%d\n", "빼빼로", 1500);
		System.out.printf("%-10s\t%d\n", "빠다코코넛", 3000);
		System.out.printf("%-10s\t%d\n", "초코로 만든 홈런볼", 2000);
		
		
		
		System.out.println("빼빼로"+"\t"+ 1500);
		System.out.println("빠다코코넛"+"\t"+ 2000);
		System.out.println("초코로 만든 홈런볼"+"\t"+ 2000);
		System.out.println(10 + "\n"+ 20);
		System.out.println();
		System.out.printf("%d%c%d",10,'\n',20);
	}

}
