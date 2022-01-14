package day11;

interface Shape {
	   final double PI = 3.14; // 상수

	   void draw(); // 도형을 그리는 추상 메소드

	   void getArea(); // 도형의 면적을 리턴하는 추상 메소드

	   default public void redraw() {   // 디폴트 메소드
	      System.out.print("--- 다시 그립니다.");
	      draw();
	   }
	   class Rect{
		   
		   void getArea(int b) {
			   System.out.println(a +"x"+b+"크기의 사각형 입니다.");
		   }
	   }
	   

	}

class Circle implements Shape{
	double a;
	
	public Circle(int a) {
		this.a = a;
	}

	@Override
	public void draw() {
		
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("반지름이 "+ a*a*PI +"인 원입니다.");
	}
	
}


public class quiz03 {

	public static void main(String[] args) {
		   Shape donut = new Circle(10); // 반지름이 10인 원 객체
		   donut.redraw();
		   donut.getArea();
		   donut.redraw();
	}

}
//Shape 인터페이스 
interface Shape {
final double PI = 3.14; // 상수

void draw(); // 도형을 그리는 추상 메소드

double getArea(); // 도형의 면적을 리턴하는 추상 메소드

default public void redraw() {   // 디폴트 메소드
   System.out.print("--- 다시 그립니다.");
   draw();
}

}


//class Circle implements Shape {
//
//private int radius;
//
//// 생성자 
//public Circle(int radius) {
//   this.radius = radius;
//}
//
//@Override   
//public void draw() {
//   System.out.println("반지름이 "+radius+"인 원입니다.");
//}
//
//@Override   
//public double getArea() {
//   return PI*radius*radius;
//}
//}
//
//
//class Rect implements Shape {
//// 생성자 
//private int a, b;
//public Rect(int a, int b) {
//   this.a  = a;
//   this.b = b;
//}
//
//@Override   
//public void draw() {
//   System.out.println(a+"x"+b+"크기의 사각형 입니다.");
//}
//
//@Override   
//public double getArea() {
//   return a*b;
//}
//}
//
//
//public class Quiz10_03 {
//
//public static void main(String[] args) {
////   Shape donut = new Circle(10); // 반지름이 10인 원 객체
//   Circle donut = new Circle(10); // 반지름이 10인 원 객체
//   donut.redraw();
//   System.out.println("면적은 "+ donut.getArea());
//   
//   Rect rect = new Rect(12, 45);
//   rect.draw();
//   System.out.println("면적은 "+ rect.getArea());
//
//}
//
//}

