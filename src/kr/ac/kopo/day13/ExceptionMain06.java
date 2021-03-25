package kr.ac.kopo.day13;

import java.util.Scanner;

/* 
 * 등록할 ID를 입력하세요 : hello1234
 * ID는 최대 8글자만 가능합니다.
 * 
 *  등록할 ID를 입력하세요 : hello123
 *  ID를 등록하였습니다.
*/
public class ExceptionMain06 {
	
	final static void register() throws CheckIDException{
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 ID를 입력하세요 : ");
		String id = sc.nextLine();
		
		if(id.length() > 8) {
			throw new CheckIDException("ID는 최대 8글자만 가능합니다.");
		}
		
		
		System.out.println("ID를 등록하였습니다.");
	}
	
	static void register(int a) {
		
	}
	
	

	public static void main(String[] args) {
		try {
			register();	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	

//		try {
//			if (id.length() > 8) {
//
//				throw new CheckIDException("ID는 최대 8글자만 가능합니다");// 예외가 발생되었어!!! 던져!
//			}
//		
//		} catch (Exception e) {
//			e.printStackTrace();
////			System.out.println(e.getMessage());
//		}

	}
}
