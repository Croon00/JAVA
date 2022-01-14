package day9.com.quiz;

import java.util.Scanner;

public class quiz08_test {

	public static void main(String[] args) {

		System.out.println("Month ют╥б >>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		Mydate mydate = new Mydate(num);
		mydate.info();
	}

}
