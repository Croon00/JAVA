package day5;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
//		���� �̸��� �Է¹޾� �迭�� �����ϰ� ����ϵ��� ���α׷����Ͽ���.
//		( �迭 ���̴� 5�� �Ѵ�)
//
//		[ ���� ��� ] 
//		�Է� ����Ÿ 1 => ?
//		...
//		�Է� ����Ÿ 5 => ?
//
//
//		numArray[0] = ?
//		numArray[1] = ?
//		...
//		numArray[4] = ?

		Scanner scanner = new Scanner(System.in);
		
		String numArray[] = new String[5];
		for(int i = 0; i<=numArray.length-1; i++) {
			System.out.println("�Է� ������ "+i+ "=>");
			numArray[i] = scanner.next();
			
			System.out.println("numArray[" +i+ "]=" + numArray[i]);
		}
		
		  /*
	      
	      String[] fruitArray = new String[5];
	      
	      Scanner scanner = new Scanner(System.in);
	      
	      for (int i = 0; i < fruitArray.length; i++) {
	         System.out.print("\n�Է� ����Ÿ " + (i+1) + " => ");
	         fruitArray[i] = scanner.next();
	      }
	      
	      for (int i = 0; i < fruitArray.length; i++) {
	         System.out.println("fruitArray[" + i + "] = " + fruitArray[i]);
	      } */

	}

}
