package kr.ac.kopo.day12.inter02;

public class Usermain {

	public static void main(String[] args) {
		// 다형성의 장점!
		// 객체가 삼성//LG건 상관없이 모든 메소드 사용가능;
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channelDown();
		tv.soundDown();
		tv.channelUP();
		tv.soundUp();
		tv.mute();
		tv.mute();
		tv.mute();
		tv.soundUp();
		tv.mute();
		tv.soundDown();
		tv.powerOff();
		tv.copyright();
	}
}
