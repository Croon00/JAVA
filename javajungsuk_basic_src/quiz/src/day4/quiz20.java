package day4;

import java.util.Scanner;

public class quiz20 {

	public static void main(String[] args) {
//		20. ���ڸ��߱� ������ ���α׷����Ͽ���. 
//
//		1 �� 100 ������ ���� �ݺ������� �Է��ؼ�  
//		��ǻ�Ͱ� ������ ���� ���߸� ������ ������ .
//		����ڰ� ���� �Է��ϸ� 
//		��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش�.
//		����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ������ ������ 
//		�� �� ���� ���ڸ� ������� �˷��ش�.  
//
Scanner scanner = new Scanner(System.in);
		
		int num2 = (int)(Math.random()*100+1);
		int count =0;
		while(true) {
			System.out.println("���ڸ� �Է��Ͻÿ�");
			int num = scanner.nextInt();
			if(num2>num) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
				count++;
			}
			else if(num2<num) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
				count++;
			}
			else if(num2 == num) {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ���� ="+count);
				break;
			}
		}
	     /*

	      // 
	      int input  = 0,  answer = 0, count = 0 ;
	      // ��ǻ�Ϳ��� ������ ���� 
	      answer = (int)(Math.random() * 100 + 1); // 1~100
	      
	      Scanner scanner = new Scanner(System.in);

	      do {
	         System.out.print("1�� 100������ ������ �Է��ϼ���. >>");
	         input = scanner.nextInt();
	         count++;

	         if(input > answer) {
	            System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");   
	         } else if(input < answer) {
	            System.out.println("�� ū ���� �ٽ� �õ��غ�����.");         
	         }
	      } while(input!=answer);

	      System.out.println("�����Դϴ�.");
	      System.out.printf("�õ�Ƚ���� %d ���Դϴ�  ", count);
	      
	      */
		
//
//		[ ���� ��� ]
//
//		1 �� 100 ������ ���� �Է��ϼ��� => 50
//		�� ū ���� �Է��ϼ���.
//		1 �� 100 ������ ���� �Է��ϼ���   => 75
//		�� ū ���� �Է��ϼ���.
//		1 �� 100 ������ ���� �Է��ϼ���  => 87
//		�� ���� ���� �Է��ϼ���.
//		1 �� 100 ������ ���� �Է��ϼ���  => 80
//		�� ���� ���� �Է��ϼ���.
//		1 �� 100 ������ ���� �Է��ϼ���   => 77 
//		�� ���� ���� �Է��ϼ���.
//		1 �� 100 ������ ���� �Է��ϼ���   => 76
//		������ϴ�.
//		�õ�Ƚ���� 6 ���Դϴ�  


	}

}
