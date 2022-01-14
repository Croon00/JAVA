package day8;

class SuperClass{
	int x;
	int y;
	
	SuperClass(int x, int y){
		this.x = x;
		this.y = y;
		if(x>y) {
			x = 0;
		}
	}
	void title() {
		System.out.println("부모 메서드");
	}
	void sum() {
		int sum = 0;
		for(int i = x; i < y; i++) {
			sum = sum +x;
			x = x+1;
			
		}
		System.out.println("누적 합 ="+sum);

	}
	
}

class SubClass extends SuperClass{

	SubClass(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	void title() {
		// TODO Auto-generated method stub
		System.out.println("자식 메서드");
	}

	@Override
	void sum() {
		int sum = 0;
		for(int i = x; i < y; i++) {
			if(x%2==0) {
				sum = sum +x;
			}
			x = x+1;
		}
		System.out.println("누적 짝수합 ="+sum);
	}
	void sum2() {
		int sum = 0;
		for(int i = x; i < y; i++) {
			sum = sum +x;
			x = x+1;
			
		}
		System.out.println("누적 합 ="+sum);
		}
}
public class quiz08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass sub = new SubClass(5, 100);
		sub.sum();
		sub.sum2();
	}

}
