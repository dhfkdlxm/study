package kr.ac.kopo.day11.Homework;

public class Circle extends Figure{

	private int rad;
	
	public Circle() {
	}
	public Circle(int rad) {
		this.rad = rad;
	}
	@Override
	public void CalArea() {
		
		System.out.println("반지름 "+rad+"의 원 면적은"+ ((int)Math.PI * rad * rad)+" 입니다." );
		
	}

	
}
