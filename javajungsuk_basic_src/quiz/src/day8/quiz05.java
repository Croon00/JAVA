package day8;
class PointXY {
	int x; 
	int y;
	
	PointXY() {}
	
	PointXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void info_a() {
		System.out.println("xÁÂÇ¥ :" + "yÁÂÇ¥ :");
	}
}

class Figure1 {
	String squre;
	int extent;
	int width;
	int height;
	PointXY point = new PointXY();
	
	Figure1(){}
	Figure1(String squre, int x, int y, int width, int height){
		this.squre = squre;
		point.x = x;
		point.y = y;
	}
	
}
class Figure2 extends PointXY  {
	String squre2;
	int extent;
	int radius;
	
	Figure2(){}
	Figure2(String squre2, int x, int y, int radius){
		super(x, y);
		this.squre2 = squre2;
	}
	
}

public class quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
