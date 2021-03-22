package kr.ac.kopo.day11.homework;

public class RecArea extends AreaCal{
	public RecArea() {
		pntResult();
	}
	
	@Override
	public void pntResult() {
		int hor = super.ranNum();
		int ver = super.ranNum();
		System.out.println("가로 "+hor+", 세로 "+ver+"의 직사각형 면적은"+ (hor*ver)+" 입니다." );
	}
}
