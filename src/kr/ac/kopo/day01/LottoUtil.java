//선언부
package kr.ac.kopo.day01;
import java.util.Random;

/**
 *  
 * 로또와 관련된 기능을 제공하는 기능 클래스
 * 
 * @author 윤정환
 * 
*/
public class LottoUtil {
	//내용부
	private int lottoNum;
	
	// 메소드
	/**
	 * 오늘의 로또확를을 출력해주는 메소드	
	 * 
	*/
	public static void todayLotto() {
		Random r = new Random();
		System.out.println("오늘의 로또 확률 : " +  r.nextInt(101)+"%입니다.");
	}	
		
	/**
	 * 1~45사이의 로또 번호를 추출해줄수 있는 메소드	
	 * 
	*/
	public int getNum() {
		Random r = new Random();
		return r.nextInt(45)+1;  //1~45사이의 로또 번호 추출   
	}
}

//선언부
