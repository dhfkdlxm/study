package kr.ac.kopo.day10.homwork;

public class SquArea extends AreaCal {
	public SquArea() {
		pntResult();
	}
	
	@Override
	public void pntResult() {
		int hor = super.ranNum();
		System.out.println("가로 "+hor+", 세로 "+hor+"의 정사각형 면적은"+ (hor*hor)+" 입니다." );
	}
	
}

