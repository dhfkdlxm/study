package kr.ac.kopo.day16;

import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

// iodate/FileIOMain04.java → 
public class FileIOMain07 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		

		try {
			fr = new FileReader("iodata/FileIOMain04.java");
			fw = new FileWriter("iodata/FileIOMain04.java.txt");
			
			while(true) {
				int c = fr.read();
				if(c==-1) break;
				fw.write(c);				
			}
			fw.flush();
			System.out.println("파일 복사를 완료 하였습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fr, fw);

		}
	}

}
