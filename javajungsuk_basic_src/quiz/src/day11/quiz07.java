package day11;


class Outer {
	int value=10; // Outer.this.value
	

	class Inner { // (instance inner class) �ν��Ͻ� Ŭ����
		int value=20; // this.value
		void method1() {
			int value=30; // value
			System.out.println(value);// �ڵ�1);
			System.out.println(this.value); // �ڵ�2);
			System.out.println(Outer.this.value);// �ڵ�3);
		}
	} // InnerŬ������ ��
} // OuterŬ������ ��


public class quiz07 {

	public static void main(String[] args) {
		// �ڵ�4
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method1();
		}
	}


