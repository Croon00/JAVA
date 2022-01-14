package day7;

import java.util.Scanner;

class Country{
	String Cname;
	String Continent;
	int population;
	
	Country(String Cname, String Continent, int population){
		this.Cname = Cname;
		this.Continent = Continent;
		this.population = population;
	}
	void info() {
		System.out.println(Cname + Continent + population);
	}
}

public class quiz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("생성할 국가 숫자 입력 :");
		int num = scanner.nextInt();
		Country country [] = new Country[num];
		
		for(int i = 0; i < country.length; i++) {
			System.out.println("======객체 데이터 입력======");
			System.out.println("나라명");
			String name = scanner.next();
			System.out.println("대륙명");
			String countinent = scanner.next();
			System.out.println("인구");
			int population = scanner.nextInt();
			country[i] = new Country (name, countinent, population);
		}
		for(int i = 0; i < country.length; i++) {
			country[i].info();
		}
	}

}
