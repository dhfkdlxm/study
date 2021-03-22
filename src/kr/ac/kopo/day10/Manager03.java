package kr.ac.kopo.day10;

//관리자 클래스
public class Manager03 extends Employee {

	Employee[] empList; // 관리사원 목록
	
	Manager03(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade); //부모크래스의 멤버변수에 초기화!! 매개변수를 가지고 있는 생성자 호출, 생략 불가
		this.empList = empList;
	}
	
	//Override 어노테이션을 붙혀주게되면 문법체크까지해줌!
	@Override
	void info() {
		super.info();
//		System.out.println("사원번호 :" + no + ", 사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
		System.out.println("====================================================================");
		System.out.println("\t\t\t관리사원 목록");
		System.out.println("====================================================================");
		for (Employee e : empList) {
			e.info();
		}
		System.out.println("====================================================================");
	}

}
