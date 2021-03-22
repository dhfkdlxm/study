package kr.ac.kopo.day11.Homework2;

public class Triangle extends Figure {

	int hor;
	int ver;
	public Triangle() {
	}
	
	public Triangle(int hor, int ver) {
		CalArea cal = new CalArea();
		
		
	}
	
	
	@Override
	public void CalArea() {

		System.out.println("가로 "+hor+", 높이 "+ver+"의 삼각형 면적은"+ (hor*ver/2)+" 입니다." );
	}


}
