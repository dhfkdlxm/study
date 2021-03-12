package kr.ac.kopo.day04.homework;

public class HomeWork03 {

	public static void main(String[] args) {
		/*
		 * 3) 달팽이가 100M깊이의 우물에 빠졌습니다. 
		 *    달팽이가 5m/h 우물을 기어오릅니다.
		 *    올라간 높이가 50m미만일 때는 -1m/h
		 *              50m이상일 때는 -2m/h
		 *    달팽이는 몇시간 만에 우물을 탈출할까요?
		 *    
		 *    출력
		 *    [1시간후] 달팽이가 올라간 총 높이 : 4M
		 *    [2시간후] 달팽이가 올라간 총 높이 : 8M
		 *    .....
		 *    [X시간후] 달팽이가 올라간 총 높이 : 100M or 101M or 102M
		 *    
		*/
		int now_height = 0;
		int time = 1;
		while(now_height<100) {
			int velocity = now_height<50 ? 4:3;		
			now_height = velocity*time;
			System.out.println("["+time+"]시간 후 올라간 총 높이"+now_height +"M");
			time++;
		}	
	}

}
