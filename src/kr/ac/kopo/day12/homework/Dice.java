package kr.ac.kopo.day12.homework;

public class Dice implements Game{
	private int me =(int)(Math.random()*6+1); 
	@Override
	public int startGame(int you) {
		if(me == you) {
			System.out.println("You win");
			return 1;
		}else {
			System.out.println("You lose");
			return 0;
		}
		
	}

}
