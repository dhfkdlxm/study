package kr.ac.kopo.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain11 {

	public static void write() throws Exception {
		UserInfo user = new UserInfo("홍길동", 25, "서울시 서초구");
		FileOutputStream fos = new FileOutputStream("iodata/objectData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		oos.flush();
		System.out.println("objectData.txt 저장완료"); //객체들의 값들이 여기저기 주소값을 가지고 있기 때문에 직렬화가 필요함
		//userinfo에 serialize르 상속해서 직렬화 키워드 입력!
		FileClose.close(oos);
		FileClose.close(fos);
		
	}
	
	
	public static void read() throws Exception {
		FileInputStream fis = new FileInputStream("iodata/objectData.txt");
		//객체단위로 읽어오기
		ObjectInputStream ois = new ObjectInputStream(fis);
		UserInfo user = (UserInfo)ois.readObject();
		System.out.println("파일로드 완료...");
		System.out.println(user);
		
		FileClose.close(ois);
		FileClose.close(fis);
	}
	
	

	public static void main(String[] args) {
		try {
//			write();
			read();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
