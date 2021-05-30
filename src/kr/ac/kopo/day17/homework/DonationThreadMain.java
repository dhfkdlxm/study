package kr.ac.kopo.day17.homework;

public class DonationThreadMain {

	public static void main(String[] args) {
		DonationThread dt1 = new DonationThread(1);
		DonationThread dt2 = new DonationThread(2);
		DonationThread dt3 = new DonationThread(3);
		DonationThread dt4 = new DonationThread(4);

		dt1.start();
		dt2.start();
		dt3.start();
		dt4.start();
		
		try {
			dt1.join();
			dt2.join();
			dt3.join();
			dt4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("총 성금액은 "+ CallCenterThread.totalSum + "원 입니다.");

	}

}
