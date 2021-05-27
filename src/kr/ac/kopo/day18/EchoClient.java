package kr.ac.kopo.day18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("192.168.217.242", 10001);

			// 키보드로 입력받을 객체
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		
			// client가 키보드로 입력받은 데이터를 서버에게 전달
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			
			
			// 서버에서 재전송한 데이터 수신 객체
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				System.out.print("메시지 입력(종료시 quit) : ");
				String msg = keyboard.readLine();
				
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("서버연결을 종료합니다.");
					socket.close();
					break;
					
				}
				
				pw.println(msg);
				pw.flush();
				
				String echoMsg = br.readLine();
				System.out.println("서버에서 전송한 메시지는 : " + echoMsg);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
