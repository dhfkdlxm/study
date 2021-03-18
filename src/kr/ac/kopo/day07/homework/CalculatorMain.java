package kr.ac.kopo.day07.homework;


public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int num1 = cal.getNum("정수입력 : ");
		int num2 = cal.getNum("정수입력 : ");
		cal.printCal(num1, num2);
		cal.prime_print(num1); 
		cal.prime_print(num2);
		

	}

}
