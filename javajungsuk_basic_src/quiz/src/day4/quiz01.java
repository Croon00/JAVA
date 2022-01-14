package day4;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
//		06. 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수가 출력되도록 프로그래밍하여라.
//		평균값을 구하는 것이 아님에 주의하라.
//
//		[ 실행 결과 ]  
//
//		정수 3개 입력 >> 
//		20 
//		100 
//		33
//
//		중간 값은 33

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력하시오");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if(num1>num2 && num1>num3 && num2>num3) {
			System.out.println("중간 값은 "+ num2);
		
		}
		else if(num1>num2 && num1>num3 && num3>num2){
			System.out.println("중간 값은 "+ num3);
		}
		else if(num2>num1 && num2>num3 && num1>num3){
			System.out.println("중간 값은 "+ num1);
		}
		else if(num2>num1 && num2>num3 && num3>num1){
			System.out.println("중간 값은 "+ num3);
		}
		else if(num3>num1 && num3>num2 && num1>num2){
			System.out.println("중간 값은 "+ num1);
		}
		else if(num3>num1 && num3>num2 && num2>num1){
			System.out.println("중간 값은 "+ num2);
		}
		
		
//		 if((a < b && b < c) || (c < b && b < a)) {
//	         System.out.print("중간 값은 " + b);
//	      }
//	      else if ((b < a && a < c)  || (c < a && a < b)) {
//	         System.out.print("중간 값은 " + a);
//	      }
//	      else {
//	         System.out.print("중간 값은 " + c);
//	      }


		
	}
	
	
	

}
