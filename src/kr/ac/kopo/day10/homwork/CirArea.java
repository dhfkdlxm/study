package kr.ac.kopo.day10.homwork;

public class CirArea extends AreaCal{
	
	public CirArea() {
		pntResult();
	}
	
	@Override
	public void pntResult() {
		int rad = super.ranNum();
		System.out.println("반지름 "+rad+"의 원 면적은"+ ((int)Math.PI * rad ^ 2)+" 입니다." );
	}

}
