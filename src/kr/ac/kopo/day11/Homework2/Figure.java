package kr.ac.kopo.day11.Homework2;

public abstract class Figure {
	private int ranNum;

	public Figure() {

	}

	public Figure(int ranNum) {
		this.ranNum   = ranNum;
	}
	
	public abstract void CalArea();
	
}
