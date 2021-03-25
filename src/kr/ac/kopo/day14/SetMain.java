package kr.ac.kopo.day14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set : 순서(x), 중복(x)
 * 장점 : 검색 속도 빠름
 * 구현 클래스 : HashSet, TreeSet
*/

public class SetMain {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		
		boolean bool =set.add("one");
		System.out.println("\"one\" 데이터 삽입 여부 : "+ bool );
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		bool =set.add("one");
		System.out.println("\"one\" 데이터 삽입 여부 : "+ bool );
		set.add("five");
		
		/*
		 * 
		 * set의 전체 데이터 출력 방식
		 * 1. 1.5버전 for문
		 * 2. Iterator 메소드 활용 
		*/
		System.out.println("\n < 1.5버전의 for문 이용 출력 > ");
		for(String str : set) {
			System.out.print(str+"\t");
		}
		
		System.out.println(" \n< iterator() 이용 출력 > ");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+"\t");
		}
		
		System.out.println("\n < toArray() 이용 출력 > ");
		Object[] arr = set.toArray();
		System.out.print(Arrays.toString(arr));
		
	}

}
