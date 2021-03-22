package kr.ac.kopo.day11.homework;

public class TriArea extends AreaCal {
	public TriArea() {
		pntResult();
	}
	

	@Override
	public void pntResult() {
		int hor = super.ranNum();
		int ver = super.ranNum();
		System.out.println("가로 "+hor+", 높이 "+ver+"의 삼각형 면적은"+ (hor*ver/2)+" 입니다." );
	}
}
