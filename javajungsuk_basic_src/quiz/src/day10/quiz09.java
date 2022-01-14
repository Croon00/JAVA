package day10;

import java.util.Scanner;

abstract class Calc{
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}
class Add extends Calc{


	@Override
	int calculate() {
		
		return a +b;
	}
	
}

class Sub extends Calc{

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return super.a - super.b;
	}
	
}

class Mul extends Calc{

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return super.a * super.b;
	}
	
}

class Div extends Calc{

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return super.a / super.b;
	}
	
}
public class quiz09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하시오");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String c = scanner.next();
		if(c.equals("+")) {
			Add ad = new Add();
			ad.setValue(a, b);
			ad.calculate();
		}
		else if(c.equals("-")) {
			Sub sb = new Sub();
			sb.setValue(a, b);
			sb.calculate();
		}
		else if(c.equals("*")) {
			Mul ml = new Mul();
			ml.setValue(a, b);
			ml.calculate();
		}
		else if(c.equals("/")) {
			Div dv = new Div();
			dv.setValue(a, b);
			dv.calculate();
		}
	}

}
