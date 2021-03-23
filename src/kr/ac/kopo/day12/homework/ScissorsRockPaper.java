package kr.ac.kopo.day12.homework;

public class ScissorsRockPaper implements Game {
	final static int SISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	private int me = (int)(Math.random()*3+1);

	@Override
	public int startGame(int you) {
		if(me == you) {
			System.out.println("비겼습니다.");			
		}
		
		
		
		
		
		
		
		return 0;
	}

}
