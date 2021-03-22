package kr.ac.kopo.day11.Homework;

public class Triangle extends Figure {

	@Override
	public void CalArea() {
		int hor = super.ranNum();
		int ver = super.ranNum();
		System.out.println("가로 "+hor+", 높이 "+ver+"의 삼각형 면적은"+ (hor*ver/2)+" 입니다." );
	}

}
