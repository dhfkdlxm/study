package kr.ac.kopo.day11.Homework;

import java.util.Random;

public abstract class Figure {
	Random ran = new Random();
	private int ranNum;
	
	
	public abstract void CalArea();
	
	public int ranNum() {
		ranNum = ran.nextInt();
		return ranNum;
	}
	
	
}
