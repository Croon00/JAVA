package day11;


class Outer {
	int value=10; // Outer.this.value
	

	class Inner { // (instance inner class) 인스턴스 클래스
		int value=20; // this.value
		void method1() {
			int value=30; // value
			System.out.println(value);// 코딩1);
			System.out.println(this.value); // 코딩2);
			System.out.println(Outer.this.value);// 코딩3);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝


public class quiz07 {

	public static void main(String[] args) {
		// 코딩4
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method1();
		}
	}


