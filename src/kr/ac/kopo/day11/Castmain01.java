package kr.ac.kopo.day11;

public class Castmain01 {
	
//	public static void print(Child01 c) {
//		c.info();
//	}
//	public static void print(Child02 c) {
//		c.info();
//	}
	
	public static void print(Parent p) {
		p.info();
		System.out.println("p instanceof Child01 : "+(p instanceof Child01));
		System.out.println("p instanceof Child02 : "+(p instanceof Child02));
		System.out.println("p instanceof Parent : "+(p instanceof Parent));
	
//		if(p instanceof Child01) {
//			Child01 c = (Child01)p;
//			c.sleep();
//			c.study();
//		}else if(p instanceof Child02) {
//			Child02 c = (Child02)p;
//			c.sing();
//			c.play();
//		}
		
	}	
		
		
	public static void main(String[] args) {
		
		Child01 c01 = new Child01();
		c01.info();
		print(c01);
		
		Child02 c02 = new Child02();
		c02.info();
		print(c02);
		
		Parent p = new Parent();
		p.info();
		print(p);
		
		
		
		
//
//		Child01 c01 = new Child01();
//		print(c01);
//		
//		Child02 c02 = new Child02();
//		print(c02);
//		Parent p = new Parent();
//		print(p);
		
		
		
		
		
		/*
		Parent p = new Child01(); //묵시적 형변환
		System.out.println(p.name + ", " + p.age);
		p.info(); // child01에 있는 오버라이딩된 메소드를 호출!
		 *?
		/*
		 * Child01 c01 = new Child01(); System.out.println(c01.name +", " + c01.age);
		 * 
		 * Parent p = new Parent(); System.out.println(p.name+", " + p.age); p.info()
		 */
		
		
	}

}
