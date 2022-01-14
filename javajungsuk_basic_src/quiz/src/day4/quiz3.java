package day4;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
//		08. 아래 결과와 조건을 만족하는 사칙 연산 결과를 출력하도록 프로그래밍 하여라. 
//		 피연산자 2개와 연산자 1개를 입력받는다. 
//		 연산자는 +, -, *, /의 네 가지로 하고 피연산자는 모두 실수로 한다. 
//		 0으로 나누는 경우에는  "0으로 나눌 수 없습니다"   를 출력하고 종료한다.
//
//
//		[ 실행 결과 ]  
//		연산 입력 >> 
//		2
//		+
//		4
//
//		연산 결과 >>
//		2.0 + 4.0  =  6.0
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextInt();
		double num2 = scanner.nextInt();
		double num3;
		String operator = scanner.next();
		
		switch (operator) {
		case "+": {
			num3 = num1 + num2;
			System.out.println(num1+"+"+num2+"="+ num3);
			break;
		}
		case "-":{
			num3 = num1 - num2;
			System.out.println(num1+"-"+num2+"="+ num3);
			break;

		}
		case "/":{
			if(num2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다.");
				break;
			}
			num3 = num1 / num2;
			System.out.println(num1+"/"+num2+"="+ num3);
			break;

		}
		case "*":{
			num3 = num1 * num2;
			System.out.println(num1+"*"+num2+"="+ num3);
			break;

		}
		default:
			
		}
//	     // 기호에 따라서 분기 
//	      if(b.equals("+")) {
//	         result = a + c;
//	         System.out.print(a+b+c+" = "+result);
//	      }
//	      else if(b.equals("-")) {
//	         result = a - c;
//	         System.out.print(a+b+c+" = "+result);
//	      }
//	      else if(b.equals("*")) {
//	         result = a * c;
//	         System.out.print(a+b+c+" = "+result);
//	      }
//	      else if(b.equals("/")) {
//	         if(c==0) {
//	            System.out.print("0으로 나눌 수 없습니다.");
//	         }
//	         else {
//	            result = a / c;
//	            System.out.print(a+b+c+"의 계산 결과는 "+result);
//	         }
//
//
//	         System.out.println("\n====================");   
//
//	      }

		
		

	}

}
