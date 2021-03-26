package kr.ac.kopo.day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain03 {

	// Cat.png → Cat3.png 복사
	public static void main(String[] args) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			
			long start = System.currentTimeMillis();
			fis = new FileInputStream("iodata/Cat.png");
			fos = new FileOutputStream("iodata/Cat2.png");

			// 버퍼를 사용하기 위해 객체 연결
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			// 복사수행

			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}

			long end = System.currentTimeMillis();
			System.out.println("Cat2.png에 복사 완료...");
			System.out.println("소요시간 : "+ (end-start)/1000. +"초");
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			FileClose.close(bis,fis);
			FileClose.close(bos,fos);
			
//			if (bis != null) {
//				try {
//					bis.close();
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
//			}
//			if(bos!= null) {
//				try {
//					bos.close();
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
//			}
//			if (fos != null) {
//				try {
//					bis.close();
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
//			}
//			if(fis!= null) {
//				try {
//					bos.close();
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
//			}
			
			
			
			
		}

	}

}
