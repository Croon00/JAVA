package day4;

import java.util.Scanner;

public class quiz17 {

	public static void main(String[] args) {
//		17.  �Է¹��� ������ �� �ڸ��� ���� ��µǵ��� ���α׷��� �Ͽ���. 
//
//		[ ���� ��� ]
//
//		���ڸ� �Է��ϼ��� ....   1234
//
//		1 + 2 + 3 + 4 = 10

		  int num = 0, sum = 0;
	      System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");

	      Scanner scanner = new Scanner(System.in);
	      num = scanner.nextInt();      

	      while(num!=0) {    
	         // num�� 10���� ���� �������� sum�� ����
	         sum += num%10;    // sum = sum + num%10;
	         System.out.printf("sum=%3d num=%d%n", sum, num);

	         num /= 10;   // num = num / 10;  num�� 10���� ���� ���� �ٽ� num�� ����
	      }

	      System.out.println("�� �ڸ����� ��:"+sum);




	}

}
