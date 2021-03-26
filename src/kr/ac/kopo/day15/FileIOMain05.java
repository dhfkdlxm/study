package kr.ac.kopo.day15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

public class FileIOMain05 {

	public static void main(String[] args) {


		write();
		read();
		
	}
	
	public static void write() {
		Cat c = new Cat("찌니", 4, "코리안숏헤어");
		Cat c2 = new Cat("뿅이", 4, "코리안숏헤어");
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iodata/catInfo.txt");
			dos = new DataOutputStream(fos);
			
			dos.writeUTF(c.getName() + ":" + c.getAge()+ ":" + c.getKind());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(dos, fos);
			
		}
		
	}
	
	public static void read() {
		
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		
		try {
			
			fis = new FileInputStream("iodata/catInfo.txt");
			dis = new DataInputStream(fis);
			
			String data = dis.readUTF();
			System.out.println(data);
			
			String[] strArr = data.split(":");
			System.out.println(Arrays.toString(strArr));
			
			Cat d= new Cat(strArr[0], Integer.parseInt(strArr[1]), strArr[2]);
					
			System.out.println(d);
			
		} catch(Exception e){
			
			// TODO: handle finally clause
		}finally {
		}
		
		
	}
	
	

}
