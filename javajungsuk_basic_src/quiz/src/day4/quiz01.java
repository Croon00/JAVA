package day4;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
//		06. ���� 3���� �Է¹ް� 3���� ���� �� �߰� ũ���� ���� ��µǵ��� ���α׷����Ͽ���.
//		��հ��� ���ϴ� ���� �ƴԿ� �����϶�.
//
//		[ ���� ��� ]  
//
//		���� 3�� �Է� >> 
//		20 
//		100 
//		33
//
//		�߰� ���� 33

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��Ͻÿ�");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if(num1>num2 && num1>num3 && num2>num3) {
			System.out.println("�߰� ���� "+ num2);
		
		}
		else if(num1>num2 && num1>num3 && num3>num2){
			System.out.println("�߰� ���� "+ num3);
		}
		else if(num2>num1 && num2>num3 && num1>num3){
			System.out.println("�߰� ���� "+ num1);
		}
		else if(num2>num1 && num2>num3 && num3>num1){
			System.out.println("�߰� ���� "+ num3);
		}
		else if(num3>num1 && num3>num2 && num1>num2){
			System.out.println("�߰� ���� "+ num1);
		}
		else if(num3>num1 && num3>num2 && num2>num1){
			System.out.println("�߰� ���� "+ num2);
		}
		
		
//		 if((a < b && b < c) || (c < b && b < a)) {
//	         System.out.print("�߰� ���� " + b);
//	      }
//	      else if ((b < a && a < c)  || (c < a && a < b)) {
//	         System.out.print("�߰� ���� " + a);
//	      }
//	      else {
//	         System.out.print("�߰� ���� " + c);
//	      }


		
	}
	
	
	

}
