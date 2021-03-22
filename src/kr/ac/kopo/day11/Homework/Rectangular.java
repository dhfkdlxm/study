package kr.ac.kopo.day11.Homework;

public class Rectangular extends Figure {

	@Override
	public void CalArea() {
		int hor = super.ranNum();
		int ver = super.ranNum();
		System.out.println("가로 " + hor + ", 세로 " + ver + "의 직사각형 면적은" + (hor * ver) + " 입니다.");
	}

}
