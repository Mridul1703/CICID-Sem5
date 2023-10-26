package devops.b1.sem5.lab1;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(2, 3));
		System.out.println(calc.sub(5, 1));
	}
}
