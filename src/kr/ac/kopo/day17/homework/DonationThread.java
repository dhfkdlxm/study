package kr.ac.kopo.day17.homework;

public class DonationThread extends Thread  {
	CallCenterThread cct = new CallCenterThread();
	private int type;
	private int result;
	public DonationThread(int type) {
		this.type = type;
	}


	@Override
	public void run() {
		cct.getCall(type);
	}
	

}
