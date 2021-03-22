package kr.ac.kopo.day10.homework;

public class IceCream {
	private String iceName;
	private int icePrice;

	public IceCream() {

	}

	/**
	 * 아이스크림 이름, 가격 초기화 생성자
	 * @param iceName 아이스크림 이름
	 * @param icePrice 아이스크림 가격
	 */
	public IceCream(String iceName, int icePrice) {

		this.iceName = iceName;
		this.icePrice = icePrice;
	}

	/**
	 * 아이스크림 이름 가져오는 메소드
	 * @return 아이스크림 이름 리턴
	 */
	public String getName() {
		return iceName;
	}

	/**
	 * 아이스크림 가격 가져오는 메소드
	 * @return 아이스크림 가격 리턴
	 */
	public int getPrice() {
		return icePrice;
	}
}
