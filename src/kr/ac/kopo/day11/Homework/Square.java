package kr.ac.kopo.day11.Homework;

public class Square extends Rectangular {

	@Override
	public void CalArea() {
		int ver = super.ranNum();
		System.out.println("가로 " + ver + ", 세로 " + ver + "의 직사각형 면적은" + (ver * ver) + " 입니다.");
	}

}
