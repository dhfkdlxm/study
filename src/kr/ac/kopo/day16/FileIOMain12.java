package kr.ac.kopo.day16;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.FileClose;

public class FileIOMain12 {

	public static void write() {

		UserVO user = new UserVO("홍길동", 26, "010-1111-2222", "서울시 서초구");
		UserVO user2 = new UserVO("구길동", 30, "010-3333-4444", "경기도 광명시 철산동");
		UserVO user3 = new UserVO("윤정환", 28, "010-5555-6666", "서울시 송파구");

		List<UserVO> list = new ArrayList<UserVO>();
		
		

		list.add(user);
		list.add(user2);
		list.add(user3);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("iodata/userList.txt");
			oos = new ObjectOutputStream(fos);
			
			for(UserVO vo : list) {
				oos.writeObject(vo);
			}
			oos.flush();
			System.out.println("userList.txt 저장완료"); // 객체들의 값들이 여기저기 주소값을 가지고 있기 때문에 직렬화가 필요함
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos);
			FileClose.close(fos);
		}

	}

	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("iodata/userList.txt");	
			ois = new ObjectInputStream(fis);
			List<UserVO> list = new ArrayList<>();
			
			
			while(true) {
				try {
					UserVO user = (UserVO)ois.readObject();
					list.add(user);
				}catch(EOFException e) {
					break;
				}
			}
			System.out.println("파일로드완료...");
			for(UserVO vo : list) {
				System.out.println(vo);
			}
			
			
			FileClose.close(ois);
			FileClose.close(fis);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			FileClose.close(ois);
			FileClose.close(fis);
		}
		
		
		
	}

	public static void main(String[] args) {
		//write();
		read();
	}

}
