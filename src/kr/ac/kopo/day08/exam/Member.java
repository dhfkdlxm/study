package kr.ac.kopo.day08.exam;

public class Member {
	String name;
	int age;
	String bloodType;

	// 일반(디폴트)값 (이름 : null, 나이 : 0, 혈액형 : null)
	// 일반인 사용자의 경우에는 모르기 때문에 초기값을 설정해주고 싶음
	// 생성자를 사용하여 초기값을 설정 함!
	// 생성자를 통해 초기화 해준 값 (이름 : 알 수 없음, 나이 : -1, 혈액형 : 알 수 없음)
	
	Member() {
		this("알수없음");
	}
	
	
	// 멤버변수와 지역변수를 동일하게 사용하게 되면, 지역변수 우선!
	// 가독성을 위해 파라메터 변수명을 멤버변수와 동일하게 설정홤
	// 하지만 프로그래밍 언어상 해당 변수가 멤버변수인지, 지역변수인지 구분이 불가능하기때문에
	// 구분짓는 키워드가 this임 this.변수명(멤버변수 지칭)
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	//파라메터를 두개 쓰는 놈이 3개쓰는 놈의 생성자를 호출 받고 싶을때
	//this라는 키워드를 받아서 넣어야함!
	Member(String name){
		//System.out.println(); // 사용 불가능!
		this(name, -1);  //생성자 호출 할때는 무조건 생성자내 첫번째 구문에 위치!
	}
	Member(String name, int age){
		this(name, age, "알수없음");
	}

	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);
	}
}
