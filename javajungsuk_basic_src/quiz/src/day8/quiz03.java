package day8;

class LgTV{
	   int size;
	   LgTV(int size) { this.size = size; }
	   int getSize() { return size; }
	}

class ColorLgTV extends LgTV {
	String color;
	String resoultion;
	ColorLgTV(int size, String color, String resoultion) {
		super(size);
		this.color = color;
		this.resoultion = resoultion;
	}
	
	void info() {
		System.out.println("������ ="+size+"�÷� =" + color +"�ػ�" + resoultion);
	}
	
}
class SmartTV extends ColorLgTV{
	String remote;
	int speed;
	SmartTV(int size, String color, String resoultion,String remote, int speed) {
		super(size, color, resoultion);
		this.remote = remote;
		this.speed = speed;
		
		}
		void info() {
			System.out.println("������ ="+size+"�÷� =" + color +"�ػ�" + resoultion
					+"������" +remote + "�ӵ� "+speed);
	}
	
}

public class quiz03 {

	public static void main(String[] args) {


		ColorLgTV lg = new ColorLgTV(32, "red", "QHD");
		lg.info();
		SmartTV st = new SmartTV(42,"blue","UHD","Bluethooth",50);
		st.info();
		
	}

}
