package kr.ac.kopo.day17.exam;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
		File fileObj = new File("iodata");
		
		System.out.println("파일 이름 :"+ fileObj.getName());
		System.out.println("파일 디렉토리 :"+fileObj.getParent());
		System.out.println("파일 경로 :"+fileObj.getPath());
		System.out.println("파일 경로 :"+fileObj.getAbsolutePath());
		System.out.println("파일 zmrl :"+ fileObj.length());
		System.out.println("");
		
		
		
		
		
	}

}
