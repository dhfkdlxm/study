package kr.ac.kopo.day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {

	public static void main(String[] args) {

		System.out.println("입력을 하세요. ctrl+z를 누르면 종료됩니다.");

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);

		try {
			while (true) {
				int c = isr.read();
				if (c == -1)
					break;
				System.out.print((char) c);

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		/*
		 * InputStream is = System.in; while(true) { int c = is.read(); //1dbyte씩 읽어와서
		 * 숫자로 인식! if( c== -1) break; System.out.print((char)c);
		 * 
		 * }
		 */
	}

}
