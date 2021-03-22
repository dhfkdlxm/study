package kr.ac.kopo.day11.Homework;

public class Circle extends Figure{

	@Override
	public void CalArea() {
		int rad = super.ranNum();
		System.out.println("반지름 "+rad+"의 원 면적은"+ ((int)Math.PI * rad ^ 2)+" 입니다." );
		
	}

	
}
