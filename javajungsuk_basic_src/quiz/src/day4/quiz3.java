package day4;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
//		08. �Ʒ� ����� ������ �����ϴ� ��Ģ ���� ����� ����ϵ��� ���α׷��� �Ͽ���. 
//		 �ǿ����� 2���� ������ 1���� �Է¹޴´�. 
//		 �����ڴ� +, -, *, /�� �� ������ �ϰ� �ǿ����ڴ� ��� �Ǽ��� �Ѵ�. 
//		 0���� ������ ��쿡��  "0���� ���� �� �����ϴ�"   �� ����ϰ� �����Ѵ�.
//
//
//		[ ���� ��� ]  
//		���� �Է� >> 
//		2
//		+
//		4
//
//		���� ��� >>
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
				System.out.println("0���δ� ���� �� �����ϴ�.");
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
//	     // ��ȣ�� ���� �б� 
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
//	            System.out.print("0���� ���� �� �����ϴ�.");
//	         }
//	         else {
//	            result = a / c;
//	            System.out.print(a+b+c+"�� ��� ����� "+result);
//	         }
//
//
//	         System.out.println("\n====================");   
//
//	      }

		
		

	}

}
