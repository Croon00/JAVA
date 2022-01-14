package day11;

interface Shape {
	   final double PI = 3.14; // ���

	   void draw(); // ������ �׸��� �߻� �޼ҵ�

	   void getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�

	   default public void redraw() {   // ����Ʈ �޼ҵ�
	      System.out.print("--- �ٽ� �׸��ϴ�.");
	      draw();
	   }
	   class Rect{
		   
		   void getArea(int b) {
			   System.out.println(a +"x"+b+"ũ���� �簢�� �Դϴ�.");
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
		System.out.println("�������� "+ a*a*PI +"�� ���Դϴ�.");
	}
	
}


public class quiz03 {

	public static void main(String[] args) {
		   Shape donut = new Circle(10); // �������� 10�� �� ��ü
		   donut.redraw();
		   donut.getArea();
		   donut.redraw();
	}

}
//Shape �������̽� 
interface Shape {
final double PI = 3.14; // ���

void draw(); // ������ �׸��� �߻� �޼ҵ�

double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�

default public void redraw() {   // ����Ʈ �޼ҵ�
   System.out.print("--- �ٽ� �׸��ϴ�.");
   draw();
}

}


//class Circle implements Shape {
//
//private int radius;
//
//// ������ 
//public Circle(int radius) {
//   this.radius = radius;
//}
//
//@Override   
//public void draw() {
//   System.out.println("�������� "+radius+"�� ���Դϴ�.");
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
//// ������ 
//private int a, b;
//public Rect(int a, int b) {
//   this.a  = a;
//   this.b = b;
//}
//
//@Override   
//public void draw() {
//   System.out.println(a+"x"+b+"ũ���� �簢�� �Դϴ�.");
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
////   Shape donut = new Circle(10); // �������� 10�� �� ��ü
//   Circle donut = new Circle(10); // �������� 10�� �� ��ü
//   donut.redraw();
//   System.out.println("������ "+ donut.getArea());
//   
//   Rect rect = new Rect(12, 45);
//   rect.draw();
//   System.out.println("������ "+ rect.getArea());
//
//}
//
//}

