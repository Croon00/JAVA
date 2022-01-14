package day8;
class Car{
	String name;
	int displacement;
	Car(String name, int displacement){
		this.name = name;
		this.displacement = displacement;
		
	}
	void craction() {
		System.out.println("¶ì¶ì");
	}
}

class Truck extends Car {
	int overload;
	Truck(String name, int displacement, int overload) {
		super(name, displacement);
		this.overload = overload;
	}
	@Override
	void craction() {
		System.out.println("»§»§");
	}
	void skill() {
		System.out.println("Áü½Æ±â");
	}

	
	
}

class SportsCar extends Car{
	int speed;
	SportsCar(String name, int displacement, int speed) {
		super(name, displacement);
		this.speed = speed;
	}
	@Override
	void craction() {
		System.out.println("»Ñ¿Í¾Ó–Ø¾Ó!!!");
	}
	void skill() {
		System.out.println("µå¶óÀÌºê ÇÏ±â");
	}

	
}

public class quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("±â¾Æ",1500);
		Truck truck = new Truck("º¼º¸", 5000, 3000);
		SportsCar spcar = new SportsCar("¶÷º¸¸£±â´Ï", 3500, 500);
		
		car.craction();
		truck.craction();
		spcar.craction();
		truck.skill();
		spcar.skill();
	}

}
