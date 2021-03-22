package kr.ac.kopo.day11.Homework;

public class Rectangular extends Figure {
	private int hor;
	private int ver;
	
	public Rectangular() {
	}
	public Rectangular(int hor, int ver) {
		this.hor =hor;
		this.ver =ver;
	}

	@Override
	public void CalArea() {
		System.out.println("가로 " + hor + ", 세로 " + ver + "의 사각형 면적은" + (hor * ver) + " 입니다.");
	}

}

