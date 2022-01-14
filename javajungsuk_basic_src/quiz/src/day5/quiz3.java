package day5;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
//		과일 이름을 입력받아 배열을 생성하고 출력하도록 프로그래밍하여라.
//		( 배열 길이는 5로 한다)
//
//		[ 실행 결과 ] 
//		입력 데이타 1 => ?
//		...
//		입력 데이타 5 => ?
//
//
//		numArray[0] = ?
//		numArray[1] = ?
//		...
//		numArray[4] = ?

		Scanner scanner = new Scanner(System.in);
		
		String numArray[] = new String[5];
		for(int i = 0; i<=numArray.length-1; i++) {
			System.out.println("입력 데이터 "+i+ "=>");
			numArray[i] = scanner.next();
			
			System.out.println("numArray[" +i+ "]=" + numArray[i]);
		}
		
		  /*
	      
	      String[] fruitArray = new String[5];
	      
	      Scanner scanner = new Scanner(System.in);
	      
	      for (int i = 0; i < fruitArray.length; i++) {
	         System.out.print("\n입력 데이타 " + (i+1) + " => ");
	         fruitArray[i] = scanner.next();
	      }
	      
	      for (int i = 0; i < fruitArray.length; i++) {
	         System.out.println("fruitArray[" + i + "] = " + fruitArray[i]);
	      } */

	}

}
