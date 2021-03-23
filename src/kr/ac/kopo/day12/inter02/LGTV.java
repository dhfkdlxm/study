package kr.ac.kopo.day12.inter02;

public class LGTV implements TV {
	
	public LGTV() {
		System.out.println("LGTV를 구매 하였습니다.");
	}
	
	

	@Override
	public void powerOn() {
		System.out.println("LG티비가 켜졌다!");
	}

	@Override
	public void powerOff() {
		System.out.println("LG티비가 꺼졌다!");
	}

	@Override
	public void channelUP() {
		System.out.println("LG티비가 채널 업!!");
	}

	@Override
	public void channelDown() {
		System.out.println("LG티비 채널 다운!!");
	}

	@Override
	public void soundUp() {
		System.out.println("LG티비 소리 업!!");
	}

	@Override
	public void soundDown() {
		System.out.println("LG티비 소리 다운!!");
	}

	@Override
	public void mute() {
		System.out.println("LG티비 ");
	}

}
