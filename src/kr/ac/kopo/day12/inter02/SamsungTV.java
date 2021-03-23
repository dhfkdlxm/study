package kr.ac.kopo.day12.inter02;

public class SamsungTV implements TV {
	private String modelName;
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private boolean IsMute;
	private int currentVolumeSize;
	
	public SamsungTV() {
		System.out.println("삼성TV 구매 완료");
		modelName = "삼성 TV";
		power = false;
		volumeSize = 10;
		channelNo = 3;
	}

	@Override
	public void powerOn() {
		power = true;
		System.out.println("삼성티비가 켜졌다!");
		info();
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("삼성티비가 꺼졌다!");
	}

	@Override
	public void channelUP() {
		System.out.println("Channel Up");
		channelNo++;
		channelNo = ++channelNo%101;
		info();
	}

	@Override
	public void channelDown() {
		System.out.println("Channel Down");
		channelNo--;
		if (channelNo == 0) channelNo = 100;
		info();
	}

	@Override
	public void soundUp() {
		System.out.println("Volume Up");
		if(IsMute) {
			volumeSize = currentVolumeSize;
			IsMute = false;
		}
		if (volumeSize < TV.MAX_VOLUME_SIZE) {
			volumeSize++;
		}
		info();
	}

	@Override
	public void soundDown() {
		System.out.println("Volume Down");
		if(IsMute) {
			volumeSize = currentVolumeSize;
			IsMute = false;
		}
		if (volumeSize > TV.MIN_VOLUME_SIZE) {
			volumeSize--;
		}
		info();

	}

	@Override
	public void mute() {
		System.out.println("MUTE");
		/* volumeSize = MIN_VOLUME_SIZE; */
		
		if (IsMute) {
			System.out.println("음소거 해제");
			volumeSize = currentVolumeSize;
		}else {
			System.out.println("음소거 중....");
			currentVolumeSize = volumeSize;
			volumeSize = TV.MIN_VOLUME_SIZE;
		}
		IsMute = !IsMute;
		
		
		info();

	}

	private void info() {
		System.out.println("채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}

}
