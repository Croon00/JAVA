package day8;
class Car{
	String name;
	int displacement;
	Car(String name, int displacement){
		this.name = name;
		this.displacement = displacement;
		
	}
	void craction() {
		System.out.println("���");
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
		System.out.println("����");
	}
	void skill() {
		System.out.println("���Ʊ�");
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
		System.out.println("�ѿ;Ӗؾ�!!!");
	}
	void skill() {
		System.out.println("����̺� �ϱ�");
	}

	
}

public class quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("���",1500);
		Truck truck = new Truck("����", 5000, 3000);
		SportsCar spcar = new SportsCar("���������", 3500, 500);
		
		car.craction();
		truck.craction();
		spcar.craction();
		truck.skill();
		spcar.skill();
	}

}
