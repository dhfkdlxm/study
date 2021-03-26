package kr.ac.kopo.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
   iodata/cat.png → iodata/cat2.jpg 복사
   cat.png : 입력 장치  cat2.png : 출력장치
   
   
   작업 순서
   1. stream open : 객체를 만드는것!
   2. read/write  : 
   3. stream close
   
*/
public class FileIOMain02 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {

			long start = System.currentTimeMillis();

			// 1. Stream Open
			fis = new FileInputStream("iodata/Cat.png");
			fos = new FileOutputStream("iodata/Cat1.png");

			// 2. read / write
			while (true) {
				int c = fis.read();
				if (c == -1)
					break;
				fos.write(c);
			}
			long end = System.currentTimeMillis();

			System.out.println("복사완료");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		} finally {
			// 3. stream close
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
