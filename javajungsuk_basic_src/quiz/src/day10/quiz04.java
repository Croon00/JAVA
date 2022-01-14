package day10;


class Battery{
	String brand;
	int capacitor;
	
}

class Rocket extends Battery{
	
}

class Duracell extends Battery{
	
}

class Energizer extends Battery{
	
}

class Duracell_AA extends Duracell{
	
}

class Energizer_AAA extends Energizer{
	
}
public class quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duracell d = new Duracell();
		if (d instanceof Battery) {
			Battery d2 = (Battery)d;
			System.out.println(" 참조변수 ? 은 ? 클래스 형태로 형변환이 완료되었습니다.");
		}
	}

}
