package kr.ac.kopo.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionMain04 {

	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("a.txt"); //checked exception(컴파일 시점 예외)
		//파일이 없을 수도 있기 때문에 예외처리가 필요함
		}catch(FileNotFoundException fnfe) {
			try {
				FileWriter fw = new FileWriter("error.log");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
